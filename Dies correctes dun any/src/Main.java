import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inicialització variables
        int dia;
        //Inicialització escaner
        Scanner sc = new Scanner(System.in);
        //Inici programa
        dia = sc.nextInt(); //Llegim el dia
        if (dia>=1 && dia<=365) { //Si el dia està entre 1 i 365
            System.out.println("Correcte per un any no bixest!");
        } else if (dia==366) { //Si el dia es 366
            System.out.println("Correcte per un any bixest!");
        } else { //Qualsevol altre cas
            System.out.println("Incorrecte!");
        }
    }
}