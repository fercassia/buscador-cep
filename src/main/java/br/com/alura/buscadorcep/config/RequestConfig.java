package br.com.alura.buscadorcep.config;

import br.com.alura.buscadorcep.error.RequestOrClientIsNullException;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public abstract class RequestConfig implements SettingHttp, Response {

  private HttpClient client;
  private HttpRequest request;

  @Override
  public HttpClient getClient(){
    return client;
  }

  @Override
  public HttpRequest getRequest(){
    return request;
  }

  @Override
  public void settingHttp(URI endereco) {
    client = HttpClient.newHttpClient();
    request = HttpRequest.newBuilder().uri(endereco).build();
  }

  @Override
  public <T> T getResponse(Class<T> clazz) throws IOException, InterruptedException {
    if(request == null || client == null){
      throw new RequestOrClientIsNullException("Request and/or Client it's null. \n");
    }
    HttpResponse<String> response =  client.send(request, HttpResponse.BodyHandlers.ofString());
    return new Gson().fromJson(response.body(), clazz);
  }
}
