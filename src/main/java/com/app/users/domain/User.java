package com.app.users.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false, unique = true)
    private String password_u;

    @Column(nullable = false)
    private String role_id;

    // Empty constructor (required for JPA)
    public User() {}

    // Constructor with parameters
    public User(Long id, String username, String role_id, String password_u) {
        this.id = id;
        this.username = username;
        this.role_id = role_id;
        this.password_u = password_u;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getRoleId() {
        return role_id;
    }

    public void setRoleId(String role_id) {
        this.role_id = role_id;
    }

    public String getPassword() {
        return this.password_u;
    }

    public void setPassword(String password_u) {
        this.password_u = password_u;
    }
}