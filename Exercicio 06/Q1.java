import java.util.Scanner;

public class Q1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int matriz1[][] = new int[5][3];
        int matriz2[][] = new int[5][3];
        int soma[][] = new int[5][3];
        for(int i = 0; i<5; i++){
            for(int j = 0; j<3; j++){
                System.out.println("Digite um valor: ");
                matriz1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<5; i++){
            for(int j = 0; j<3; j++){
                System.out.println("Digite um valor: ");
                matriz2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<5; i++){
            for(int j = 0; j<3; j++){
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        for(int i = 0; i<5; i++){
            for(int j = 0; j<3; j++){
                System.out.println("o valor da soma dos elementos das primeiras matrizes, está na posição ["+i+" "+j+"] da matriz nova, e é igual a "+soma[i][j]+"!");
            }
        }
    }
}