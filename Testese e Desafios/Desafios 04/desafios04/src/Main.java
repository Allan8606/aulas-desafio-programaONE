//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        IdadePessoa pessoa01 = new IdadePessoa();
        pessoa01.setNome("José Arthur Lima Costa");
        pessoa01.setIdade(20);



        System.out.println("A pessoa: " + pessoa01.getNome() + " tem " + pessoa01.getIdade() + "anos de idade." );
        System.out.println("Então, " + pessoa01.getNome() + " é " );
        pessoa01.maiorDeIdade();





    }
}