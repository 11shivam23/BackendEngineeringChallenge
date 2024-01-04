package com.backend.EngineeringChallenge.Exception;

public class ConcurrencyConflictException extends RuntimeException{

    public ConcurrencyConflictException(String message) {
        super(message);
    }
}
