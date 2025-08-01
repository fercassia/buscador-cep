package br.com.alura.buscadorcep.object;

import br.com.alura.buscadorcep.model.EnderecoViaCepModel;

public class EnderecoObject  implements Endereco {
  private final String cep;
  private final String logradouro;
  private final String complemento;
  private final String bairro;
  private final String localidade;
  private final String uf;

  public EnderecoObject(EnderecoViaCepModel viaCep) {
    this.cep = viaCep.cep();
    this.uf = viaCep.uf();
    this.logradouro = viaCep.logradouro();
    this.complemento = viaCep.complemento();
    this.bairro = viaCep.bairro();
    this.localidade = viaCep.localidade();
  }

  public String getCep() {
    return cep;
  }

  public String getLogradouro() {
    return logradouro;
  }

  public String getComplemento() {
    return complemento;
  }

  public String getBairro() {
    return bairro;
  }

  public String getLocalidade() {
    return localidade;
  }

  public String getUf() {
    return uf;
  }
}
