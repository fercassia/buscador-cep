package br.com.alura.buscadorcep.model;

public record EnderecoViaCepModel(String cep, String logradouro,
                                  String complemento, String bairro,
                                  String localidade, String uf) {
}
