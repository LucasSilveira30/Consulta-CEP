# Consulta de CEP

Este é um projeto desenvolvido em **Java** com o intuito de praticar conceitos de consumo de APIs, serialização e desserialização de arquivos JSON utilizando bibliotecas externas, tratamento de exceções e manipulação de dados em arquivos, além de reforçar a programação orientada a objetos.

---

## Sobre o Projeto

A **Consulta de CEP** é uma aplicação que permite buscar informações de um endereço a partir de um CEP informado pelo usuário, consumindo a API pública **ViaCEP** e salvando o resultado em um arquivo `.json`.

O objetivo do projeto é praticar conceitos fundamentais da linguagem Java, incluindo:

- Consumo de APIs com `HttpClient` e `HttpRequest`
- Serialização e desserialização de JSON com a biblioteca **Gson**
- Tratamento de exceções com `try/catch/finally` e exceções personalizadas
- Manipulação de arquivos com `FileWriter`
- Programação orientada a objetos (POO)
- Organização de código em classes e records

---

## Funcionalidades

O sistema permite:

- Receber um CEP digitado pelo usuário
- Validar se o CEP possui exatamente 8 dígitos numéricos
- Consultar o endereço correspondente na API ViaCEP
- Exibir os dados do endereço no console
- Salvar o endereço em um arquivo `.json` nomeado com o CEP consultado
- Tratar erros como CEP inválido, CEP inexistente e falhas de conexão

---

## Tecnologias Utilizadas

- Java
- `HttpClient` e `HttpRequest` para consumo de API
- Biblioteca **Gson** para manipulação de JSON
- `FileWriter` para criação de arquivos
- `Record` para modelagem de dados
- Entrada de dados com `Scanner`
- Exceções personalizadas com `RuntimeException`

---

## Estrutura do Projeto

O projeto é organizado nas seguintes classes:

- `Endereco` — record que modela os dados do endereço retornado pela API
- `ConsultaCep` — classe responsável por consumir a API ViaCEP e retornar um objeto `Endereco`
- `CriaArquivo` — classe responsável por salvar o endereço em um arquivo `.json`
- `ExcecaoPersonalizada` — classe de exceção personalizada para tratar erros de validação
- `Principal` — classe principal que coordena a execução do programa

---

## Como Executar o Projeto

1. Clone o repositório:
`git clone https://github.com/seu-usuario/desafiofinal.git`

2. Acesse a pasta do projeto:
`cd desafiofinal`

3. Adicione a biblioteca Gson ao classpath e compile os arquivos Java:
`javac -cp gson.jar src/*.java`

4. Execute a aplicação:
`java -cp .:gson.jar Principal`

---

## Exemplo de Uso

```
Digite um número de CEP para consulta:
01001000
CEP: 01001-000
Logradouro: Praça da Sé
Complemento: lado ímpar
Unidade: 
Bairro: Sé
Localidade: São Paulo
UF: SP
Estado: São Paulo
Região: Sudeste
Encerrando o programa...
```

O arquivo `01001-000.json` será gerado automaticamente na pasta do projeto.

---

## Objetivo Educacional

Este projeto foi desenvolvido com o objetivo de:

- Consolidar conhecimentos em Java
- Praticar o consumo de APIs REST com `HttpClient`
- Trabalhar com serialização e desserialização de JSON usando **Gson**
- Exercitar o tratamento de exceções e criação de exceções personalizadas
- Gravar dados em arquivos com `FileWriter`
- Aplicar conceitos de POO com classes e records
- Desenvolver lógica de programação e validação de dados

---

Este projeto foi desenvolvido como desafio final do curso **"Java: consumindo API, gravando arquivos e lidando com erros"**, fazendo parte dos estudos em **Desenvolvimento Back-End Java** disponibilizados pela plataforma **Alura**.
