package com.example.cloud_storage.exception;

public class CloudErrorLogin extends RuntimeException{
    public CloudErrorLogin(String message){
        super(message);
    }
}
