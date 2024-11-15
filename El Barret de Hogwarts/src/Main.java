import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String casa = null;
        Scanner in = new Scanner(System.in);
        casa = in.nextLine();
        switch (casa) {
            case "Coratge":
                System.out.println("Gryffindor");
                break;
            case "Coneixement":
                System.out.println("Ravenclaw");
                break;
            case "Ambicio":
                System.out.println("Slytherin");
                break;
            default:
                System.out.println("Hufflepuff");
                break;
        }
    }
}