import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de pacientes:");
        int pacientes = sc.nextInt();
        int idadevelho = 0;
        int i=1;
        while(i<=pacientes){
            System.out.println("Informe a idade " + i+":");
            int idade = sc.nextInt();
            if (idade > idadevelho && idade<=100){
                idadevelho = idade;
                i++;
            }else{
                System.out.println("Número Inválido!Tente Novamente!");
            }
        }
        System.out.println("Idade do mais velho é " + idadevelho +" anos");
    }
}