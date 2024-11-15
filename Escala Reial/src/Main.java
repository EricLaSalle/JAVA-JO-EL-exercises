import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inicialització varaibles
        int numCasos = 0;
        int[] cartes = new int[7];
        int canvi = 0;
        int contadorZeros = 0;
        boolean continuar = false;
        //Inici escaner
        Scanner sc = new Scanner(System.in);
        //Inici programa
        numCasos = sc.nextInt();
        String[] respostes = new String[numCasos]; //Array per mostrar i guardar les respostes
        //For per fer tots els casos
        for (int i=0; i<numCasos; i++) {
            //Reinici de variables
            contadorZeros=0;
            canvi=0;
            for (int j=0; j<cartes.length; j++) {
                cartes[j]=0;
            }
            //for per guardar l'array cartes
            for (int j=0; j<cartes.length; j++) {
                cartes[j] = sc.nextInt();
            }
            //for per convertir a 0 les cartes duplicades
            for (int j=0; j<cartes.length; j++) {
                for (int k=j+1; k< cartes.length; k++) {
                    if (cartes[j]==cartes[k]) {
                        cartes[j] = 0;
                    }
                }
            }
            //for per ordenar les cartes
            for (int j=0; j<cartes.length; j++) {
                for (int k=j+1; k<cartes.length; k++) {
                    if (cartes[j] > cartes[k]) {
                        canvi = cartes[j];
                        cartes[j] = cartes[k];
                        cartes[k] = canvi;
                    }
                }
            }
            //For per comptar zeros (cartes repeptides) i saber a quina posició es troba la primera carta que compta
            for (int j=0; j<cartes.length; j++) {
                if (cartes[j] == 0) {
                    contadorZeros++;
                }
            }
            //if per descartar l'escala reial
            if (cartes[3]==10 && cartes[4]==11 && cartes[5]==12 && cartes[6]==13 && cartes[contadorZeros]==1) {
                respostes[i] = "ESCALA REIAL";
            } else {
                //for per recorrer l'array en busca d'escales, menys les que comencin per 11, 12 o 13
                for (int j=0; j<=3; j++) {
                    for (int k=j+1; k<=j+3; k++) {
                        continuar = false;
                        if (cartes[j]==cartes[k]-k) {
                            continuar = true;
                        } else {
                            continuar = false;
                            break;
                        }
                    }
                    if (continuar) {
                        break;
                    }
                }
                //if per sortir si trobem escala
                if (continuar) {
                    respostes[i] = "ESCALA";
                    //If per probar si hi ha una escala que inclou el 13 i l'1 sense ser reial
                } else if (cartes[6]==13 && cartes[contadorZeros]==1) {
                    if (cartes[5] == 12) {
                        if (cartes[contadorZeros + 1] == 2) {
                            respostes[i] = "ESCALA";
                        } else if (cartes[4] == 11) {
                            respostes[i] = "ESCALA";
                        }
                    } else if (cartes[contadorZeros + 1] == 2) {
                        if (cartes[contadorZeros + 2] == 3) {
                            respostes[i] = "ESCALA";
                        }
                    } else {
                        respostes[i] = "NO";
                    }
                } else {
                    respostes[i] = "NO";
                }
            }
        }
        for (int i = 0; i <numCasos; i++) {
            System.out.println(respostes[i]);
        }
    }
}