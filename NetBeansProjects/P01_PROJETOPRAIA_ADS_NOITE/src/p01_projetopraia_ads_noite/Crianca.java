
package p01_projetopraia_ads_noite;

public class Crianca {
    //atributos:
     String corCabelo;
     String corPele;
     double altura;
     int    idade;
     //métodos
    void brincar(){
         
         System.out.println("brincando...");
         }
    void correr (double metros) {
        System.out.println("Correr por "+ metros+ "metros");
    }
    void nadar (double metros){
        System.out.println("Nadando por"+metros+ "metros" );
    }
    String sorrir(){
        return ":";
        
     } 
    void imprimirAtributos(){
        System.out.println("Cor do Cabelo" + corCabelo);
        System.out.println("Cor da Pele" + corPele);
        System.out.println("Altura" + altura);
        System.out.println("idade"  + idade);
        }//fim do main
}//fim da classe crianca
