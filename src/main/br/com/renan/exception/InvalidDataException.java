package main.br.com.renan.exception;

public class InvalidDataException extends Exception{
    public InvalidDataException(String message){
        this(message, null);
    }
    public InvalidDataException(String message, Throwable cause){
        super(message, cause);
    }
}
