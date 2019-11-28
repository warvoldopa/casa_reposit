import java.util.Scanner;

public class Q1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        int i;
        for(i = 0; i < vetor.length; i++){
            System.out.print("Digite o valor que ficará no índice "+i+" :");
            vetor[i] = sc.nextInt();
        }
    }
}