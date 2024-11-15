import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int casos = 0;
        int f = 3;
        int c = 3;
        int k = 1;
        int x = 0;
        int y = 0;
        int[] posicio_blau = new int[2];
        String[] respostes;
        int[][] matriu;
        boolean this_is_fine = false;

        //Inici escaner
        Scanner sc = new Scanner(System.in);

        //Inici programa
        casos = sc.nextInt();
        respostes = new String[casos]; //Declarem array respostes segons valor de casos
        //Bucle per fer segons casos
        for (int i = 0; i < casos; i++) {
            this_is_fine = false; //Reinici de variable
            f = sc.nextInt(); c = sc.nextInt(); k = sc.nextInt(); //llegim files, columnes i num fantasmes
            if (f>=3 && c>=3 && k>=1) {
                matriu = new int[f][c];
                //Bucle per llegir x i y i anar guardant les posicions a la matriu
                for (int j = 0; j < k; j++) {
                    x = sc.nextInt(); y = sc.nextInt();
                    //If per diferenciar al fantasma blau i guardar la seva posició
                    if (j==0) {
                        matriu[x][y] = 2;
                        posicio_blau[0] = x;
                        posicio_blau[1] = y;
                    } else {
                        matriu[x][y] = 1;
                    }
                }
                //Bucle per recorrer la matriu i veure si la posició del fantasma blau està rodejada d'1
                for (int j=posicio_blau[0]-1; j<posicio_blau[0]+2; j++) {
                    //if per seguir dins de la matriu i no contant les parets
                    if (j >= 1 && j < f-1) {
                        if (matriu[j][posicio_blau[1]] == 0) {
                            this_is_fine = true;
                            break;
                        }
                    }
                }
                if (this_is_fine) {
                    respostes[i] = "THIS IS FINE";
                } else {
                    for (int j=posicio_blau[1]-1; j<posicio_blau[1]+2; j++) {
                        //if per seguir dins de la matriu i no contant les parets
                        if (j >= 1 && j < c-1) {
                            if (matriu[posicio_blau[0]][j] == 0) {
                                this_is_fine = true;
                                break;
                            }
                        }
                    }
                }
                if (this_is_fine) {
                    respostes[i] = "THIS IS FINE";
                } else {
                    respostes[i] = "OH NO";
                }
            } else {
                continue;
            }
        }
        //Bucle per imprimir vector respostes
        for (int i=0; i<casos; i++) {
            System.out.println(respostes[i]);
        }
    }
}