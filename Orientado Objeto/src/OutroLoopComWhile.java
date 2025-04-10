
import java.util.Scanner;


public class OutroLoopComWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double media = 0;
        double notaFilme = 0;
        int totalDeNotas = 0;

        while (notaFilme != -1) {
            System.out.println("De 0 a 10, qual a sua nota para o filme, ou -1 para sair");
            notaFilme = leitura.nextDouble();

            if(notaFilme != -1){
                media += notaFilme;
                totalDeNotas++;
            }
        }
        System.out.println("Média das notas: " + media / totalDeNotas);


    }
}
