package desafio04.animal;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("au au au");
    }

    public void abanarRabo(){
        System.out.println("Abanando rabo...");
    }
}
