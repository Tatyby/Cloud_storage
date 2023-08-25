package com.example.cloud_storage.repository;

import com.example.cloud_storage.model.UserCloud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCloudRepository extends JpaRepository<UserCloud, Long> {
}
