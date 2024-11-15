import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //inicialització variables
        int C1;
        int C2;
        int C3;
        //inicialització escaner
        Scanner sc = new Scanner(System.in);
        //inici programa
        C1 = sc.nextInt();
        C2 = sc.nextInt();
        C3 = sc.nextInt();
        if (C1==C2 && C1==C3) { //si les 3 cartes son iguals
            System.out.println("SI");
        } else { //Si no son iguals
            System.out.println("NO");
        }
    }
}