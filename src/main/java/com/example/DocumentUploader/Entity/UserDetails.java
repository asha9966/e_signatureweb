package com.example.DocumentUploader.Entity;

import jakarta.persistence.*;
import lombok.Setter;

@Entity
@Table(name = "user_details")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @Setter
    private String nic;

    // Constructors
    public UserDetails() {}

    public UserDetails(String name, String email, String nic) {
        this.name = name;
        this.email = email;
        this.nic = nic;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNic() {
        return nic;
    }

}
