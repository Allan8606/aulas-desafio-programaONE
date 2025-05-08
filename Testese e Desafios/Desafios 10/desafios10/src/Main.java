
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String jsonPessoa = "{ \"nome\": \"João\", \"cidade\": \"São Paulo\" }";

        String jsonLivro = "{ \"titulo\": \"Livro 1\", \"autor\": \"Allan Isaac\", \"editora\": \"Editora 1\" }";

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        System.out.println(pessoa);
        System.out.println(livro);


    }
}