import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int votsJiden;
        int votsDrump;
        Scanner sc = new Scanner(System.in);
        votsJiden = sc.nextInt();
        votsDrump = sc.nextInt();
        if (votsJiden > votsDrump) {
            System.out.println("Jiden");
        } else if (votsDrump > votsJiden) {
            System.out.println("Drump");
        } else {
            System.out.println("No");
        }
    }
}