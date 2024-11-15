import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int casos = 0;
        int f = 0;
        int c = 0;
        int k = 0;
        boolean OK = false;
        int[][] matriu;
        String[] respostes;

        //Inici escàner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        casos = lector.nextInt();
        respostes = new String[casos]; //Declarem respostes segons el valor de casos
        //Bucle per repetir segons el valor de casos
        for (int i = 0; i < casos; i++) {
            OK = false; //Reinici de variable
            f = lector.nextInt(); c = lector.nextInt(); k = lector.nextInt();
            matriu = new int[f][c]; //Declarem matriu segons el valor de f i c
            //Bucle per repetir fins llegir la matriu
            for (int j = 0; j < f; j++) {
                for (int l=0; l<c; l++) {
                    matriu[j][l] = lector.nextInt();
                }
            }
            //Bucle per recorrer l'array en busca de bassals que no estiguin connectats
            for (int j = 0; j < f; j++) {
                for (int l=0; l<c; l++) {
                    //If per si trobem un 1
                    if (matriu[j][l] == 1) {
                        OK = false; //Reinici de variable
                        //Bucle per comprovar les posicions verticals
                        for (int m=j-1; m<j+3; m++) {
                            //if per comprovar que seguim dins de la matriu
                            if (m>=0 && m<f) {
                                //if per saltar-nos el bassal que estem comprovant
                                if (m!=j) {
                                    //if per comprovar si el bassal no està aïllat
                                    if (matriu[m][l] == 1) {
                                        OK = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (!OK) {
                            //Bucle per comprovar les posicions horitzontals
                            for (int m=l-1; m<l+3; m++) {
                                //if per comprovar que seguim dins de la matriu
                                if (m>=0 && m<c) {
                                    //if per saltar-nos el bassal que estem comprovant
                                    if (m!=l) {
                                        //if per comprovar si el bassal no està aïllat
                                        if (matriu[j][m] == 1) {
                                            OK = true;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (!OK) {
                            break;
                        }
                    }
                }
                if (!OK) {
                    break;
                }
            }
            //If else per guardar la resposta segons el boolean OK
            if (OK) {
                respostes[i] = "OK";
            } else {
                respostes[i] = "DISCOTHEQUE, DISCOTHEQUE";
            }
        }
        //Bucle per imprimir array respostes
        for (int i = 0; i < casos; i++) {
            System.out.println(respostes[i]);
        }
    }
}