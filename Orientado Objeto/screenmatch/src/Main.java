public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme ();

        meuFilme.nome = "Velozes e Furiosos";
        meuFilme.anoDeLancamento = 2014;
        meuFilme.incluidoNoPlano = true;
        meuFilme.duracaoEmMinutos = 137;

        meuFilme.exibiFichaTecnica();

        meuFilme.avalia(8);//esse nome nota foi a IDE que declarou, mas em, outras IDEs não tem necessidades
        meuFilme.avalia(10);
        meuFilme.avalia(9);

        System.out.println(meuFilme.somaAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);

        System.out.println(meuFilme.pegaMediaDasAvaliacoes());

    }
}
