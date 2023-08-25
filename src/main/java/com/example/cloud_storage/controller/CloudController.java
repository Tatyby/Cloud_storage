package com.example.cloud_storage.controller;

import com.example.cloud_storage.DTO.FileDTO;
import com.example.cloud_storage.model.FileCloud;
import com.example.cloud_storage.service.CloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class CloudController {
    @Autowired
    CloudService cloudService;

    @GetMapping("/list")
    public ResponseEntity<List<FileDTO>> getFiles(
            @RequestHeader("auth-token") String authToken, @RequestParam(required = false) Integer limit
    ) {
        return new ResponseEntity<>(cloudService.getListFile(), HttpStatus.OK);

    }

    @PostMapping("/file")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        return new ResponseEntity<>(cloudService.uploadFile(file), HttpStatus.OK);
    }
    @DeleteMapping("/list")
    public ResponseEntity<String> deleteFile(@RequestParam String name){
        return new ResponseEntity<>(cloudService.deleteFile(name), HttpStatus.OK);

    }
    @GetMapping("/file")
    public ResponseEntity<String> downloadFile(@RequestParam String name){
        return new ResponseEntity<>(cloudService.downloadFile(name), HttpStatus.OK);
    }
    @PutMapping("/list")
    public ResponseEntity<String> editFileName(@RequestParam String name){
        return new ResponseEntity<>(cloudService.editNameFile(name), HttpStatus.OK);
    }
}
