
package p01_projetopraia_ads_noite;


public class P01_PROJETOPRAIA_ADS_NOITE {

   
    public static void main(String[] args) {
        //criar os objetos da classe Crianca
        Crianca c1;
        c1 = new Crianca();
        c1.imprimirAtributos();
        c1.altura = 1.2;
        c1.corCabelo = "maior";
        c1.corPele = "braca";
        c1.idade = 4;
        c1.imprimirAtributos();
        
        //chamada do método da classe Criança;
        System.out.println("------------------");
        c1.nadar( 1.1 );
        c1.correr( 8.9 );
        c1.brincar();
        String sorriso = c1.sorrir();
        System.out.println(sorriso);
        System.out.println("------------------");
     }
    
}
