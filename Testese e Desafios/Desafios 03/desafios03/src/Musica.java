public class Musica {
    String artista;
    int anoLancamento;
    double somaDasAvaliacao;
    int numeroDeAvaliacoes;

    void mostraFichaTecnica(){
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lancamento: " + anoLancamento);
    }

    void avalia(double nota){
        numeroDeAvaliacoes++;
        somaDasAvaliacao += nota;


    }

    void mostraMediaAvaliacao(){
        System.out.println("O artista " + artista + " foi avaliado " + numeroDeAvaliacoes + ", e nessa avaliações, teve uma média de " + somaDasAvaliacao / numeroDeAvaliacoes + ", de todas as notas que obteve.");
    }



}
