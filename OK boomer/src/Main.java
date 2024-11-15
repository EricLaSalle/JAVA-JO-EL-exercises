import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Definim variables
        int any;
        //Iniciem escaner
        Scanner sc = new Scanner(System.in);
        //Inici programa
        any = sc.nextInt();
        if (1945<=any && any<=1965) { //Si any de naixement està entre 1945 i 1965 inclosos
            System.out.println("ok boomer");
        } else {//De cualsevol altra manera
            System.out.println("nah");
        }
    }
}