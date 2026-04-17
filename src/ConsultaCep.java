import com.google.gson.Gson;
import excecao.ExcecaoPersonalizada;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {
    public Endereco buscaEndereco(String cep) {
        try {
            if (cep.length() != 8 || !cep.matches("\\d+")) {
                throw new ExcecaoPersonalizada("CEP inválido.");
            }

            URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(endereco)
                    .build();

            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Endereco enderecoRetornado = new Gson().fromJson(response.body(), Endereco.class);

            if (enderecoRetornado.erro() != null) {
                throw new ExcecaoPersonalizada("CEP não encontrado.");
            }

            return enderecoRetornado;
        } catch (ExcecaoPersonalizada e) {
            System.out.println("Erro detectado: " + e.getMessage());;
        } catch (Exception e) {
            System.out.println("Erro detectado: " + e.getMessage());
        }
        return null;
    }
}