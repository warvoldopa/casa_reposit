import java.util.Scanner;

public class Q8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de dígitos que há em sua conta: ");
        int dig = sc.nextInt();
        int vetor[] = new int[dig];
        int soma = 0;
        int cont = 1;
        for(int x = 0; x<vetor.length; x++){
            System.out.println("Digite o "+cont+"º dígito da sau conta: ");
            vetor[x] = sc.nextInt();
            soma = vetor[x] + soma;
            cont = cont + 1;
        }
        int resto = soma % 10;
        System.out.println("O seu dígito verificador é "+resto+"!");
    }
}