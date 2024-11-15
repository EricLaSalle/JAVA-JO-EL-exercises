import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int files;
        int columnes;
        int[] nums_canvi = new int[2];
        int[][] matriu;

        //Inici escaner
        Scanner lector_matriu = new Scanner(System.in);

        //Inici programa
        files=lector_matriu.nextInt(); columnes=lector_matriu.nextInt(); //Llegim files i columnes
        matriu = new int[files][columnes]; //Creem la matriu a partir del que llegim
        //Emplenem la matriu amb un for
        for (int i=0; i<files; i++) {
            for (int j=0; j<columnes; j++) {
                matriu[i][j] = lector_matriu.nextInt();
            }
        }
        //llegim els nums que vol intercanviar
        for (int i=0; i<2; i++) {
            nums_canvi[i] = lector_matriu.nextInt();
        }
        //bucle per recorrer matriu i canviar els nums = nums_canvi[0] per nums_canvi[1]
        for (int i=0; i<files; i++) {
            for (int j=0; j<columnes; j++) {
                if (matriu[i][j]==nums_canvi[0]) {
                    matriu[i][j] = nums_canvi[1];
                }
            }
        }
        //for per imprimir matriu final
        for (int i=0; i<files; i++) {
            System.out.println();
            for (int j=0; j<columnes; j++) {
                System.out.print(matriu[i][j]+" ");
            }
        }
    }
}