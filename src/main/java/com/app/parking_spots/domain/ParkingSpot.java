package com.app.parking_spots.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name = "parking-spots")
@Data
public class ParkingSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Code is required")
    @Column(nullable = false)
    private String code;

    @NotBlank(message = "Flor is required")
    @Column(nullable = false)
    private String flor;

    @NotBlank(message = "Status is required")
    @Column(nullable = false)
    private boolean status;

    // Empty constructor (required for JPA)
    public ParkingSpot() {}

    // Constructor with parameters
    public ParkingSpot(Long id, String code, String flor, boolean status) {
        this.id = id;
        this.code = code;
        this.flor = flor;
        this.status = status;
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

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
