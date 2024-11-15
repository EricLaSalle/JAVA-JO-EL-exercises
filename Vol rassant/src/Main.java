import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Inici de variables
        int casos = 0;
        int k = 0;
        int[] array;
        int[] array_vol=new int[k];
        int[][] respostes;

        //Inici escaner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        casos = lector.nextInt();
        respostes = new int[casos][1000]; //Declarem la matriu respostes segons el valor de casos i 1000 (el valor màxim de k)
        //Bucle per fer segons el valor de casos
        for (int i=0; i<casos; i++) {
            k = lector.nextInt();
            array = new int[k]; //Declarem array segons k
            array_vol = new int[k]; //Declarem array vol segons k
            //Bucle per llegir array i guardar el valor +1 a array_vol
            for (int j=0; j<k; j++) {
                array[j] = lector.nextInt();
                //if-else per anar guardant a l'array_vol els valors del vol
                //Si es el primer valor, li sumem 1
                if (j==0) {
                    array_vol[j] = array[j] + 1;
                    //Si el valor és igual a l'anterior, mantenim
                } else if (array[j]==array_vol[j-1]-1) {
                    array_vol[j] = array_vol[j-1];
                    //Si el valor és més petit, baixem
                } else if (array[j]<array_vol[j-1]-1) {
                    array_vol[j] = array_vol[j-1]-1;
                    //Si el valor és més gran, pujem
                } else if (array[j]>array_vol[j-1]-1) {
                    array_vol[j] = array_vol[j-1]+1;
                }
            }
            //Bucle per recorrer l'array i l'array_vol i buscar que no ens xoquem
            for (int j=0; j<k; j++) {
                //Si una muntanya és igual o més alta que el nostre vol, pujem aquell valor fins no xocar
                if (array[j]>=array_vol[j]) {
                    array_vol[j] = array_vol[j] + array[j] - array_vol[j] + 1;
                    //Si ha una distància més gran que 1 entre el valor mirat i l'anterior, fem un bucle
                    if (array_vol[j]>array_vol[j-1]-1) {
                        //Bucle per sumar 1 als valors anteriors al mirat fins que no tinguin una distància més gran que 1 entre ells
                        for (int l=j-1; l>=0; l--) {
                            while (array_vol[l]<array_vol[l+1]-1) {
                                array_vol[l]++;
                            }
                        }
                    }
                }

            }
            //Bucle per recorrer l'array a l'inversa i posar els valors per davant del número més alt correctament
            for (int j=k-1; j>=0; j--) {
                if (j>0 && array_vol[j]<array_vol[j-1]-1) {
                    //Bucle per sumar 1 als valors posteriors al més alt fins que no tinguin una distància més gran que 1 entre ells
                    for (int l=j; l<k; l++) {
                        while (array_vol[l]<array_vol[l-1]-1) {
                            array_vol[l]++;
                        }
                    }
                }
            }

            //Ho guardem a la matriu respostes amb un bucle
            for (int j=0; j<k; j++) {
                respostes[i][j]=array_vol[j];
            }
        }
        //Bucle per imprimir la matriu respostes
        for (int i=0; i<casos; i++) {
            for (int j=0; j<1000; j++) {
                if (respostes[i][j]!=0) {
                    System.out.printf(respostes[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}