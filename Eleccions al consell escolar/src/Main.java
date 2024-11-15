import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int tamany = 0;
        char[][] matriu;

        //Inici escaner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        tamany = lector.nextInt(); //llegim el tamany de la matriu
        matriu = new char[tamany][tamany]; //declarem la matriu
        //bucle per escriure la matriu
        for (int i=0; i<tamany; i++) {
            for (int j=0; j<tamany; j++) {
                if (i == 0 || j == 0 || i == tamany-1 || j == tamany-1) {
                    matriu[i][j] = 'X';
                } else if (i == j) {
                    matriu[i][j] = 'X';
                } else if (i + j == tamany-1) {
                    matriu[i][j] = 'X';
                } else {
                    matriu[i][j] = '.';
                }
            }
        }
        //for per imprimir matriu
        for (int i=0; i<tamany; i++) {
            System.out.println();
            for (int j=0; j<tamany; j++) {
                System.out.print(matriu[i][j] + " ");
            }
        }
    }
}