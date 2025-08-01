package br.com.alura.buscadorcep;

import br.com.alura.buscadorcep.request.ViaCepRequest;
import br.com.alura.buscadorcep.service.BuscaCepService;
import br.com.alura.buscadorcep.validation.Cep;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException {
    String cepInput = "39200000";

    ViaCepRequest request = new ViaCepRequest(new Cep(cepInput));
    BuscaCepService retorno = new BuscaCepService(request);

    String resultant = retorno.retornaCep();

    System.out.println(resultant);
  }
}