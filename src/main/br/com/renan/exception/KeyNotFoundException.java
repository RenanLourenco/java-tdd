package main.br.com.renan.exception;

public class KeyNotFoundException extends Exception{

    public KeyNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public KeyNotFoundException(String message) {
        super(message);
    }
}
