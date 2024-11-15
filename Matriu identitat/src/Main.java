import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int n=0;
        int[][] matriu;

        //inici escaner
        Scanner sc = new Scanner(System.in);

        //Inici programa
        n=sc.nextInt(); //llegim n
        matriu = new int[n][n];
        //for per escriure 1 a la diagonal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriu[i][j] = 1;
                }
            }
        }
        //for per imprimir matriu
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.println(matriu[i][j]);
            }
        }
    }
}