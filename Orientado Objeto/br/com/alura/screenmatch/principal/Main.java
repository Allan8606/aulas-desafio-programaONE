package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.Recomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme ("Velozes e Furiosos", 2014);
        //menos eficente: meuFilme.setNome("Velozes e Furiosos");
        //meuFilme.setAnoDeLancamento(2014);
        meuFilme.setDuracaoEmMinutos(137);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);//esse nome nota foi a IDE que declarou, mas em, outras IDEs não tem necessidades
        meuFilme.avalia(10);
        meuFilme.avalia(9);


        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMediaDasAvaliacoes());


        Serie dragonBall = new Serie("Dragon Ball", 1989);
        // dragonBall.setNome("Dragon Ball");
        //dragonBall.setAnoDeLancamento(1989);
        dragonBall.exibiFichaTecnica();
        dragonBall.setTemporadas(10);
        dragonBall.setEpisodiosPorTemporada(25);
        dragonBall.setMinutosPorEpisodio(25);
        System.out.println("Duração para maratonar DragonBall: " + dragonBall.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(dragonBall);
        System.out.println(calculadora.getTempoTotal());

        Recomendacao filtroRecomendacao = new Recomendacao();
        filtroRecomendacao.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(dragonBall);
        episodio.setTotalVisualizacoes(300);
        filtroRecomendacao.filtra(episodio);



        var batman = new Filme("Batman - O Cavaleiro das Trevas", 2008); //Posso usar o var, pois ele sabe que o filme é um Filme
        // maneira menos eficiente: batman.setNome("Batman - O Cavaleiro das Trevas");
        //batman.setAnoDeLancamento(2008);
        batman.setDuracaoEmMinutos(160);
        batman.avalia(10);

        ArrayList <Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(batman);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da minha lista: " + listaDeFilmes.size());
        System.out.println("O primeiro filme da minha lista é: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do Filme: " + listaDeFilmes.get(0).toString());






    }
}
