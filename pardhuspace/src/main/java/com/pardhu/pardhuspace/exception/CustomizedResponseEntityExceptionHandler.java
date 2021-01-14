package com.pardhu.pardhuspace.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice //By this it will apply to all RestController
@RestController
public class CustomizedResponseEntityExceptionHandler
extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions
            (Exception ex, WebRequest request) {
        ExceptionResponce exceptionResponce = new ExceptionResponce(new Date(), ex.getMessage(),
         request.getDescription(true));
        return new ResponseEntity(exceptionResponce, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
