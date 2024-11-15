import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int dia = 0;
        int mes = 0;
        Scanner sc = new Scanner(System.in);
        dia = sc.nextInt();
        if (dia>=0 && dia<=31) {
            mes = 1;
        } else if (dia>31 && dia<=59) {
            mes = 2;
        } else if (dia>59 && dia<=90) {
            mes = 3;
        } else if (dia>90 && dia<=120) {
            mes = 4;
        } else if (dia>120 && dia<=151) {
            mes = 5;
        } else if (dia>151 && dia<=181) {
            mes = 6;
        } else if (dia>181 && dia<=212) {
            mes = 7;
        } else if (dia>212 && dia<=243) {
            mes = 8;
        } else if (dia>243 && dia<=273) {
            mes = 9;
        } else if (dia>273 && dia<=304) {
            mes = 10;
        } else if (dia>304 && dia<=334) {
            mes = 11;
        } else if (dia>334 && dia<=365) {
            mes = 12;
        }
        System.out.println(mes);
    }
}