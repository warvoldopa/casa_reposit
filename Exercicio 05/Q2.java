import java.util.Scanner;

public class Q2 {
    public static int maior(int grande[]){
        int maior = 0;
        for(int i=0; i<grande.length ; i++){
            if(maior<grande[i]){
                maior = grande[i];
            }
        }
        return maior;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        for(int j=0; j<vetor.length ; j++){
            System.out.println("Digite um valor inteiro: ");
            vetor[j] = sc.nextInt(); 
        }
        System.out.println("O maior valor digitado foi: "+maior(vetor));
    }
}