package br.com.alura.buscadorcep.config;

import java.io.IOException;

public interface Response {
 <T> T getResponse(Class<T> clazz) throws IOException, InterruptedException;
}
