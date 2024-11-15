import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int casos = 0;
        int files = 0;
        int columnes = 0;
        int resposta_prov = 0;
        int[][] matriu1;
        int[][] matriu2;
        int[] respostes;

        //inici escaner
        Scanner sc = new Scanner(System.in);

        //Inici programa
        casos = sc.nextInt(); //llegim casos
        respostes = new int[casos]; //declarem respostes segons valor de casos
        //for per fer segons el valor de casos
        for (int i = 0; i < casos; i++) {
            resposta_prov = 0; //Reinici variable
            files = sc.nextInt(); columnes = sc.nextInt(); //llegim files i columnes
            matriu1 = new int[files][columnes]; //declarem la matriu1 segons el valor de files i columnes
            matriu2 = new int[files][columnes]; //declarem la matriu2 segons el valor de files i columnes
            //for per llegir la matriu
            for (int j = 0; j < files; j++) {
                for (int k = 0; k < columnes; k++) {
                    matriu1[j][k] = sc.nextInt();
                    matriu2[j][k] = matriu1[j][k]; //Guardem una matriu de reserva
                }
            }
            //for en busca de 3 1s de manera horitzontal, canviant el seu valor a 0 en cas de trobar-los
            for (int j = 0; j < files; j++) {
                for (int k = 0; k < columnes; k++) {
                    if (k>0 && k<columnes-1) {
                        if (matriu1[j][k]==1 && matriu1[j][k-1]==1 && matriu1[j][k+1]==1) {
                            respostes[i]++;
                            matriu1[j][k] = 0;
                            matriu1[j][k-1] = 0;
                            matriu1[j][k+1] = 0;
                        }
                    }
                }
            }
            //for en busca de 3 1s de manera vertical, canviant el seu valor a 0 en cas de trobar-los
            for (int j = 0; j < files; j++) {
                for (int k = 0; k < columnes; k++) {
                    if (j>0 && j<files-1) {
                        if (matriu1[j][k]==1 && matriu1[j-1][k]==1 && matriu1[j+1][k]==1) {
                            respostes[i]++;
                            matriu1[j][k] = 0;
                            matriu1[j-1][k] = 0;
                            matriu1[j+1][k] = 0;
                        }
                    }
                }
            }
            //for en busca de 3 1s de manera diagonal de dalt a baix, canviant el seu valor a 0 en cas de trobar-los
            for (int j = 0; j < files; j++) {
                for (int k = 0; k < columnes; k++) {
                    if (k>0 && k<columnes-1 && j>0 && j<files-1) {
                        if (matriu1[j][k]==1 && matriu1[j-1][k-1]==1 && matriu1[j+1][k+1]==1) {
                            respostes[i]++;
                            matriu1[j][k] = 0;
                            matriu1[j-1][k-1] = 0;
                            matriu1[j+1][k+1] = 0;
                        }
                    }
                }
            }
            //for en busca de 3 1s de manera diagonal de baix a dalt, canviant el seu valor a 0 en cas de trobar-los
            for (int j = 0; j < files; j++) {
                for (int k = 0; k < columnes; k++) {
                    if (k>0 && k<columnes-1 && j>0 && j<files-1) {
                        if (matriu1[j][k]==1 && matriu1[j+1][k-1]==1 && matriu1[j-1][k+1]==1) {
                            respostes[i]++;
                            matriu1[j][k] = 0;
                            matriu1[j+1][k-1] = 0;
                            matriu1[j-1][k+1] = 0;
                        }
                    }
                }
            }
            //Fem el mateix pero buscant primer els verticals per despres comparar.
            //for en busca de 3 1s de manera vertical, canviant el seu valor a 0 en cas de trobar-los
            for (int j = 0; j < files; j++) {
                for (int k = 0; k < columnes; k++) {
                    if (j>0 && j<files-1) {
                        if (matriu2[j][k]==1 && matriu2[j-1][k]==1 && matriu2[j+1][k]==1) {
                            resposta_prov++;
                            matriu2[j][k] = 0;
                            matriu2[j-1][k] = 0;
                            matriu2[j+1][k] = 0;
                        }
                    }
                }
            }
            //for en busca de 3 1s de manera horitzontal, canviant el seu valor a 0 en cas de trobar-los
            for (int j = 0; j < files; j++) {
                for (int k = 0; k < columnes; k++) {
                    if (k>0 && k<columnes-1) {
                        if (matriu2[j][k]==1 && matriu2[j][k-1]==1 && matriu2[j][k+1]==1) {
                            resposta_prov++;
                            matriu2[j][k] = 0;
                            matriu2[j][k-1] = 0;
                            matriu2[j][k+1] = 0;
                        }
                    }
                }
            }
            //for en busca de 3 1s de manera diagonal de dalt a baix, canviant el seu valor a 0 en cas de trobar-los
            for (int j = 0; j < files; j++) {
                for (int k = 0; k < columnes; k++) {
                    if (k>0 && k<columnes-1 && j>0 && j<files-1) {
                        if (matriu2[j][k]==1 && matriu2[j-1][k-1]==1 && matriu2[j+1][k+1]==1) {
                            resposta_prov++;
                            matriu2[j][k] = 0;
                            matriu2[j-1][k-1] = 0;
                            matriu2[j+1][k+1] = 0;
                        }
                    }
                }
            }
            //for en busca de 3 1s de manera diagonal de baix a dalt, canviant el seu valor a 0 en cas de trobar-los
            for (int j = 0; j < files; j++) {
                for (int k = 0; k < columnes; k++) {
                    if (k>0 && k<columnes-1 && j>0 && j<files-1) {
                        if (matriu2[j][k]==1 && matriu2[j+1][k-1]==1 && matriu2[j-1][k+1]==1) {
                            resposta_prov++;
                            matriu2[j][k] = 0;
                            matriu2[j+1][k-1] = 0;
                            matriu2[j-1][k+1] = 0;
                        }
                    }
                }
            }
            if (resposta_prov>respostes[i]) {
                respostes[i] = resposta_prov;
            }
        }
        //for per imprimir el vector respostes
        for (int i = 0; i < casos; i++) {
            System.out.println(respostes[i]);
        }
    }
}