import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variabes
        int files = 0;
        int columnes = 0;
        int[][] matriu;
        int[][] matriu_transposada;

        //Inici escaner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        files = lector.nextInt(); columnes = lector.nextInt(); //llegim files i columnes
        matriu = new int[files][columnes]; //declarem matriu segons valor de files i columnes
        matriu_transposada = new int[columnes][files]; //declarem matriu transposada segons valor de columnes i files
        //for per llegir matriu
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                matriu[i][j] = lector.nextInt();
            }
        }
        //for per guardar matriu transposada amb valors de matriu
        for (int i = 0; i < columnes; i++) {
            for (int j = 0; j < files; j++) {
                matriu_transposada[i][j] = matriu[j][i];
            }
        }
        //for per imprimir matriu
        for (int i = 0; i < columnes; i++) {
            System.out.println();
            for (int j = 0; j < files; j++) {
                System.out.println(matriu_transposada[i][j]);
            }
        }
    }
}