package com.esignature.project.controllers;

import com.esignature.project.dtos.InviteeDTO;
import com.esignature.project.Entities.InviteeEntity;
import com.esignature.project.services.InviteeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invitees")
@CrossOrigin(origins = "*")
public class InviteeController {

    private final InviteeService inviteeService;

    public InviteeController(InviteeService inviteeService) {
        this.inviteeService = inviteeService;
    }


    @PostMapping("/add")
    public InviteeEntity addInvitee(@RequestBody InviteeDTO inviteeDTO) {
        return inviteeService.saveInvitee(inviteeDTO);
    }


    @GetMapping("/signing-order")
    public List<InviteeEntity> getInviteesInSigningOrder() {
        return inviteeService.getInviteesInSigningOrder();
    }
}
