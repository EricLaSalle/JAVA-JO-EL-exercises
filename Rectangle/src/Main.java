import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int F = 0;
        int C = 0;
        int f1 = 0;
        int f2 = 0;
        int c1 = 0;
        int c2 = 0;
        char[][] matriu;

        //Inici escaner
        Scanner sc = new Scanner(System.in);

        //Inici programa
        F = sc.nextInt(); C = sc.nextInt(); //llegim files i columnes
        matriu = new char[F][C]; //declarem matriu segons valor de F i de C
        f1 = sc.nextInt(); c1 = sc.nextInt(); //llegim f1 i c1 per saber on comença el rectangle dins de la matriu
        f2 = sc.nextInt(); c2 = sc.nextInt(); //llegim f2 i c2 per saber on acaba el rectangle dins de la matriu
        //bucle per escriure matriu amb rectangle dins
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                if (i>=f1 && j>=c1 && i<=f2 && j<=c2){
                    matriu[i][j] = 'X';
                } else {
                    matriu[i][j] = '.';
                }
            }
        }
        //bucle per imprimir matriu
        for (int i = 0; i < F; i++) {
            System.out.println();
            for (int j = 0; j < C; j++) {
                System.out.print(matriu[i][j] + " ");
            }
        }
    }
}