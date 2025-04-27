package com.esignature.project.services;

import com.esignature.project.Entities.InviteeEntity;
import com.esignature.project.dtos.InviteeDTO;
import com.esignature.project.repositories.InviteeRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class InviteeService {

    private final InviteeRepository inviteeRepository;

    public InviteeService(InviteeRepository inviteeRepository) {
        this.inviteeRepository = inviteeRepository;
    }


    public InviteeEntity saveInvitee(InviteeDTO inviteeDTO) {
        InviteeEntity invitee = new InviteeEntity();
        invitee.setName(inviteeDTO.getName());
        invitee.setEmail(inviteeDTO.getEmail());
        invitee.setTelNo(inviteeDTO.getTelNo());
        invitee.setPosition(inviteeDTO.getPosition());
        invitee.setReviewOnly(inviteeDTO.isReviewOnly());

        return inviteeRepository.save(invitee);
    }


    public List<InviteeEntity> getInviteesInSigningOrder() {
        List<InviteeEntity> invitees = inviteeRepository.findAll();
        invitees.sort(Comparator.comparingInt(InviteeEntity::getPosition));
        return invitees;
    }
}
