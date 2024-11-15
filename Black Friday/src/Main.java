import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int files = 0;
        int columnes = 0;
        int multiplicacio = 0;
        int[][] preus;

        //inici escaner
        Scanner sc = new Scanner(System.in);

        //inici programa
        files = sc.nextInt(); columnes = sc.nextInt(); //llegim files i columnes
        preus = new int[files][columnes]; //declarem array segons valor de files y columnes
        //bulce per llegir i guardar matriu
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                preus[i][j] = sc.nextInt();
            }
        }
        multiplicacio = sc.nextInt(); //llegim multiplicacio
        //bucle per imprimir matriu multiplicant cada posicio per dos
        for (int i = 0; i < files; i++) {
            System.out.println();
            for (int j = 0; j < columnes; j++) {
                System.out.print(preus[i][j]*multiplicacio + " ");
            }
        }
    }
}