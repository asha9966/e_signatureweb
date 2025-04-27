package com.example.DocumentUploader.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UploadedDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    private String fileType;

    @Lob
    private byte[] data;
}
