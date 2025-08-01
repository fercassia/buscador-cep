package br.com.alura.buscadorcep.config;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public interface SettingHttp {
  public void settingHttp(URI endereco);
  public HttpClient getClient();
  public HttpRequest getRequest();
}
