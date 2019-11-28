import java.util.Scanner;

public class Q4 {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float vetor[] = new float[3];
        for(int i = 0; i<vetor.length; i++){
            System.out.println("Digite um valor: ");
            vetor[i] = sc.nextFloat();
        }
        for(int j = 0; j<vetor.length; j++){
            if(j%2!=0){
                System.out.println("O valor "+vetor[j]+" está guardado na posição "+j+"!");
            }
        }
    }
}