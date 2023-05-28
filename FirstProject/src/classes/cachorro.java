package classes;

public class cachorro {
    private String nome;
    public String cor;
    public int altura;
    public int peso;


    // Construtor
    public cachorro() {}

    public cachorro(String cor, int altura, int peso) {
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
    }


    private String estado;


    // Encapsulamento
    public String getNome(String nome) {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    // --



    public void comer() {}

    public void latir() {
        System.out.println("Au au");
    }

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {


        //enum - estudar 

        switch (acao){
            case "carrinho": this.estado = "Feliz"; break;
            default: this.estado = "Neutro"; break;
        }

        // if (acao.equals("carrinho")) {
        //     this.estado = "Feliz";
        // } else {
        //     this.estado = "Neutro";
        // }

        return estado;
    }
}