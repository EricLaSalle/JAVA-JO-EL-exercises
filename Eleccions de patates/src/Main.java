import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int casos = 0;
        int opcions = 0;
        int[] vots;
        int vots_maxims = 0;
        int[] resposta;

        //Inici escaner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        casos = lector.nextInt(); //Llegim casos
        resposta = new int[casos]; //Declarem resposta segons valor de casos
        //Bucle per posar per defecte tots els valors de resposta a 1
        for (int i = 0; i < casos; i++) {
            resposta[i] = 1;
        }
        //Bucle segons valor de casos
        for (int i = 0; i < casos; i++) {
            vots_maxims = 0; //Reiniciem variable vots_maxims
            opcions = lector.nextInt(); //llegim opcions
            vots = new int[opcions]; //declarem vots segons valor opcions
            //Bucle per llegir array
            for (int j = 0; j < opcions; j++) {
                vots[j] = lector.nextInt();
                if (j==0) {
                    vots_maxims=vots[j];
                } else if (j>0 && vots[j] > vots_maxims) {
                    vots_maxims = vots[j];
                    resposta[i] = j+1;
                }
            }
        }
        //for per imprimir l'array resposta
        for (int i = 0; i < casos; i++) {
            System.out.println(resposta[i]);
        }
    }
}