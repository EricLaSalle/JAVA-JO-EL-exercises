import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int casos;
        int num_alumnes;
        int[] vector_alumnes;
        int[] vector_resultats;
        int canvi;

        //Inici escaner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        casos = lector.nextInt(); //llegim el num de casos
        vector_resultats = new int[casos]; //inicialitzem vector_resultats segons el num de casos
        //bucle per fer segons el num de casos
        for (int i=0; i<casos; i++) {
            num_alumnes = lector.nextInt(); //llegim el num d'alumnes
            vector_alumnes = new int[num_alumnes]; //declarem vector_alumnes segons el num_alumnes
            //for per llegir el vector_alumnes
            for (int j=0; j<num_alumnes; j++) {
                vector_alumnes[j] = lector.nextInt();
            }
            //for per ordenar de més petit a més gran
            for (int j=0; j<num_alumnes; j++) {
                for (int k=j+1; k<num_alumnes; k++) {
                    if (vector_alumnes[j] > vector_alumnes[k]) {
                        canvi=vector_alumnes[k];
                        vector_alumnes[k]=vector_alumnes[j];
                        vector_alumnes[j]=canvi;
                    }
                }
            }
            vector_resultats[i]=vector_alumnes[num_alumnes-1]-vector_alumnes[0]; //calculem la diferencia més gran i la guardem al vector_resultats
        }
        //bucle per imprimir el resultat
        for (int i=0; i<casos; i++) {
            System.out.println(vector_resultats[i]);
        }
    }
}