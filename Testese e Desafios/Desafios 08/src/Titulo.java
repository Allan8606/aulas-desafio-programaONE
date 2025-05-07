public class Titulo implements Comparable<Titulo> {
    String nome;

    @Override
    public int compareTo(Titulo outro) {
        return this.nome.compareTo(outro.nome);
    }
}
