package com.example.cloud_storage.exception;

public class CloudErrorUpload extends RuntimeException {
    public CloudErrorUpload(String message) {
        super(message);
    }
}

