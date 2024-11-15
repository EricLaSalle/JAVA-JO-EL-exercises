import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int cassosDeProva = 0;
        int metresCarrera = 0;
        int velocitatTortuga = 0;
        int velocitatLlebre = 0;
        int minCarreraContinuaLlebre = 0;
        int metresTortuga = 0;
        int metresLlebre = 0;
        int comptadorMin = 0;

        //Inici escàner
        Scanner lector = new Scanner(System.in);

        //Inici programa
        cassosDeProva = lector.nextInt();
        String[] resultats = new String[cassosDeProva]; //Iniciem un array per tal d'anar guardant els resultats
        //Bucle per repetir la lectura de variables tantes vegades com casos de prova vulgui fer
        for (int i = 0; i < cassosDeProva; i++) {
            metresTortuga = 0;
            metresLlebre = 0;
            comptadorMin = 0;
            metresCarrera = lector.nextInt();
            //Ens assegurem que el valor de metresCarrera es trobi dins dels dessitjats
            if (metresCarrera>=1 && metresCarrera<=10000) {
                velocitatTortuga = lector.nextInt();
                //Ens assegurem que el valor de velocitatTortuga es trobi dins dels dessitjats
                if (velocitatTortuga>=5 && velocitatTortuga<=20) {
                    velocitatLlebre = lector.nextInt(); minCarreraContinuaLlebre = lector.nextInt();
                    //Ens assegurem que els valors de velocitatLlebre i minCarreraContinuaLlebre es trobin dins dels dessitjats
                    if (velocitatLlebre>=5 && velocitatLlebre<=500 && minCarreraContinuaLlebre>=1 && minCarreraContinuaLlebre<=100) {
                        //Bucle per contar els metres de la tortuga i llebre fins que siguin més grans als de la carrera
                        do {
                            comptadorMin++; //Sumem un minut al comptador
                            //if per restar 1metre/min a la tortuga cada 10 min
                            if (comptadorMin%10==0 && velocitatTortuga>5) {
                                velocitatTortuga--;
                            }
                            metresTortuga+=velocitatTortuga; //Sumem els metres recorreguts en 1 min als totals a la tortuga
                            //if perquè la llebre descansi cada quant hagi dit l'usuari
                            if (comptadorMin==minCarreraContinuaLlebre) {
                                //if per definir el descans de la llebre en 5 o 3 min depenent de si es troba per davant, o per darrera o empat amb la tortuga
                                if (metresLlebre>metresTortuga) {
                                    metresLlebre = metresLlebre-(velocitatLlebre*5); //Com que ha d'estar 5min parada, restem 5 voltes els metres recorreguts, que s'aniran igualant corresponentment amb el bucle
                                } else if (metresLlebre<=metresTortuga) {
                                    metresLlebre = metresLlebre-(velocitatLlebre*3);
                                }
                            }
                            metresLlebre+=velocitatLlebre; //Sumem els metres recorreguts en 1 min als totals a la llebre
                        } while (metresTortuga <= metresCarrera && metresLlebre <= metresCarrera);
                        //if per guardar a l'array llebre o tortuga (o empat) depenent de qui hagi guanyat
                        if (metresLlebre>metresCarrera && metresTortuga<metresCarrera) {
                            resultats[i]="LLEBRE";
                        } else if (metresTortuga>metresCarrera && metresLlebre<metresCarrera) {
                            resultats[i]="TORTUGA";
                        } else {
                            resultats[i]="EMPAT";
                        }
                    }
                }
            }
        }
        //Bucle per mostrar els resultats de tots els casos, després d'haver-los compilat tots
        for (int i=0; i<=resultats.length-1; i++) {
            System.out.println(resultats[i]);
        }
    }
}