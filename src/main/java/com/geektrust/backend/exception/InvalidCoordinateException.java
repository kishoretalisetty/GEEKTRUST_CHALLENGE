package com.geektrust.backend.exception;

public class InvalidCoordinateException extends RuntimeException {

   public  InvalidCoordinateException(){
        super();
    }
    
   public  InvalidCoordinateException(String message){
        super(message);
    }
}
