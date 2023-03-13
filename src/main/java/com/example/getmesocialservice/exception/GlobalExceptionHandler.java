package com.example.getmesocialservice.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RestrictedInfoException.class)
    public String restrictedInfoError(RestrictedInfoException ex){
        return ex.getMessage();
    }
}
