import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int casos = 0;
        int F = 0;
        int C = 0;
        int comptador = 0;
        boolean disparar = false;
        int[][] matriu;
        int[] posicio_pollo = new int[2];
        String[] respostes;
        
        //Inici escàner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        casos = lector.nextInt();
        respostes = new String[casos]; //Declarem respostes segons valor de casos
        //Bucle per fer segons valor de casos
        for (int i = 0; i < casos; i++) {
            comptador = 0; //Reinici de variable
            disparar = false; //Reinici de variable
            F = lector.nextInt(); C = lector.nextInt(); //Llegim F i C
            matriu = new int[F][C]; //Declarem matriu segons F i C
            //Bucle per llegir matriu
            for (int j = 0; j < F; j++) {
                for (int k = 0; k < C; k++) {
                    matriu[j][k] = lector.nextInt();
                    if (matriu[j][k] == 2) {
                        posicio_pollo[0] = j;
                        posicio_pollo[1] = k;
                    }
                }
            }
            //Bucle per recorrer la matriu en busca d'enemics
            for (int j=posicio_pollo[0]-2; j<posicio_pollo[0]+3; j++) {
                //if per seguir dins de la matriu
                if (j>=0 && j<F) {
                    for (int k=posicio_pollo[1]-2; k<posicio_pollo[1]+3; k++) {
                        //if per seguir dins de la matriu
                        if (k>=0 && k<C) {
                            //If per veure si hi ha un enemic
                            if (matriu[j][k] == 1) {
                                //Sumem 1 al comptador fins arribar a 3
                                comptador++;
                                if (comptador>3) {
                                    disparar = true;
                                }
                            }
                        }
                        if (disparar) {
                            break;
                        }
                    }
                    if (disparar) {
                        break;
                    }
                }
            }
            //Guardem a resposta SI o NO depenent del boolean disparar
            if (disparar) {
                respostes[i] = "SI";
            } else {
                respostes[i] = "NO";
            }
        }
        //Bucle per imprimir array respostes
        for (int i = 0; i < casos; i++) {
            System.out.println(respostes[i]);
        }
    }
}