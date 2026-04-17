import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class CriaArquivo {
    public void criaJson(Endereco endereco) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter escrita = new FileWriter(endereco.cep() + ".json");
            escrita.write(gson.toJson(endereco));
            escrita.close();
        } catch (IOException e) {
            System.out.println("Erro detectado: " + e.getMessage());
        }
    }
}
