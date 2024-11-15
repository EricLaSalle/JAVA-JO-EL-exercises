import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int casos=0;
        int[] numero;

        //Inici escaner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        casos = lector.nextInt(); //llegim el num de casos
        numero = new int[casos]; //declarem vector numero segons el valor de casos
        //for per guardar els valors de numero
        for (int i=0; i<casos; i++) {
            numero[i] = lector.nextInt();
        }
        //for per escriure la frase tantes vegades com el valor de num sigui en cada posició
        for (int i=0; i<casos; i++) {
            for (int j=0; j<numero[i]; j++) {
                System.out.println("No ofendre al president patata");
            }
            System.out.println();
        }
    }
}