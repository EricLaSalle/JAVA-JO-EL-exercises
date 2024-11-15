import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int comptador = 0;
        String[][] Llista1 = new String[200][2];
        String[][] Llista2 = new String[200][2];

        //Inici escaner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 2; j++) {
                Llista1[i][j] = lector.nextLine();
                if (i==0) {
                    Llista2[i][j]=Llista1[i][j];
                } else if (i>0) {
                    if (Llista1[i][j])
                }
                comptador++;
            }
            if (Llista1[i][1]=="null") {
                break;
            }
        }
    }
}