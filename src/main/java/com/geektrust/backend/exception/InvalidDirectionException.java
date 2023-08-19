package com.geektrust.backend.exception;

public class InvalidDirectionException extends RuntimeException{
    public InvalidDirectionException(){
        super();
    }

   public  InvalidDirectionException(String message){
        super(message);
    }
    
}
