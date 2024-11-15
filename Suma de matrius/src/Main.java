import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int dimensio_matriu;
        int[][] matriu1;
        int[][] matriu2;
        int[][] matriu_resultats;

        //inici escaner
        Scanner lector_matriu = new Scanner(System.in);

        //Inici programa
        dimensio_matriu = lector_matriu.nextInt();
        //Inicialitzem matrius
        matriu1 = new int[dimensio_matriu][dimensio_matriu];
        matriu2 = new int[dimensio_matriu][dimensio_matriu];
        matriu_resultats = new int[dimensio_matriu][dimensio_matriu];
        if (dimensio_matriu>=2 && dimensio_matriu<=8) {
            for (int i=0; i<dimensio_matriu; i++) {
                for (int j=0; j<dimensio_matriu; j++) {
                    matriu1[i][j] = lector_matriu.nextInt();
                }
            }
            for (int i=0; i<dimensio_matriu; i++) {
                for (int j=0; j<dimensio_matriu; j++) {
                    matriu2[i][j] = lector_matriu.nextInt();
                }
            }
            for (int i=0; i<dimensio_matriu; i++) {
                for (int j=0; j<dimensio_matriu; j++) {
                    matriu_resultats[i][j]=matriu1[i][j]+matriu2[i][j];
                }
            }
            for (int i=0; i<dimensio_matriu; i++) {
                System.out.println();
                for (int j=0; j<dimensio_matriu; j++) {
                    System.out.printf(matriu_resultats[i][j]+" ");
                }
            }
        }
    }
}