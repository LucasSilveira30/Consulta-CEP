import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite um número de CEP para consulta: ");
        String cep = leitor.nextLine();

        Endereco novoEndereco = consultaCep.buscaEndereco(cep);

        if (novoEndereco != null) {
            System.out.println(novoEndereco);
            CriaArquivo gerador = new CriaArquivo();
            gerador.criaJson(novoEndereco);
        } else {
            System.out.println("Não foi possível encontrar o endereço.");
        }

        System.out.println("Encerrando o programa...");
    }
}
