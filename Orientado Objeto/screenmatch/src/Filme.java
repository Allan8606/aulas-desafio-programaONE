public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;


    void exibiFichaTecnica() {
        System.out.println("O nome do filme é: " + nome);
        System.out.println("O filme foi lancado em: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMediaDasAvaliacoes(){
        return somaAvaliacoes / totalDeAvaliacoes;
    }
}

