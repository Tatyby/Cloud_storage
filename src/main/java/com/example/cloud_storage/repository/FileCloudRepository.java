package com.example.cloud_storage.repository;

import com.example.cloud_storage.model.FileCloud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileCloudRepository extends JpaRepository<FileCloud, Long> {
}
