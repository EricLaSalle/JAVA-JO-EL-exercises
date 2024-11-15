import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //inici variables
        int F;
        int C;
        int[][] matriu;
        int k;
        int[] vector_suma = new int[2];

        //inici escaner
        Scanner lector_num = new Scanner(System.in);

        //inici programa
        F = lector_num.nextInt(); C = lector_num.nextInt(); //llegim num de files i columnes
        matriu = new int[F][C]; //declarem matriu segons files i columnes llegides
        //for per llegir matriu
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                matriu[i][j] = lector_num.nextInt();
            }
        }
        k = lector_num.nextInt(); //llegim k
        //for per fer la suma dels nums de la fila k i guardar-los al primer espai del vector_suma
        for (int i = 0; i < C; i++) {
            vector_suma[0]+=matriu[k][i];
        }
        //for per fer la suma dels nums de la columna k i guardar-los al segon espai del vector_suma
        for (int i = 0; i < F; i++) {
            vector_suma[1]+=matriu[i][k];
        }
        //for per imprimir el vector_suma
        for (int i = 0; i < 2; i++) {
            System.out.printf(vector_suma[i]+" ");
        }
    }
}