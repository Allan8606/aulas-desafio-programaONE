package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {


        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o filme que deseja buscar: ");
        var busca = leitura.nextLine(); //Foi usado o var, mas para fins didáticos, mas poderia usar diretamente o String
        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=32411471";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();//Estou dizendo que quero que os nomes das variáveis sejam escritos em CamelCase

        TituloOMDB meuTituloOMDB = gson.fromJson(json, TituloOMDB.class);
        Titulo meuTitulo = new Titulo(meuTituloOMDB);
        System.out.println(meuTituloOMDB);
        System.out.println("----------------------");
        System.out.println(meuTitulo);


    }
}
