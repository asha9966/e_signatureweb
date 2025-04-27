package com.example.DocumentUploader.Service;

import com.example.DocumentUploader.Entity.UploadedDocument;
import com.example.DocumentUploader.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileStorageService {
    @Autowired
    private DocumentRepository DocumentRepository;

    public UploadedDocument saveMetadata(String fileName, String fileType) {
        UploadedDocument document = new UploadedDocument();
        document.setFileName(fileName);
        document.setFileType(fileType);
        DocumentRepository.save(document);
        return document;
    }
}
