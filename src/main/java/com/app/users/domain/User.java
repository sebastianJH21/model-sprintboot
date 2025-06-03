package com.app.users.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "User name is required")
    @Column(nullable = false, unique = true)
    private String userName;

    @NotBlank(message = "Password is required") 
    @Column(nullable = false, unique = true)
    private String password;

    @NotBlank(message = "Role is required")
    @Column(nullable = false)
    private String role;

    // Empty constructor (required for JPA)
    public User() {}

    // Constructor with parameters
    public User(Long id, String email, String userName, String role, String password) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.role = role;
        this.password = password;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}