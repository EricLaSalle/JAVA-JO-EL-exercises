import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int numObservacions = 0;
        int tempsSegons = 0;
        int posicioMetres = 0;
        float resultatFinal = 0;
        boolean tempsDiferent = false;
        int[] arraySegons;
        int[] arrayMetres;
        int[] arraySegonsrestats;
        int[] arrayMetresrestats;
        float[] arrayResultats;
        //Inici escàner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        numObservacions = lector.nextInt();
        //Creem arrays per guardar les lectures, les seves restes, i els resultats
        arraySegons = new int[numObservacions];
        arrayMetres = new int[numObservacions];
        arraySegonsrestats = new int[numObservacions];
        arrayMetresrestats = new int[numObservacions];
        arrayResultats = new float[numObservacions];
        //If per assegurar-nos que numObservacions es troba entre els números esperats
        if ((2<=numObservacions) && (numObservacions<=100000)) {
            //Bucle per repetir tantes vegades com num d'observacions s'hagin demanat
            for (int i=0; i <numObservacions; i++) {
                //Reiniciem variables
                tempsDiferent = true;
                tempsSegons = lector.nextInt(); posicioMetres = lector.nextInt();
                //If per assegurar-nos que tempsSegons i posicioMetres es troben entre els números esperats, i que la variable temps no es repeteix
                if ((tempsSegons>=0) && (tempsSegons<=1000000000) && (-1000000000<=posicioMetres) && (posicioMetres<=1000000000)) {
                    //if per si i = 0, que no es podra fer cap resta, i quan ja es més gran que 0, que ha es poden fer calculs
                    if (i==0) {
                        arraySegons[i] = tempsSegons;
                        arrayMetres[i] = posicioMetres;
                    } else {
                        //Bucle per recorrer l'arraySegons per comprobar que no es repeteix
                        for (int j=i-1; j>=0; j--) {
                            if (tempsSegons==arraySegons[j]) {
                                tempsDiferent = false;
                                break;
                            }
                        }
                        //Només continuem si tot l'arraySegons és diferent
                        if (tempsDiferent) {
                            //Guardem a cada posició el temps i els metres
                            arraySegons[i] = tempsSegons;
                            arrayMetres[i] = posicioMetres;
                            arraySegonsrestats[i] = arraySegons[(i)] - arraySegons[i - 1];
                            //If per evitar negatius
                            if (arraySegonsrestats[i] < 0) {
                                arraySegonsrestats[i] *= -1;
                            }
                            arrayMetresrestats[i] = arrayMetres[(i)] - arrayMetres[i - 1];
                            //If per evitar negatius
                            if (arrayMetresrestats[i] < 0) {
                                arrayMetresrestats[i] *= -1;
                            }
                            arrayResultats[i] = (float) (arrayMetresrestats[i]) / (arraySegonsrestats[i]); //Calculem la velocitat en metres segons
                        } else if (!tempsDiferent) {
                            break;
                        }
                    }
                }
            }
            for (int i=0; i<=(arrayResultats.length-1); i++) {
                if (resultatFinal<arrayResultats[i]) {
                    resultatFinal = arrayResultats[i];
                }
            }
            BigDecimal resultatFinalAcotat = new BigDecimal(resultatFinal).setScale(1, RoundingMode.DOWN);
            System.out.println(resultatFinalAcotat);
        }
    }
}