package com.app.users.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "parking-spots")
@Data
public class ParkingSpots {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String flor;

    @Column(nullable = false)
    private boolean status_u;

    // Empty constructor (required for JPA)
    public ParkingSpots() {}

    // Constructor with parameters
    public ParkingSpots(Long id, String code, String flor, boolean status_u) {
        this.id = id;
        this.code = code;
        this.flor = flor;
        this.status_u = status_u;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFlor() {
        return flor;
    }

    public void setFlor(String flor) {
        this.flor = flor;
    }

    public boolean getStatus_u() {
        return this.status_u;
    }

    public void setStatus_u(boolean status_u) {
        this.status_u = status_u;
    }
}
