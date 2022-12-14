package com.pluralsight.springwebflux5.stockmarket.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.ErrorMessage;
import com.example.demo.exception.StockPublishingException;

@RestControllerAdvice
public class StockExceptionHandler {

    @ExceptionHandler(StockPublishingException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorMessage handleStockPublishingException(StockPublishingException ex) {
        return ErrorMessage.builder()
                .message(ex.getMessage())
                .build();
    }
}
