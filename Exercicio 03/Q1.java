import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de avaliações:");
        int avaliacoes = sc.nextInt();
        double media= 0;
        for(int i = 1; i<=avaliacoes; i++){
            System.out.print("Informe a "+i+"ª nota: ");
            double nota = sc.nextDouble();
             media = media + nota;
        }
        media = media / avaliacoes;
        System.out.println("média:"+ media);

    }

}