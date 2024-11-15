import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inicialització variables
        int jugador1;
        int jugador2;
        //Inicialtizació escaner
        Scanner sc = new Scanner(System.in);
        //Inici programa
        jugador1 = sc.nextInt();
        jugador2 = sc.nextInt();
        if (jugador1<1 || jugador2<1 || jugador1>3 || jugador2>3) {
            System.out.println("ERROR");
        } else if (jugador1==jugador2) {
            System.out.println("empat");
        } else if (jugador1==1 && jugador2==2) {
            System.out.println("Jugador2");
        } else if (jugador1==1 && jugador2==3) {
            System.out.println("Jugador1");
        } else if (jugador1==2 && jugador2==1) {
            System.out.println("Jugador1");
        } else if (jugador1==2 && jugador2==3) {
            System.out.println("Jugador2");
        } else if (jugador1==3 && jugador2==1) {
            System.out.println("Jugador2");
        } else if (jugador1==3 && jugador2==2) {
            System.out.println("Jugador1");
        }
    }
}