package com.esignature.project.services;

import com.esignature.project.Entities.Placeholder;
import com.esignature.project.dtos.PlaceholderDTO;
import com.esignature.project.repositories.PlaceholderRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class PlaceholderService {

    private final PlaceholderRepository placeholderRepository;

    public PlaceholderService(PlaceholderRepository placeholderRepository) {
        this.placeholderRepository = placeholderRepository;
    }

    public Placeholder addPlaceholder(PlaceholderDTO placeholderDTO, MultipartFile file) throws IOException {
        Placeholder placeholder = new Placeholder();
        placeholder.setType(placeholderDTO.getType());
        placeholder.setValue(placeholderDTO.getValue());

        MultipartFile signature = placeholderDTO.getSignature();
        if (signature != null && !signature.isEmpty()) {

            String uploadDir = "uploads/";
            File dir = new File(uploadDir);
            if (!dir.exists()) {
                dir.mkdirs();
            }


            String fileName = System.currentTimeMillis() + "_" + signature.getOriginalFilename();
            Path filePath = Paths.get(uploadDir, fileName);
            Files.write(filePath, signature.getBytes());


            placeholder.setSignaturePath(filePath.toString());
        }

        return placeholderRepository.save(placeholder);
    }
}
