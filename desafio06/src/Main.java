import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaNinja<Ninja> ninjas = new ListaNinja<>();

        ninjas.adicionar(new Ninja("Naruto", 16, "Konoha"));
        ninjas.adicionar(new Ninja("Sasuke", 16, "Konoha"));
        ninjas.adicionar(new Ninja("Sakura", 16, "Konoha"));
        ninjas.adicionar(new Ninja("Kakashi", 30, "Konoha"));
        ninjas.adicionar( new Ninja("Itachi", 21, "Konoha"));
        ninjas.adicionar(new Ninja("Jiraya", 50, "Konoha"));
        ninjas.adicionar(new Ninja("Tsunade", 50, "Konoha"));

        ninjas.mostrarItens();

        System.out.println("------------------");

        //Remover o primro item
        ninjas.adicionarNoInicio(new Ninja("Hinata", 16, "Konoha"));
        ninjas.mostrarItens();

        System.out.println("------------------");

        //Remover o último item
        ninjas.removerDoFim();
        ninjas.mostrarItens();

        System.out.println("------------------");

        //Acessar um item específico
        ninjas.acessarItem(5);
    }
}