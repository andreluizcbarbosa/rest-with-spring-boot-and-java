package com.erudio.restwithspringbootandjava.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportdMathOperationException extends RuntimeException{
    public UnsupportdMathOperationException(String ex) {
        super(ex);
    }
}
