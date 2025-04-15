import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme ();

        meuFilme.setNome("Velozes e Furiosos");
        meuFilme.setAnoDeLancamento(2014);
        meuFilme.setDuracaoEmMinutos(137);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);//esse nome nota foi a IDE que declarou, mas em, outras IDEs não tem necessidades
        meuFilme.avalia(10);
        meuFilme.avalia(9);


        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMediaDasAvaliacoes());


        Serie dragonBall = new Serie();
        dragonBall.setNome("Dragon Ball");
        dragonBall.setAnoDeLancamento(1989);
        dragonBall.exibiFichaTecnica();
        dragonBall.setTemporadas(10);
        dragonBall.setEpisodiosPorTemporada(25);
        dragonBall.setMinutosPorEpisodio(25);
        System.out.println("Duração para maratonar DragonBall: " + dragonBall.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(dragonBall);
        System.out.println(calculadora.getTempoTotal());

    }
}
