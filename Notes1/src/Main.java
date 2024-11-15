import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int casos;
        int mitjanes;
        int files_alumnes;
        int columnes_moduls;
        int[][] matriu_notes;
        int[] vector_mitjanes;

        //Inici escaner
        Scanner lector_notes = new Scanner(System.in);

        //Inici programa
        casos = lector_notes.nextInt();
        //Bucle per repetir segons el num de casos llegit
        for (int i=0; i<casos; i++) {
            //llegim files i columnes i configurem la matriu notes i el vector mitjanes segons aquests
            files_alumnes = lector_notes.nextInt(); columnes_moduls = lector_notes.nextInt();
            matriu_notes = new int[files_alumnes][columnes_moduls];
            vector_mitjanes = new int[files_alumnes];
            //for per omplir matriu i fer les mitjanes
            for (int j=0; j<files_alumnes; j++) {
                mitjanes = 0;
                for (int k=0; k<columnes_moduls; k++) {
                    matriu_notes[j][k] = lector_notes.nextInt();
                    mitjanes = mitjanes + matriu_notes[j][k];
                }
                mitjanes = mitjanes/columnes_moduls;
                vector_mitjanes[j] = mitjanes; //omplim el vector mitjana segons el resultat de mitjanes
            }
            //for per imprimir el vector (nomes es podria fer al final de tot com a l'exercici si usesim un array dinamic)
            for (int j=0; j<files_alumnes; j++) {
                System.out.println(vector_mitjanes[j]);
            }
        }
    }
}