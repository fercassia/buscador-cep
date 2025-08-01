package br.com.alura.buscadorcep.service;


import br.com.alura.buscadorcep.config.ConfigRequest;
import br.com.alura.buscadorcep.config.Response;
import br.com.alura.buscadorcep.config.SettingHttp;
import br.com.alura.buscadorcep.model.EnderecoViaCep;
import br.com.alura.buscadorcep.validation.Cep;

import java.io.IOException;
import java.net.URI;

public class BuscaCep {

  private Response response;

  public  BuscaCep(Response response){
    this.response = response;
  }

  public EnderecoViaCep BuscarCep() throws IOException, InterruptedException {
    return response.getResponse(EnderecoViaCep.class);
  }
}
