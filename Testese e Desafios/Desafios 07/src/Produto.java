public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    //Usando o toString
    @Override
    public String toString() {
        return "Produto: " + this.nome + ", Preco: " + this.preco + ", Quantidade: " + this.quantidade;
    }



    //getters e setters
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }


}
