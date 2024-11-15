import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int files;
        int columnes;
        int[] posicio = new int[2];
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
        //llegim la posicio que vol que imprimim
        for (int i=0; i<2; i++) {
            posicio[i] = lector_matriu.nextInt();
        }
        //Imprimim la matriu amb un for
        for (int i=0; i<files; i++) {
            System.out.println();
            for (int j=0; j<columnes; j++) {
                System.out.printf(matriu[i][j]+" ");
            }
        }
        System.out.println();
        //imprimim la posicio demanada
        System.out.println(matriu[posicio[0]][posicio[1]]);
    }
}