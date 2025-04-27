package com.example.Document.Uploads.Service;

import com.example.DocumentUploader.Entity.UploadedDocument;
import com.example.DocumentUploader.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class DocumentUploadService {

    private DocumentRepository documentRepository;

    public UploadedDocument saveFile(MultipartFile file) throws IOException {
        UploadedDocument doc = new UploadedDocument();
        doc.setFileName(file.getOriginalFilename());
        doc.setFileType(file.getContentType());
        doc.setData(file.getBytes());

        return documentRepository.save(doc);
    }

    public UploadedDocument getFile(Long id) {
        return documentRepository.findById(id).orElse(null);
    }
}
