import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        //Establim variables
        int edat;
        //Iniciem escaner
        Scanner sc = new Scanner(System.in);
        //Inici codi
        edat = sc.nextInt(); //Llegim edat
        if (edat <32) { //Si te menys de 32 anys
            System.out.println("SI");
        } else {//Si te 32 o més anys
            System.out.println("NO");
        }
    }
}