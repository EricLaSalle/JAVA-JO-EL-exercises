import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int casos;
        int num_animals;
        String animal;
        String[] animals;
        String[] respostes;
        boolean animal_trobat = false;

        //Inici escaner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        casos = lector.nextInt();
        respostes = new String[casos]; //Iniciaitzem array respostes segons el num de casos
        //Bucle per fer segons num de casos
        for (int i=0; i<casos; i++) {
            animal_trobat = false; //reiniciem variable animal_trobat
            num_animals = lector.nextInt();
            animals = new String[num_animals]; //Inicialitzem array animals segons el num de num_animals
            //for per llegir vector
            for (int j=0; j<num_animals; j++) {
                animals[j] = lector.nextLine();
            }
            animal = lector.nextLine();
            //Recorrem array en busca de l'animal
            for (int j=0; j<num_animals; j++) {
                if (animals[j].equals(animal)) {
                    respostes[i] = "SI";
                    animal_trobat = true;
                    break;
                }
            }
            //en cas de no trobar-lo
            if (!animal_trobat) {
                respostes[i] = "NO";
            }
        }
        //Bucle per imprimir array respostes
        for (int i=0; i<casos; i++) {
            System.out.println(respostes[i]);
        }
    }
}