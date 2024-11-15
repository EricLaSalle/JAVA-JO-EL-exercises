import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inicialització variables
        int x;
        int y;
        //Inicialització escaner
        Scanner sc = new Scanner(System.in);
        //Inici programa
        x = sc.nextInt(); //Lectura x
        y = sc.nextInt(); //Lectura y
        if (x<0) { //Si punt x -
            if (y<0) { //Si punt y -
                System.out.println("3"); //Quadrant 3
            } else if (y>0) { //Si punt y +
                System.out.println("2"); //Quadrant 2
            } else if (y==0) { //Si punt y = 0
                System.out.println("2,3"); //Quadrant 2 i 3
            }
        } else if (x>0) { //Si punt x +
            if (y<0) { //Si punt y -
                System.out.println("4"); //Quadrant 4
            } else if (y>0) { //Si punt y +
                System.out.println("1"); //Quadrant 1
            } else if (y==0) { //Si y = 0
                System.out.println("1,4"); //Quadrant 1 i 4
            }
        } else if (x==0) { //Si punt x = 0
            if (y<0) { //Si punt y -
                System.out.println("3, 4"); //Quadrants 3 i 4
            } else if (y>0) { //Si punt y +
                System.out.println("1, 2"); //Quadrants 1 i 2
            } else if (y==0) { //Si punt y = 0
                System.out.println("1, 2, 3, 4");
            }
        }
    }
}