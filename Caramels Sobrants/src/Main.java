import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int carmels = 0;
        int nets = 0;
        int sobrants =0;
        Scanner sc = new Scanner(System.in);
        carmels = sc.nextInt();
        nets = sc.nextInt();
        sobrants = carmels % nets;
        System.out.println(sobrants);
    }
}