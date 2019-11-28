import java.util.Scanner;

public class Q3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double vetor[] = new double[30];
        for(int i = 0; i<vetor.length; i++ ){
            vetor[i] = Math.pow(i,2);
            System.out.println(vetor[i]);
        } 
    }
}