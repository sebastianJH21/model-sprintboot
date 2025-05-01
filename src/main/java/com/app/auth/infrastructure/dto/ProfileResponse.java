package com.app.auth.infrastructure.dto;

public class ProfileResponse {
    private Number id;
    private String userName;
    private String email;

    public ProfileResponse(Number id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public String getId() {
        return this.id.toString();
    }

    public String getUserName() {
        return this.userName;
    }

    public String getEmail() {
        return this.email;
    }
} 