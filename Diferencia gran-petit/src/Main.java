import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inicialització variables
        int A;
        int B;
        int resta;
        //Inicialització escaner
        Scanner sc = new Scanner(System.in);
        //Inici programa
        A = sc.nextInt(); //Llegim A
        B = sc.nextInt(); //Llegim B
        if (A > B) { //Si A es mes gran que B
            resta = A - B; //Restem B a A
        } else { //Si no
            resta = B - A; //Restem A a B
        }
        System.out.println(resta); //Donem el resultat
    }
}