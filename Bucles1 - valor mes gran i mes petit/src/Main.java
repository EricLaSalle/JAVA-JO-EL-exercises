import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variabes
        int num=0;
        int[] resultat = {-2147483647, 2147483647};

        //Inici escaner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        //bucle per llegir i guardar els valors de num
        do {
            num = lector.nextInt(); //llegim el valor num
            //if per guardar i actualitzar els valors de resultat, segons si els números son els més grans o petits
            // tenint en compte que guardarem el valor vector[0] a les dues posicions y que ens aturarem en llegir el valor 0.
            if (num==0) {
                break;
            } else if (num>resultat[0]) {
                resultat[0] = num;
            } else if (num<resultat[1]) {
                resultat[1] = num;
            }
        } while (num!=0);
        //for per imprimir el resultat
        for (int i=0; i<2; i++) {
            System.out.printf(resultat[i]+" ");
        }
    }
}