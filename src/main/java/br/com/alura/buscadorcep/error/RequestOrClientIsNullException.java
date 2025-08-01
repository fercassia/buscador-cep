package br.com.alura.buscadorcep.error;

public class RequestOrClientIsNullException extends RuntimeException {
  public RequestOrClientIsNullException(String message) {
    super(message);
  }
}
