package com.esignature.project.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InviteeDTO {
    private String name;
    private String email;
    private String telNo;
    private int position;
    private boolean reviewOnly;
}

