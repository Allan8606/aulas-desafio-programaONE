import desafio04.animal.Cachorro;
import desafio04.animal.Gato;

public class Main {
    public static void main(String[] args) {
        Cachorro cachoro = new Cachorro();
        cachoro.setTipo("Cachorro");
        cachoro.setIdade(5);
        cachoro.informacoesAnimal();
        cachoro.emitirSom();
        cachoro.abanarRabo();

        Gato gato = new Gato();
        gato.setTipo("Gato");
        gato.setIdade(3);
        gato.informacoesAnimal();
        gato.emitirSom();
        gato.arranharMoveis();

    }
}
