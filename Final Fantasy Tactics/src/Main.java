import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaració variables
        int casos;
        int F;
        int C;
        int X;
        int Y;
        int num_mov;
        int[] respostes;

        //Inici escàner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        casos = lector.nextInt(); //llegim casos
        respostes = new int[casos]; //Iniciem respostes segons el valor de casos

        //Fem un for per repetir segons el valor de casos
        for (int i = 0; i < casos; i++) {
            //Llegim variables
            F = lector.nextInt();
            C = lector.nextInt(); //Llegim dimensions de la matriu
            X = lector.nextInt();
            Y = lector.nextInt(); //Llegim possició del personatge
            num_mov = lector.nextInt(); //Llegim el número de moviments del personatge

            respostes[i] = calcul_resposta(F, C, X, Y, num_mov);
        }

        //For per imprimir respostes
        for (int i = 0; i < casos; i++) {
            System.out.println(respostes[i]);
        }
    }

    //Funció càlcul de resposta
    private static int calcul_resposta(int F, int C, int X, int Y, int num_mov) {
        //Declaració variables
        int moviments;
        int[][] taula_movs = new int[num_mov * 2 + 1][num_mov * 2 + 1]; //Creem una taula on guardar els moviments possibles+

        //Inici funció
        taula_movs = omplir_taula(taula_movs, num_mov, X, C, Y, F); //Omplim la taula de moviments possibles
        moviments = calcul_num_mov(taula_movs, C, F);
        return moviments;
    }

    //Funció per omplir taula_movs
    private static int[][] omplir_taula(int[][] taula, int num_mov, int X, int C, int Y, int F) {
        //Declaració variables
        int centre = num_mov; //El centre de la taula és igual al número de moviments disponibles

        //Inici funció
        //Doble for per recorrer la matriu i canviar-la per "1" quan pertoqui
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                //Si la suma de les diferències de "i" i "j" menys el número de moviments és igual o més petit al centre
                if (Math.abs(i - num_mov) + Math.abs(j - num_mov) <= centre) {
                    taula[i][j] = 1;
                }
            }
        }

        //Bucle per anar comprovant les columnes de darrera i davant la posició
        for (int i = num_mov; i > 0; i--) {
            if (X - i < 0 || X + i > C - 1) {
                if (X - i < 0) {
                    //Bucle per convertir la columna de taula_movs a 0
                    for (int j = 0; j < taula.length; j++) {
                        taula[j][num_mov - i] = 0;
                    }
                }
                if (X + i > C - 1) {
                    //Bucle per convertir la columna de taula_movs a 0
                    for (int j = 0; j < taula.length; j++) {
                        taula[j][num_mov + i] = 0;
                    }
                }
            } else {
                break;
            }
        }

        //Bucle per anar comprovant les files de darrera i davant la posició
        for (int i=num_mov; i>0; i--) {
            if (Y - i < 0 || Y + i > C - 1) {
                if (Y - i < 0) {
                    //Bucle per convertir la columna de taula_movs a 0
                    for (int j = 0; j < taula.length; j++) {
                        taula[num_mov-i][j] = 0;
                    }
                }
                if (Y + i > F - 1) {
                    //Bucle per convertir la columna de taula_movs a 0
                    for (int j = 0; j < taula.length; j++) {
                        taula[num_mov+i][j] = 0;
                    }
                }
            } else {
                break;
            }
        }

        return taula;
    }

    //Funció per calcular el número de moviments
    private static int calcul_num_mov(int[][] taula, int C, int F) {
        //Declaració variables
        int moviments=0;

        //Inici funció
        //Doble for per recorrer la matriu de moviments possibles
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                if (taula[i][j] == 1) {
                    moviments++;
                }
            }
        }
        return moviments;
    }
}