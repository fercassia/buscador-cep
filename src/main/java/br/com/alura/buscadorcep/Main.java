package br.com.alura.buscadorcep;

import br.com.alura.buscadorcep.request.ViaCepRequest;
import br.com.alura.buscadorcep.service.BuscaCepService;
import br.com.alura.buscadorcep.validation.Cep;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) throws IOException, InterruptedException {
    ViaCepRequest request = new ViaCepRequest(new Cep("39200000"));
    BuscaCepService retorno = new BuscaCepService(request);
    var resultado = retorno.retornaCep();

    System.out.println(resultado);
  }
}