package com.esignature.project.controllers;

import com.esignature.project.dtos.SendDocumentDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    @PostMapping("/send")
    public String sendDocument(@RequestBody SendDocumentDTO sendDocumentDTO) {

        System.out.println("Sending from: " + sendDocumentDTO.getFrom());
        System.out.println("Sending to: " + sendDocumentDTO.getTo());
        System.out.println("Message: " + sendDocumentDTO.getMessage());

        return "Document Sent Successfully!";
    }
}

