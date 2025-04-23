import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto produto01 = new Produto("Notebook", 2000, 1);
        Produto produto02 = new Produto("Monitor", 1500, 2);
        Produto produto03 = new Produto("Teclado", 350, 3);
        Produto produto04 = new Produto("Mouse", 300, 4);

        //Criando uma lista de produtos
        ArrayList <Produto> listaDeProdutos = new ArrayList<>();
        //Adicionando produtos na lista
        listaDeProdutos.add(produto01);
        listaDeProdutos.add(produto02);
        listaDeProdutos.add(produto03);
        listaDeProdutos.add(produto04);

        //Imprimindo o tamanho da lista
        System.out.println("Sua lista de produtos tem o tamanho de " + listaDeProdutos.size());
        //Imprimindo o primeiro produto da lista
        System.out.println("O primiero item da lista de produtos é: " + listaDeProdutos.get(0).getNome());
        //Imprimindo todos os produtos da lista
        System.out.println("Sua lista de produtos: " + listaDeProdutos.toString());



        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }

    }
}