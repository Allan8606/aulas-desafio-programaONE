import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu Filme Favorito");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano do lançamento?");
        int anoLancamento = leitura.nextInt();

        System.out.println("De 0 a 10, qual a sua nota para o filme");
        double notaFilme = leitura.nextDouble();

        System.out.println("Então seu filme favorito é: " + filme + ", com o lançamentono ano de: " + anoLancamento + ", no qual você deu a nota de " + notaFilme);
    }
}
