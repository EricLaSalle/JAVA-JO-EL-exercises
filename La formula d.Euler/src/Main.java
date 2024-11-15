import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicialització variables
        int numCasos = 0;
        int numNums = 0;
        int canvi = 0;
        String respostaActual = "";
        //Inicialització escaner
        Scanner sc = new Scanner(System.in);
        //Inici programa
        numCasos = sc.nextInt();
        String[] respostes = new String[numCasos]; //Creem array per guardar respostes segons el num de casos
        //for per repetir el procés segons el num de casos
        for (int i = 0; i < numCasos; i++) {
            //Reinici variables
            respostaActual = "";
            numNums = sc.nextInt();
            int[] nums = new int[numNums]; //Creem array per guardar nums segons el num de nums
            int[] sumaNums = new int[numNums/2]; //Creem array per guardar sumes nums
            //For per guardar nums a l'array nums
            for (int j=0; j<numNums; j++) {
                nums[j] = sc.nextInt();
            }
            //Bucle per ordenar ascendentment l'array per facilitar el problema
            for (int j=0; j<nums.length; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    if (nums[j]>nums[k]) {
                        canvi=nums[k];
                        nums[k]=nums[j];
                        nums[j]=canvi;
                    }
                }
            }
            //For per fer i guardar les sumes dels números dels extrems
            for (int j=0; j<(nums.length/2); j++) {
                sumaNums[j]=nums[j]+nums[nums.length-j-1];
            }
            //for per mostrar la suma abans de tornar a començar el procés
            for (int j=0; j<sumaNums.length; j++) {
                respostes[i]=(sumaNums[j] + " ");
                respostaActual += sumaNums[j] + " ";
            }
            respostes[i]=respostaActual;
        }
        //for per imprimir el resultat
        for (int i=0; i< respostes.length; i++) {
            System.out.println(respostes[i]);
        }
    }
}