package com.Jelalletdin.demo.rest;

public class StudentNotFoundExepcion extends RuntimeException{

    public StudentNotFoundExepcion(String message) {
        super(message);
    }

    public StudentNotFoundExepcion(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundExepcion(Throwable cause) {
        super(cause);
    }
}
