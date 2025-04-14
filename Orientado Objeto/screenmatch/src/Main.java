import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme ();

        meuFilme.setNome("Velozes e Furiosos");
        meuFilme.setAnoDeLancamento(2014);
        meuFilme.setDuracaoEmMinutos(137);

        meuFilme.exibiFichaTecnica();

        meuFilme.avalia(8);//esse nome nota foi a IDE que declarou, mas em, outras IDEs não tem necessidades
        meuFilme.avalia(10);
        meuFilme.avalia(9);


        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMediaDasAvaliacoes());

    }
}
