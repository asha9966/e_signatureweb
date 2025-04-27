package com.example.DocumentUploader.repository;

import com.example.DocumentUploader.Entity.UserDetailsPrint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsPrintRepository extends JpaRepository<UserDetailsPrint, Long> {
    // No extra code needed now — basic CRUD is enough!
}
