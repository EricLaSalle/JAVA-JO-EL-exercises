import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inicialització variables
        int[] monedes = {200,100,50,20,10,5,2,1};
        int qCentims;
        int nummonedes;
        //Inicialització escaner
        Scanner sc = new Scanner(System.in);
        //Inici programa
        qCentims = sc.nextInt(); //Llegim els centims
        for (int i = 0; i < monedes.length; i++) {
                nummonedes = qCentims / monedes[i];
                qCentims = qCentims % monedes[i];
                System.out.println(nummonedes);
            }
    }
}