package com.esignature.project.controllers;

import com.esignature.project.dtos.PlaceholderDTO;
import com.esignature.project.Entities.Placeholder;
import com.esignature.project.services.PlaceholderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/placeholders")
@CrossOrigin(origins = "*")
public class PlaceholderController {

    private final PlaceholderService placeholderService;

    public PlaceholderController(PlaceholderService placeholderService) {
        this.placeholderService = placeholderService;
    }

    @PostMapping("/add")
    public ResponseEntity<Placeholder> addPlaceholder(
            @ModelAttribute PlaceholderDTO placeholderDTO,
            @RequestParam(value = "file", required = false) MultipartFile file) {
        try {
            Placeholder placeholder = placeholderService.addPlaceholder(placeholderDTO, file);
            return ResponseEntity.ok(placeholder);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add placeholder", e);
        }
    }
}
