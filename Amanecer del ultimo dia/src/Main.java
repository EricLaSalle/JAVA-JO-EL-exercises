import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inici variables
        long segons;
        long segonsPerDia = 86400;
        long segonsPerEtapa = 43200;
        long dia;
        long segonsRestants;

        //Inici escaner
        Scanner sc = new Scanner(System.in);

        //Inici programa
        segons = sc.nextLong();
        dia = (segons / segonsPerDia) + 1;
        segonsRestants = segons % segonsPerDia;
        if (segonsRestants < segonsPerEtapa) {
            System.out.println("mati del dia " + dia);
        } else {
            System.out.println("nit del dia " + dia);
        }
    }
}