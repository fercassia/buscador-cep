package br.com.alura.buscadorcep.model;

import com.google.gson.GsonBuilder;

public record EnderecoViaCep(String cep, String logradouro,
                             String complemento, String bairro,
                             String localidade, String uf) {
}
