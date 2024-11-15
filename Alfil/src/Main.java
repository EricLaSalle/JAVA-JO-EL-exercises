import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        int casos = 0;
        String posicio;
        String[][] tauler = {
                {"a1","b1","c1","d1","e1","f1","g1","h1"},
                {"a2","b2","c2","d2","e2","f2","g2","h2"},
                {"a3","b3","c3","d3","e3","f3","g3","h3"},
                {"a4","b4","c4","d4","e4","f4","g4","h4"},
                {"a5","b5","c5","d5","e5","f5","g5","h5"},
                {"a6","b6","c6","d6","e6","f6","g6","h6"},
                {"a7","b7","c7","d7","e7","f7","g7","h7"},
                {"a8","b8","c8","d8","e8","f8","g8","h8"},
        };
        int[] vector_posicio = new int[2];
        int[] respostes;

        //inici escaner
        Scanner lector = new Scanner(System.in);

        //inici programa
        casos = lector.nextInt(); //llegim valor de casos
        respostes = new int[casos]; //declarem respostes segons valor de casos
        //bucle per fer segons valor de casos
        for (int i = 0; i < casos; i++) {
            posicio = lector.next(); //llegim la posicio de l'alfil
            //for per recórrer la matriu en busca de la posició
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    //if per anar comprovant quan coincideix posicio amb tauler
                    if (posicio.contains(tauler[j][k])) {
                        //guardem la posicio a vector_posicio
                        vector_posicio[0] = j;
                        vector_posicio[1] = k;
                        break;
                    }
                }
            }
            //if else if... per saber a quantes caselles es pot moure l'alfil, reduint poc a poc l'espai fins trobar-lo
            if (vector_posicio[0]==7 || vector_posicio[1]==7 || vector_posicio[0]==0 || vector_posicio[1]==0) {
                respostes[i] = 7;
            } else if (vector_posicio[0]==6 || vector_posicio[1]==6 || vector_posicio[0]==1 || vector_posicio[1]==1) {
                respostes[i] = 9;
            } else if (vector_posicio[0]==5 || vector_posicio[1]==5 || vector_posicio[0]==2 || vector_posicio[1]==2) {
                respostes[i] = 11;
            } else if (vector_posicio[0]==4 || vector_posicio[1]==4 || vector_posicio[0]==3 || vector_posicio[1]==3) {
                respostes[i] = 13;
            }
        }
        //bucle per imprimir el vector respostes
        for (int i = 0; i < casos; i++) {
            System.out.println(respostes[i]);
        }
    }
}