package br.com.alura.buscadorcep.request;

import br.com.alura.buscadorcep.config.RequestConfig;
import br.com.alura.buscadorcep.validation.Cep;

import java.net.URI;

public class ViaCepRequest extends RequestConfig implements URIViaCep {

  private URI uri;

  public ViaCepRequest(Cep cep){
    if(cep.getCep() != null){
      uri = URI.create("https://viacep.com.br/ws/" + cep.getCep() + "/json/");
      this.settingHttp(uri);
    }
  }

  @Override
  public URI getUriViacep() {
    return this.uri;
  }
}
