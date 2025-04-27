package com.example.DocumentUploader.repository;

import com.example.DocumentUploader.Entity.UploadedDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<UploadedDocument, Long> {
}
