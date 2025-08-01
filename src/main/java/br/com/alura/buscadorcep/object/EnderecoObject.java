package br.com.alura.buscadorcep.object;

import br.com.alura.buscadorcep.model.EnderecoViaCep;

public class Endereco {
  private String cep;
  private String logradouro;
  private String complemento;
  private String bairro;
  private String localidade;
  private String uf;

  public Endereco (EnderecoViaCep viaCep) {
    this.cep = viaCep.cep();
    this.uf = viaCep.uf();
    setLogradouro(viaCep.logradouro());
    setComplemento(viaCep.complemento());
    setBairro(viaCep.complemento());
    setLocalidade(viaCep.localidade());
  }

  private void setLogradouro(String logradouro) {
    this.logradouro = !logradouro.isBlank() ? logradouro : "N/A";
  }

  private void setComplemento(String complemento) {
    this.complemento = !complemento.isBlank() ? complemento : "N/A";
  }

  private void setBairro(String bairro) {
    this.bairro = !bairro.isBlank() ? bairro : "N/A";
  }

  private void setLocalidade(String localidade) {
    this.localidade = !localidade.isBlank() ? localidade : "N/A";
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

  @Override
  public String toString() {
    return "Endereco{" +
        "cep='" + cep + '\'' +
        ", logradouro='" + logradouro + '\'' +
        ", complemento='" + complemento + '\'' +
        ", bairro='" + bairro + '\'' +
        ", localidade='" + localidade + '\'' +
        ", uf='" + uf + '\'' +
        '}';
  }
}
