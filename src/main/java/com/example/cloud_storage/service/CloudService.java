package com.example.cloud_storage.service;

import com.example.cloud_storage.DTO.FileDTO;
import com.example.cloud_storage.model.FileCloud;
import com.example.cloud_storage.repository.FileCloudRepository;
import com.example.cloud_storage.repository.UserCloudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
public class CloudService {
    @Autowired
    UserCloudRepository userCloudRepository;
    @Autowired
    FileCloudRepository fileCloudRepository;

    public List<FileDTO> getListFile() {
        return new ArrayList<>();
    }

    public String uploadFile(MultipartFile file) {
        return "Файл успешно загружен";
    }

    public String deleteFile(String name) {
        return "Файл успешно удален";
    }

    public String downloadFile(String name) {
        return "Файл успешно скачен";
    }

    public String editNameFile(String name) {
        return "имя файла успешно изменено";
    }
}
