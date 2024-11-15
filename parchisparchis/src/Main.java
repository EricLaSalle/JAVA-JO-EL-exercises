import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inicialització variables
        int casos = 0;
        int posicio = 0;
        int[] tirades = new int[3];
        //Inicialització escaner
        Scanner lector = new Scanner(System.in);
        //Inici programa
        casos = lector.nextInt();
        int[] resultats = new int[casos]; //array per guardar i imprimir resultats
        //Bucle per repetir segons el num de casos
        for (int i=0; i<casos; i++) {
            posicio = lector.nextInt();
            //Bucle per llegir l'array
            for (int j=0; j<3; j++) {
                tirades[j] = lector.nextInt();
            }
            //Bucle per recorrer l'array i anar buscant el 8 o sumant la posició
            for (int j=0; j<3; j++) {
                //Si la posicio es igual a 8, ja s'acaba el cas
                if (tirades[j]+posicio == 8) {
                    resultats[i]=8;
                    break;
                    //Si la posició es >8, reiniciem en un número entre 0 i 7 segons la tirada
                } else if (tirades[j]+posicio > 8) {
                    posicio = 8-(tirades[j]+posicio-8);
                } else if (tirades[j]+posicio < 8) {
                    posicio = tirades[j]+posicio;
                }
            }
            //if per guardar el resultat
            if (resultats[i]!=8) {
                resultats[i]=posicio;
            } else {
                resultats[i] = 8;
            }
        }
        for (int i=0; i<casos; i++) {
            System.out.println(resultats[i] + " ");
        }
    }
}