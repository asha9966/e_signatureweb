package com.example.DocumentUploader.DTO;

public class UserDetailsDTO {
    private Long id;
    private String name;
    private String email;
    private String nic;

    // Constructors
    public UserDetailsDTO() {}

    public UserDetailsDTO(Long id, String name, String email, String nic) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.nic = nic;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setNic(String nic) {
        this.nic = nic;
    }
}
