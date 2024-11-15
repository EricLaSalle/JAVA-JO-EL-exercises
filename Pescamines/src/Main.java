import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int casos = 0;
        int l = 0;
        int f = 0;
        int c = 0;
        int[][] matriu;
        int x = 0;
        int y = 0;
        int[] respostes;
        int comptador=0;
        boolean[] boom;

        //Inici escaner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        casos = lector.nextInt(); //llegim la variable casos
        respostes = new int[casos]; //Declarem respostes segons el valor de casos
        boom = new boolean[casos]; //Declarem boom segons el valor de casos
        //Bucle per fer segons el num de casos indicats
        for (int i = 0; i < casos; i++) {
            comptador=0; //Reiniciem variable
            l = lector.nextInt(); f = lector.nextInt(); c = lector.nextInt();
            matriu = new int[f][c]; //Decalrem matriu segons el valor de f i de c
            //Bucle per llegir la matriu
            for (int j = 0; j < f; j++) {
                for (int k = 0; k < c; k++) {
                    matriu[j][k] = lector.nextInt();
                }
            }
            x = lector.nextInt(); y = lector.nextInt();
            if (matriu[x][y] == 1) {
                boom[i] = true;
            } else {
                for (int j=0; j<f; j++) {
                    for (int k = 0; k < c; k++) {
                        if (j==x-1) {
                            if (k==y-1 || k==y || k==y+1) {
                                if (matriu[j][k]==1) {
                                    comptador++;
                                }
                            }
                        } else if (j==x) {
                            if (k==y-1|| k==y+1) {
                                if (matriu[j][k]==1) {
                                    comptador++;
                                }
                            }
                        } else if (j==x+1) {
                            if (k==y-1 || k==y || k==y+1) {
                                if (matriu[j][k]==1) {
                                    comptador++;
                                }
                            }
                        }
                    }
                }
                respostes[i] = comptador;
            }
        }
        //Bucle per imprimir respostes
        for (int i = 0; i < casos; i++) {
            if (boom[i]) {
                System.out.println("BOOM");
            } else {
                System.out.println(respostes[i]);
            }
        }

    }
}