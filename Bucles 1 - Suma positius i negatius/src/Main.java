import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int num = 0;
        int contador_pos = 0;
        int contador_neg = 0;

        //Inici escaner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        //Bucle per fer fins que llegim un 0
        do {
            num = lector.nextInt(); //llegim num
            if (num!=0) {
                //Si num es positiu (divisible entre 2), sumem 1 a contador positiu. En cas contrari, al negatiu
                if (num>0) {
                    contador_pos++;
                } else {
                    contador_neg++;
                }
            } else {
                break;
            }
        } while (num!=0);
        //if per mostrar "POSITIU", "NEGATIU" i "IGUALS" segons el cas
        if (contador_pos>contador_neg) {
            System.out.println("POSITIUS");
        } if (contador_pos<contador_neg) {
            System.out.println("NEGATIUS");
        } else if (contador_pos==contador_neg) {
            System.out.println("IGUALS");
        }
    }
}