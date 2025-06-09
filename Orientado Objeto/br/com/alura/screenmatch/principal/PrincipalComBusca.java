package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {


        Scanner leitura = new Scanner(System.in);

        String busca = "";

        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();//Estou dizendo que quero que os nomes das variáveis sejam escritos em CamelCase



        while (!busca.equalsIgnoreCase("sair")) {


        System.out.println("Digite o filme que deseja buscar: ");
        busca = leitura.nextLine(); //Foi usado o var, mas para fins didáticos, mas poderia usar diretamente o String

        if (busca.equalsIgnoreCase("sair")) {
            break;
        }

        String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=32411471";
        System.out.println(endereco);


        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);


            TituloOMDB meuTituloOMDB = gson.fromJson(json, TituloOMDB.class);


            Titulo meuTitulo = new Titulo(meuTituloOMDB);
            System.out.println(meuTituloOMDB);
            System.out.println("----------------------");
            System.out.println(meuTitulo);

            titulos.add(meuTitulo);

            /*FileWriter escrita = new FileWriter("filmes.txt");
            escrita.write(meuTitulo.toString());
            escrita.close();*/


        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento foi encontrado: ");
            System.out.println(e.getMessage());
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());

        }
    }
        System.out.println(titulos);

    FileWriter escrita = new FileWriter("filmes.json");
    escrita.write(gson.toJson(titulos));
    escrita.close();


        System.out.println("Programa finalizado com sucesso.");

    }
}
