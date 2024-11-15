import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int casos;
        int num;
        int suma_p;
        int suma_s;
        String[][] resultats;

        //Inici escaner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        casos = lector.nextInt(); //llegim casos
        resultats = new String[casos][2]; //inicialitzem array resultats, files segons casos
        //for per fer bucle segons casos
        for (int i=0; i<casos; i++) {
            //reinici variables
            suma_p = 0;
            suma_s = 0;
            num = lector.nextInt(); //llegim num
            //bucle per sumar parells i senars
            for (int j=1; j<=num; j++) {
                if (j%2==0) {
                    suma_p+=j;
                } else {
                    suma_s+=j;
                }
            }
            //Guardem resultats a la matriu
            resultats[i][0] = "PARELLS: " + suma_p;
            resultats[i][1] = "SENARS: " + suma_s;
        }
        //Bucle per imprimir array
        for (int i=0; i<casos; i++) {
            System.out.println();
            for (int j=0; j<2; j++) {
                System.out.printf(resultats[i][j]+" ");
            }
        }
    }
}