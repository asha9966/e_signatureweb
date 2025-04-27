package com.example.DocumentUploader.Service.impl;

import com.example.DocumentUploader.Entity.UserDetailsPrint;
import com.example.DocumentUploader.repository.UserDetailsPrintRepository;
import com.example.DocumentUploader.service.UserDetailsPrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsPrintServiceImpl extends UserDetailsPrintService {

    private final UserDetailsPrintRepository userDetailsPrintRepository;

    @Autowired
    public UserDetailsPrintServiceImpl(UserDetailsPrintRepository userDetailsPrintRepository) {
        this.userDetailsPrintRepository = userDetailsPrintRepository;
    }

    @Override
    public Optional<UserDetailsPrint> getUserDetailsById(Long id) {
        return userDetailsPrintRepository.findById(id);
    }
}
