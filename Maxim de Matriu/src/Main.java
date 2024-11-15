import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //inici variables
        int casos;
        int files;
        int columnes;
        int num_gran;
        int[][] matriu;
        int[][] matriu_resultat;

        //inici escàner
        Scanner sc = new Scanner(System.in);

        //inici programa
        casos = sc.nextInt();
        matriu_resultat = new int[casos][2];
        for (int i = 0; i < casos; i++) {
            num_gran = 0;
            files = sc.nextInt(); columnes = sc.nextInt();
            matriu = new int[files][columnes];
            for (int j = 0; j < files; j++) {
                for (int k = 0; k < columnes; k++) {
                    matriu[j][k] = sc.nextInt();
                    if (matriu[j][k]>num_gran) {
                        num_gran=matriu[j][k];
                    }
                }
            }
            for (int j = 0; j < files; j++) {
                for (int k = 0; k < columnes; k++) {
                    if (num_gran==matriu[j][k]) {
                        matriu_resultat[i][0]=j+1;
                        matriu_resultat[i][1]=k+1;
                    }
                }
            }
        }
        for (int i = 0; i < casos; i++) {
            System.out.println();
            for (int j = 0; j < 2; j++) {
                System.out.printf(matriu_resultat[i][j]+" ");
            }
        }
    }
}