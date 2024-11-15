import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inicialització variables
        int TOTALNOTES=0;
        int NOTESDEU=0;
        int nota;
        //Inicialització escaner
        Scanner sc = new Scanner(System.in);
        //Inici programa
        do { //Comencem el bucle
            nota=sc.nextInt(); //Llegim la nota
            if (nota>=0 && nota<=10) { //Si la nota es troba entre 0 i 10 inclosos
                TOTALNOTES=TOTALNOTES+1; //Sumem 1 al contador de notes
                if (nota==10) { //Si la nota és igual a 10
                    NOTESDEU=NOTESDEU+1; //Sumem 1 al contador de deus
                }
            }
        } while (nota!=-1);
        System.out.println("TOTAL NOTES: " + TOTALNOTES + " NOTES10: " + NOTESDEU);
    }
}