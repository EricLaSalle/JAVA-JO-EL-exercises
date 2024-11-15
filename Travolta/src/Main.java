import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int f = 0;
        int c = 0;
        int t = 0;
        int[][] matriu;
        int resposta = 0;
        boolean numtrobat = false;

        //Inici escaner
        Scanner sc = new Scanner(System.in);

        //Inici programa
        f = sc.nextInt(); c = sc.nextInt(); t = sc.nextInt(); //llegim f, c i t
        matriu = new int[f][c]; //declarem matriu segons valor de f i de c
        //bucle per llegir i guardar matriu
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriu[i][j] = sc.nextInt();
            }
        }
        //bucle per buscar si un num te dos nums t a la dreta i a l'esquerra
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (j>0 && j<c-1) {
                    if (matriu[i][j-1]==t && matriu[i][j+1]==t) {
                        resposta = matriu[i][j];
                        numtrobat = true;
                        break;
                    }
                }
            }
        }
        if (numtrobat) {
            System.out.println(resposta);
        } else {
            System.out.println("NO");
        }
    }
}