package com.example.DocumentUploader.service;

import com.example.DocumentUploader.Entity.UserDetailsPrint;
import com.example.DocumentUploader.repository.UserDetailsPrintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsPrintService {

    @Autowired
    private UserDetailsPrintRepository userDetailsPrintRepository;

    public Optional<UserDetailsPrint> getUserDetailsById(Long id) {
        return userDetailsPrintRepository.findById(id);
    }
}
