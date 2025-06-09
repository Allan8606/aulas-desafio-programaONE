package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {

    private String nome;

    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOMDB meuTituloOMDB) {
        this.nome = meuTituloOMDB.title();

        if(meuTituloOMDB.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano " +
                    "porque tem mais de 04 caracteres.");
        }

        this.anoDeLancamento = Integer.valueOf(meuTituloOMDB.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOMDB.runtime().substring(0, 2));

    }


//getters

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }


    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibiFichaTecnica() {
        System.out.println("O nome do filme é: " + nome);
        System.out.println("O filme foi lancado em: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        //Aqui é aonde vamos comparar
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "(nome = " + nome  +
                ", ano do lançamento = " + anoDeLancamento + ", " + "Duracao em minutos = " + duracaoEmMinutos + ")";
    }
}
