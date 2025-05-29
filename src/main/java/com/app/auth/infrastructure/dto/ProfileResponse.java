package com.app.auth.infrastructure.dto;

public class ProfileResponse {
    private Number id;
    private String userName;
    private String email;
    private String password;
    private String role;

    public ProfileResponse(Number id, String userName, String password, String email, String role) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public String getId() {
        return this.id.toString();
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public String getRol() {
        return this.role;
    }
} 