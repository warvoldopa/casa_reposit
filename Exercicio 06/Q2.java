import java.util.Scanner;

public class Q2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int matrizX[][] = new int[2][2];
        int matrizY[][] = new int[2][2];
        int matrizZ[][] = new int[2][4];
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.println("Digite um valor");
                matrizX[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.println("Digite um valor");
                matrizY[i][j] = sc.nextInt();
            }
        }
        int x = 0;
        int i = 0;
        for(int j = 0; j<4; j++){
            matrizZ[0][j] = matrizX[i][x];
            if(x == 1){
                x = 0;
                i++;
            }else{
                x++;
            }    
        }
        x = 0;
        i = 0;
        for(int j=0; j<4; j++){
            matrizZ[1][j] = matrizY[i][x];
            if(x == 1){
                x = 0;
                i++;
            }else{
                x++;
            }    
        }
        for(i = 0; i<2; i++){
            for(int j = 0; j<4; j++){
                System.out.println("Na posição ["+i+","+j+"] está contido o valor: "+matrizZ[i][j]);
            }
        }
    }
}