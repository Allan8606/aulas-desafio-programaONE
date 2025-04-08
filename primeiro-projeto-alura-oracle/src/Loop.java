import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double media = 0;
        double notaFilme = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("De 0 a 10, qual a sua nota para o filme");
            notaFilme = leitura.nextDouble();
            media += notaFilme;
        }
        System.out.println("Média das notas: " + media / 3);
    }
}
