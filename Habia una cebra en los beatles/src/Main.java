import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int files = 0;
        int columnes = 0;
        int inici_uns = 0;
        int[][] pas_zebra;

        //Inici escaner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        files = lector.nextInt();
        columnes = lector.nextInt();
        pas_zebra = new int[files][columnes]; //Declarem ppas de zebra segons files i columnes
        inici_uns = lector.nextInt();
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                if (i==inici_uns) {
                    pas_zebra[i][j] = 1;
                } else if (i>inici_uns) {
                    if (pas_zebra[i-1][j] == 0) {
                        pas_zebra[i][j] = 1;
                    } else if (pas_zebra[i-1][j] == 1) {
                        pas_zebra[i][j] = 0;
                    }
                }
            }
        }
        //for per imprimir
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                System.out.print(pas_zebra[i][j]+" ");
            }
            System.out.println();
        }
    }
}