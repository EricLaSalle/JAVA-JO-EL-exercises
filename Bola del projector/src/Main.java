import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int casos = 0;
        int n = 0;
        int k = 0;
        int suma = 0;
        boolean SI = false;
        int[] array_k;
        String[] respostes;

        //Inici escaner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        casos = lector.nextInt();
        respostes = new String[casos]; //Declarem respostes segons el valor de casos
        //Bucle per fer segons el valor de casos
        for (int i = 0; i < casos; i++) {
            SI = false; //Reinici de variable
            suma = 0; //Reinici de variable
            n = lector.nextInt(); k = lector.nextInt();
            array_k = new int[k]; //Declarem array_k segons el valor de k
            //Bucle per llegir k
            for (int j = 0; j < k; j++) {
                array_k[j] = lector.nextInt();
            }
            //Bucle per recorrer l'array sumant tots els valor possibles fins que doni exactament n
            //Primer bucle per mirar cada posició
            for (int j = 0; j < k; j++) {
                suma = 0; //reinici de variable //Reiniciem variable
                //If-else per comprobar que la pròpia posició no sigui ja el valor buscat
                if (array_k[j] == n) {
                    SI = true;
                    break;
                } else {
                    suma = array_k[j]; //igualem la suma a la posicio concreta de l'array cada vegada que es reinicia el bucle
                    //Bucle per saltar de posició quan des d'aquella no dona
                    for (int m = j+1; m<k; m++) {
                        suma = array_k[j]; //igualem de nou la posicio concreta de l'array
                        //Bucle per
                        for (int l = m; l < k; l++) {
                            suma += array_k[l];
                            if (suma == n) {
                                SI = true;
                                break;
                            } else if (suma>n) {
                                suma-=array_k[l];
                            }
                        }
                    }
                }
                if (SI) {
                    break;
                }
            }
            //if else per guardar la resposta a l'array respostes (incloent que quan n=0, també es sí)
            if (SI || n==0) {
                respostes[i]="SI";
            } else {
                respostes[i]="NO";
            }
        }
        //Bucle per imprimir array resppostes
        for (int i = 0; i < casos; i++) {
            System.out.println(respostes[i]);
        }
    }
}