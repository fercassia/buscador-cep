package br.com.alura.buscadorcep.validation;

import java.security.InvalidParameterException;

public class Cep {

  private String cep;
  private final String CEP_VALID = "^\\d{8}$";

  public Cep(String cep){
    setCep(cep);
  }

  private void setCep(String cep){
    if(!cep.matches(CEP_VALID)){
      throw new InvalidParameterException("Cep invalido! Favor informar um Cep válido.");
    }
    this.cep = cep;
  }

  public String getCep() {
    return cep;
  }
}
