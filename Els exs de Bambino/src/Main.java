import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inicialització variables
        int novio1;
        int novio2;
        int novio3;
        int novionou;
        //Inicialització escaner
        Scanner sc = new Scanner(System.in);
        //Inici programa
        novio1 = sc.nextInt(); //Lectura novio1
        novio2 = sc.nextInt(); //Lectura novio2
        novio3 = sc.nextInt(); //Lectura novio 3
        novionou = sc.nextInt(); //Lectura novio 4
        if (novionou>18 && novionou!=novio1 && novionou!=novio2 && novionou!=novio3) { //Si el novio es major de 18 i no té l'edat dels demés
            System.out.println("SI");
        } else { //Qualsevol altre cas
            System.out.println("NO");
        }
    }
}