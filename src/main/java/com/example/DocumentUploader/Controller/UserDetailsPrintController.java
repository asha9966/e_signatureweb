package com.example.DocumentUploader.Controller;

import com.example.DocumentUploader.Entity.UserDetailsPrint;
import com.example.DocumentUploader.service.UserDetailsPrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/print")
public class UserDetailsPrintController {

    @Autowired
    private UserDetailsPrintService userDetailsPrintService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserDetails(@PathVariable Long id) {
        Optional<UserDetailsPrint> userDetails = userDetailsPrintService.getUserDetailsById(id);

        if (userDetails.isPresent()) {
            return ResponseEntity.ok(userDetails.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
