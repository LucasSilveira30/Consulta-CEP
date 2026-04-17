package excecao;

public class ExcecaoPersonalizada extends RuntimeException {
    private String mensagem;

    public ExcecaoPersonalizada(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
