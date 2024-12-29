package com.example.exceptionhandling.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionController {
    // <class> @controller-advice
    // <method> @exception-handler
    //          = handle specific exceptions and send the custom responses to the client
    @ExceptionHandler(value = ProductNotFoundException.class)
    public ResponseEntity<Object> exception(ProductNotFoundException exception) {
        return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
    }

    // note: the function name aka "exception()" is not fixed
    //       , change to anything
    //       if i want to handle more exception, add additional methods into same class
    //       each annotated w @ExceptionHandler(value=?). each method can contain custom logic
    //       for handling its specific exception
}