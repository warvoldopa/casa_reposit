import java.util.Scanner;

public class Q6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float vetor[] = new float[20];
        int cont = 0;
        for(int i = 0; i < (vetor.length/2); i++){
            cont = cont + 1;
            System.out.println("Digite o "+cont+"º valor: ");
            vetor[i] = sc.nextFloat();
        }
        int controle = 0;
        for(int w = 19; w>9; w--){
            vetor[w] = vetor[controle]; 
            controle = controle + 1;
        }
        for(int j = 0; j<vetor.length; j++){
            System.out.println(vetor[j]);
        }
        
    }   
}