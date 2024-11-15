import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Definim variables
        double num;
        double residu;
        //Iniciem escaner
        Scanner sc = new Scanner(System.in);
        //Inici programa
        num = sc.nextInt(); //Llegim numero
        residu = num%2 + num%3 + num%5 + num%7; //Calculo el residu de dividir el número per 2,3,5,7 (que també es divisible llavors del 1 al 9)
        if (residu == 0) { //Si el número és divisible
            System.out.println("SI");
        } else { //si el número no es divisible
            System.out.println("NO");
        }
    }
}