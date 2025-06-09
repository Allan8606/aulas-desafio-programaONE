package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String menssagem;
    public ErroDeConversaoDeAnoException(String menssagem) {
        this.menssagem = menssagem;
    }

    @Override
    public String getMessage() {
        return this.menssagem;
    }
}
