package br.com.alura.buscadorcep.config;

import java.io.IOException;
import java.net.http.HttpResponse;

public interface Response {
 <T> T getResponse(Class<T> clazz) throws IOException, InterruptedException;
}
