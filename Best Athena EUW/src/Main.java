import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int casos = 0;
        int f = 0;
        int c = 0;
        int[][] matriu;
        int[] coordenades = new int[2];
        int[] respostes;

        //Inici escàner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        casos = lector.nextInt(); //llegim el número de casos
        respostes = new int[casos]; //Declarem respostes segons el valor de casos
        //Bucle per fer segons el valor de casos
        for (int i=0; i<casos; i++) {
            f = lector.nextInt(); c = lector.nextInt(); //llegim el num de files i columnes
            matriu = new int[f][c]; //declarem la matriu segons el valor de f i de c
            //Bucle per llegir la matriu
            for (int j=0; j<f; j++) {
                for (int k=0; k<c; k++) {
                    matriu[j][k] = lector.nextInt();
                }
            }
            //Bucle per llegir el vector coordenades
            for (int j=0; j<2; j++) {
                coordenades[j]=lector.nextInt();
            }
            //If per treure el cas en el qual no salti sobre cap aliat athena
            //A partir d'aquí plantejem la resta de casos
            if (matriu[coordenades[0]][coordenades[1]]!=1) {
                respostes[i] = -1;
            } else {
                //Bucle per recorrer matriu al voltant d'athena
                for (int j=coordenades[0]-1; j<3; j++) {
                    if (j>=0 && j< matriu.length) { //Descartem possibles arrayoutofbounds
                        for (int k=coordenades[1]-1; k<3; k++) {
                            if (k>=0 && k< matriu.length) { //Descartem possibles arrayoutofbounds
                                //Si trobem un enemic, el sumem al compte de l'array respostes
                                if (matriu[j][k]==2) {
                                    respostes[i]++;
                                }
                            }
                        }
                    }
                }
            }
        }
        //Bucle per imprimir l'array respostes
        for (int i=0; i<casos; i++) {
            System.out.println(respostes[i]);
        }
    }
}