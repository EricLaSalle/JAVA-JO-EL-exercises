import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numi=0;
        int numq=0;
        Scanner num = new Scanner(System.in);
        numi = num.nextInt();
        numq = numi*numi;
        System.out.println(numq);
    }
}