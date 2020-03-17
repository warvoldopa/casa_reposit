
package p02_projetoheroi_ads_noite;


public class P02_projetoheroi_ads_noite {
    public static void main(String[] args) {
    //6.criar objeto pelo construtor nao parametrizado
        Heroi batman = new Heroi();
    //7.chamar o metodo de imprimirAtributos;
        batman.setNome("Batman");
        batman.setGenero ("Masculino");
        batman.setForcaAtaque (300);
        batman.setGenero  ("masculino");
        batman.imprimirAtributos();
     
    //8.criar objeto pelo construtor parametrizado;(na ordem da classe: genero,força e altura)
        Heroi superman = new Heroi ("mastulino", 1000, 1.81,"Superman"); 
        superman.imprimirAtributos();
    //9.chamar o método atacar;   
        System.out.println("Ataque batman: " +batman.atacar());
        System.out.println("Ataque superman " +superman.atacar());
        }
    }//fim do main
    

