package p02_projetoheroi_ads_noite;

public class Heroi {

    //1.atributos;
    private String genero;
    private double forcaAtaque;
    private double altura;
    private String nome;

    //criar método set e get para os atributos;
    public void setGenero(String genero) {
        if (genero.length() >= 1 && genero.length() <= 100) {
            this.genero = genero; //válido!!
        } else {
            System.out.println("Erro! Genero inválido");
            System.exit(0);//encerra o programa
        }
    }//fim do setGenero

    public String setGenero() {
        return this.genero;
    }

    public void setForcaAtaque(double forca) {
        if (forca > 0) {
            this.forcaAtaque = forca;
        } else {
            System.out.println("Erro! Força de Ataque" + "inválido");
            System.exit(0);
        }
    }//fim do força de ataque;

    public double getforcaAtaque() {
        return this.forcaAtaque;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Erro! Altura invalida ");
            System.exit(0);
        }
    }//fim da altura

    public double getAltura() {
        return this.altura;
    }

    public void setNome(String nome) {
        if (nome.length() >= 1 && nome.length() <= 50) {
            this.nome = nome;
        } else {
            System.out.println("Erro! nome inválido");
            System.exit(0);
        }
    }

    public String getNome() {
        return this.nome;
    }

    //2. método;
    double atacar() {
        return this.forcaAtaque = 0.90;
    }//fim do atacar;
//3.construtor nao parametrizado

    public Heroi() {

    }
//4.construtor parametrizado;

    public Heroi(String genero, double forcaAtaque, double altura, String nome) {
        this.setGenero( genero );
        this.setForcaAtaque( forcaAtaque );
        this.setAltura( altura );
        this.setNome( nome );
    }//fim do construtor parametrizado;

    //5.metodo para imprimir atributos;
    void imprimirAtributos() {
        System.out.println("######################");
        System.out.println("GEnero " + this.genero);
        System.out.println("Força ataque " + this.forcaAtaque);
        System.out.println("Altura " + this.altura);
        System.out.println("Nome: " + this.nome);
    }
}//fim da classe;

