public record Endereco(String cep, String logradouro,
                       String complemento, String unidade,
                       String bairro, String localidade,
                       String uf, String estado,
                       String regiao, String erro) {
    @Override
    public String toString() {
        return "CEP: " + cep + "\n" +
                "Logradouro: " + logradouro + "\n" +
                "Complemento: " + complemento + "\n" +
                "Unidade: " + unidade + "\n" +
                "Bairro: " + bairro + "\n" +
                "Localidade: " + localidade + "\n" +
                "UF: " + uf + "\n" +
                "Estado: " + estado + "\n" +
                "Região: " + regiao;
    }
}
