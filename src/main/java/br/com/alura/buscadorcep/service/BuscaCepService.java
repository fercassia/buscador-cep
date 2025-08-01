package br.com.alura.buscadorcep.service;

import br.com.alura.buscadorcep.config.Response;
import br.com.alura.buscadorcep.model.EnderecoViaCepModel;
import br.com.alura.buscadorcep.object.EnderecoObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

public class BuscaCepService {

  private final Response response;

  public BuscaCepService(Response response){
    this.response = response;
  }

  private EnderecoViaCepModel buscarCep() throws IOException, InterruptedException {
    return response.getResponse(EnderecoViaCepModel.class);
  }
  
  public String retornaCep() throws IOException, InterruptedException {
    EnderecoObject enderecoObject = new EnderecoObject(buscarCep());
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    return gson.toJson(enderecoObject);
  }
}
