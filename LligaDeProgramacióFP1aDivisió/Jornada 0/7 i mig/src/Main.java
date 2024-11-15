import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inici variables
        int numCartes;
        int carta;
        float sumaA = 0;
        float sumaB = 0;
        float[] cartesA;
        float[] cartesB;
        //Inici escaner
        Scanner sc = new Scanner(System.in);
        //Inici programa
        numCartes = sc.nextInt();
        //if per diferenciar quantes posicions tindrà l'array a segons si numCartes es parell o senar.
        if (numCartes%2==0) {
            cartesA = new float[numCartes/2];
        } else {
            cartesA = new float[(numCartes/2)+1];
        }
        cartesB = new float[numCartes/2];
        //for per llegir cartes i colocarles segons si es el torn de A o de B als arrays corresponents
        for (int i = 0; i < numCartes; i++) {
            carta = sc.nextInt();
            if ((carta>=1 && carta<=7) || (carta>=10 && carta<=12)) {
                if (i%2==0) {
                    cartesA[i/2] = carta;
                    //if per canviar els 10, 11 i 12 per 0,5
                    if (cartesA[i/2]==10 || cartesA[i/2]==11 || cartesA[i/2]==12) {
                        cartesA[i/2] = 0.5F;
                    }
                } else if (i%2!=0) {
                    cartesB[i/2] = carta;
                    //if per canviar els 10, 11 i 12 per 0,5
                    if (cartesB[i/2]==10 || cartesB[i/2]==11 || cartesB[i/2]==12) {
                        cartesB[i/2] = 0.5F;
                    }
                }
            }
        }
        //for per anar sumant cartes fins que donin 7 o 7,5 o es passi de 7,5.
        for (int i = 0; i < (cartesA.length); i++) {
            sumaA = sumaA + cartesA[i];
            if (sumaA == 7 || sumaA == 7.5) {
                break;
            } else if (sumaA > 7.5) {
                break;
            }
        }
        //for per anar sumant cartes fins que donin 7 o 7,5 o es passi de 7,5.
        for (int i = 0; i < (cartesB.length); i++) {
            sumaB = sumaB + cartesB[i];
            if (sumaB == 7 || sumaB == 7.5) {
                break;
            } else if (sumaB > 7.5) {
                break;
            }
        }
        if (sumaA==7.5) {
            if (sumaB>7.5 || sumaB<7.5) {
                System.out.println("A");
            } else if (sumaB==7.5) {
                System.out.println("NINGU");
            }
        } else if (sumaA==7) {
            if (sumaB<7 || sumaB>7.5) {
                System.out.println("A");
            } else if (sumaB==7) {
                System.out.println("NINGU");
            } else if (sumaB==7.5) {
                System.out.println("B");
            }
        } else if (sumaA<7 || sumaA>7.5) {
            if (sumaB==7 || sumaB==7.5) {
                System.out.println("B");
            } else {
                System.out.println("NINGU");
            }
        }
    }
}