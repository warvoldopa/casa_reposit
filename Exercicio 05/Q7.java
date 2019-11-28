import java.util.Scanner;

public class Q7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int vet1[] = new int[30];
        int vet2[] = new int[30];
        int s[] = new int[30];
        for(int i = 0; i<vet1.length; i++){
            System.out.println("Digite o valor que irá ficar na posição "+i+":");
            vet1[i] = sc.nextInt();
        }
        for(int i = 0; i<vet1.length; i++){
            System.out.println("Digite o valor que irá ficar na posição "+i+":");
            vet2[i] = sc.nextInt();
        }
        for(int i = 0; i<vet1.length; i++){
            s[i] = vet1[i] + vet2[i];
        }
        for(int i = 0; i<vet1.length; i++){
            System.out.println("O valor contido no 1º vetor e na posição "+i+" é igual a: "+vet1[i]);
            System.out.println("O valor contido no 2º vetor e na posição "+i+" é igual a: "+vet2[i]);
            System.out.println("A soma dos valores contidos na posição dos vetores acima é igual a: "+s[i]);
        }
    }
}