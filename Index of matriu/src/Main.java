import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int F;
        int C;
        int[][] matriu;
        int k;
        int[] posicio_k = {-1, -1};
        boolean trobem_k = false;

        //Inici escaner
        Scanner lector_num = new Scanner(System.in);

        //Inici programa
        F = lector_num.nextInt(); C = lector_num.nextInt(); //llegim files i columnes
        matriu = new int[F][C]; //iniciem matriu segons files i columnes
        //for per llegir matriu
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                matriu[i][j] = lector_num.nextInt();
            }
        }
        k = lector_num.nextInt(); //llegim k
        //for per trobar k a la matriu
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                //if per trencar el bucle si trobem k a la matriu
                if (matriu[i][j] == k) {
                    posicio_k[0] = i;
                    posicio_k[1] = j;
                    trobem_k = true;
                    break;
                }
            }
            if (trobem_k) {
                break;
            }
        }
        //for per imprimir vector posicio_k (com que l'hem inicialitzat {-1, -1}, imprimirà això en cas de no trobar k)
        for (int i = 0; i < 2; i++) {
            System.out.printf(posicio_k[i]+" ");
        }
    }
}