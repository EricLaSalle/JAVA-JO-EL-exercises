import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inici variables
        int numAlumnes;
        char[] inicial;
        boolean continuar=true;
        int contador=0;
        //Inici escaner
        Scanner sc = new Scanner(System.in);
        //Inici programa
        numAlumnes = sc.nextInt();
        if (numAlumnes >= 3 && numAlumnes <= 400000) {
            inicial = new char[numAlumnes];
            for (int i = 0; i < numAlumnes; i++) {
                inicial[i] = sc.next().charAt(0);
            }
            do {
                for (int i = 0; i < (numAlumnes-2); i++) {
                    if (inicial[i] == 'F' && inicial[i+1] == 'S' && inicial[i+2] == 'C') {
                        if (i<(numAlumnes-5)) {
                            for (int j=i; j < numAlumnes-3; j++) {
                                inicial[i+j]=inicial[j+3];
                            }
                            inicial[numAlumnes-1]=' ';
                            inicial[numAlumnes-2]=' ';
                            inicial[numAlumnes-3]=' ';
                        } else if (i==(numAlumnes-5)) {
                            inicial[i]=inicial[i+3];
                            inicial[i+1]=inicial[i+4];
                            inicial[numAlumnes-1]=' ';
                            inicial[numAlumnes-2]=' ';
                            inicial[numAlumnes-3]=' ';
                        } else if (i==(numAlumnes-4)) {
                            inicial[i]=inicial[i+3];
                            inicial[numAlumnes-1]=' ';
                            inicial[numAlumnes-2]=' ';
                            inicial[numAlumnes-3]=' ';
                        } else if (i==(numAlumnes-3)) {
                            inicial[numAlumnes-1]=' ';
                            inicial[numAlumnes-2]=' ';
                            inicial[numAlumnes-3]=' ';
                        }
                    }
                }
                for (int i = 0; i < (numAlumnes-2); i++) {
                    if (inicial[i] == 'F' && inicial[i+1] == 'S' && inicial[i+2] == 'C') {
                        continuar=true;
                        break;
                    } else {
                        continuar=false;
                    }
                }
            } while (continuar);
            for (int i = 0; i < numAlumnes; i++) {
                if (inicial[i]!=' ') {
                    contador++;
                }
            }
            System.out.println(contador);
        }
    }
}