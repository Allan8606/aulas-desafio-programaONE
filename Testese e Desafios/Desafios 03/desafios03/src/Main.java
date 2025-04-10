public class Main {
    public static void main(String[] args) {

        Pessoa pesoa1 = new Pessoa();
        pesoa1.falar();

        Calculadora calculadora1 = new Calculadora();
        System.out.println(calculadora1.calculaDobro(10));


        Musica musica1 = new Musica();
        musica1.artista = "Rosa de Saron";
        musica1.anoLancamento = 2000;
        musica1.mostraFichaTecnica();
        musica1.avalia(10);
        musica1.avalia(7);
        musica1.avalia(8.5);
        musica1.mostraMediaAvaliacao();








    }
}
