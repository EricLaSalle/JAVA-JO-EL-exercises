import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int casos = 0;
        int tamany = 0;
        boolean num_trobat = false;
        int[] array;
        String[] respostes;

        //Inici escaner
        Scanner sc = new Scanner(System.in);

        //Inici programa
        casos = sc.nextInt();
        respostes = new String[casos]; //Declarem array respostes segons valor de casos
        //bucle per fer segons el num de casos
        for (int i = 0; i < casos; i++) {
            num_trobat = false; //Reinici de variable boolean
            tamany = sc.nextInt();
            array = new int[tamany]; //Declarem array array segons valor de tamany
            //bucle per llegir array
            for (int j = 0; j < tamany; j++) {
                array[j] = sc.nextInt();
            }
            //Bucle per buscar dos nums seguits iguals dins de l'array
            for (int j = 1; j < tamany; j++) {
                if (array[j]==array[j-1]) {
                    num_trobat = true;
                    break;
                }
                if (num_trobat) {
                    break;
                }
            }
            if (num_trobat) {
                respostes[i] = "SI";
            } else if (!num_trobat) {
                respostes[i] = "NO";
            }
        }
        //Bucle per imprimir l'array respostes
        for (int i = 0; i < casos; i++) {
            System.out.println(respostes[i]);
        }
    }
}