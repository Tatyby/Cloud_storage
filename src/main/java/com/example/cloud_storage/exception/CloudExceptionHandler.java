package com.example.cloud_storage.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class CloudExceptionHandler {
    @ExceptionHandler(CloudErrorInputData.class)
    public ResponseEntity<String> cloudErrorInputDataHandler(CloudErrorInputData e) {
        String message = "Error input data";
        log.info(message + e.getMessage());
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);  //400
    }

    @ExceptionHandler(CloudErrorLogin.class)
    public ResponseEntity<String> cloudErrorLoginHandler(CloudErrorLogin e) {
        String message = "Bad credentials";
        log.info(message + e.getMessage());
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);  //400
    }

    @ExceptionHandler(CloudErrorUpload.class)
    public ResponseEntity<String> cloudErrorLoginHandler(CloudErrorUpload e) {
        String message = "Unauthorized error";
        log.info(message + e.getMessage());
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);  //401
    }
}
