import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inici variables
        int casos = 0;
        int bolets = 0;
        int canvi = 0;
        int solicitut = 0;
        int[] solicituds = new int[100];
        int[] solicitudsValides;
        int numSolicituds = 0;
        //inici escaner
        Scanner lector = new Scanner(System.in);
        //inici programa
        casos = lector.nextInt();
        int[] resultats = new int[casos]; //Array per guardar les resppostes i imprimir-les
        //bucle per repetir segons el número de casos demanats
        for (int i = 0; i < casos; i++) {
            //reinici variables1
            numSolicituds = 0;
            for (int j=0; j<solicituds.length; j++) {
                solicituds[j] = 0;
            }
            bolets = lector.nextInt();
            if (bolets>0) {
                //bucle i llegim les solicituts
                for (int j = 0; j < 100; j++) {
                    solicitut = lector.nextInt();
                        solicituds[j]=solicitut;
                    if (solicituds[j]==0) {
                        break;
                    }
                    numSolicituds++;
                }
                //Creem i guardem variables al nou array, només les solicituts valides, per treurens de sobre tots els 0.
                solicitudsValides = new int[numSolicituds];
                for (int j=0; j<numSolicituds; j++) {
                    solicitudsValides[j]=solicituds[j];
                }
                //Bucle per ordenar l'array de més petit a més gran
                for (int j=0; j<solicitudsValides.length; j++) {
                    for (int k=j+1; k<solicitudsValides.length; k++) {
                        if (solicitudsValides[j]>solicitudsValides[k]) {
                            canvi=solicitudsValides[j];
                            solicitudsValides[j]=solicitudsValides[k];
                            solicitudsValides[k]=canvi;
                        }
                    }
                }
                //for per anar sumant solicituts segons si son acceptades o no
                for (int j=0; j<solicitudsValides.length; j++) {
                    bolets=bolets-solicitudsValides[j];
                    if (bolets==0) {
                        resultats[i]++;
                        break;
                    } else if (bolets>0) {
                        resultats[i]++;
                    } else if (bolets<0) {
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < resultats.length; i++) {
            System.out.println(resultats[i]);
        }
    }
}