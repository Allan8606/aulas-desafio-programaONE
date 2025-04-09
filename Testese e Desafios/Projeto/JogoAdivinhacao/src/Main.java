import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        System.out.println(numeroAleatorio);

        for (int i = 0; i <= 5; i++){
            int numeroUsuario = leitura.nextInt();
            tentativas++;
            if (numeroUsuario == numeroUsuario){
                System.out.println("Parabéns você acertou na " + tentativas + "º");
                return;
            } else if (numeroUsuario < numeroAleatorio) {
                if (tentativas > 5){
                    System.out.println("Que pena você atingiu o limite máximo de tentativas.");
                }

                System.out.println("O número aleatório é maior que o número que você escolheu.");
                System.out.println("Restam apenas mais " + (5-tentativas) + " tentativas.");
            } else if (numeroUsuario > numeroAleatorio) {
                if (tentativas > 5){
                    System.out.println("Que pena você atingiu o limite máximo de tentativas.");
                }

                System.out.println("O número aleatório é menor que o número que você escolheu.");
                System.out.println("Restam apenas mais " + (5-tentativas) + " tentativas.");

            }

        }
    }
}