package com.esignature.project.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class PlaceholderDTO {

    private String type;
    private String value;
    private MultipartFile signatureFile;

    public MultipartFile getSignature() {
        return null;
    }
}

