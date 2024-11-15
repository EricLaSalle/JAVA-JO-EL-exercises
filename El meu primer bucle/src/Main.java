import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Inici variables
        int casos=0;
        int[] vector;

        //Inici escaner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        casos = lector.nextInt(); //llegim casos
        vector = new int[casos]; //declarem vector segons casos
        //bucle per llegir valors de vector i guardar-los
        for (int i = 0; i < casos; i++) {
            vector[i] = lector.nextInt();
        }
        //bucle per imprimir els valors del vector, sumant-li's 1
        for (int i = 0; i < casos; i++) {
            System.out.println(vector[i]+1);
        }
    }
}