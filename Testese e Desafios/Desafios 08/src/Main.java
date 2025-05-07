import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Crie uma lista de números inteiros e utilize o meodo Collections.sort
        // para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.

        List<Integer> listaNumeros = new LinkedList<>();
        listaNumeros.add(1);
        listaNumeros.add(22);
        listaNumeros.add(3);
        listaNumeros.add(45);
        listaNumeros.add(25);
        listaNumeros.add(16);
        Collections.sort(listaNumeros);
        System.out.println(listaNumeros);









    }
}