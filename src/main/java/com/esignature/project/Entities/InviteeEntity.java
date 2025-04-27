package com.esignature.project.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "invitee")
@Getter
@Setter
public class InviteeEntity {
    @Id
    private String email;

    private String name;

    @Column(name = "tel_no")
    private String telNo;

    private int position;

    @Column(name = "review_only")
    private boolean reviewOnly;
}
