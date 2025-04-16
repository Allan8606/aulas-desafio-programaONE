package desafio04.animal;

public class Animal {
    private String tipo;
    private int idade;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void informacoesAnimal(){
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Idade: " + this.getIdade());
    }

    public void emitirSom(){
        System.out.println("Emitindo som...");
    }
}
