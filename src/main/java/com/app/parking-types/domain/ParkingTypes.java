package com.app.users.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "parking_types")
@Data
public class ParkingTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String parking_type;

    // Empty constructor (required for JPA)
    public ParkingTypes() {}

    // Constructor with parameters
    public ParkingTypes(Long id, String parking_type) {
        this.id = id;
        this.parking_type = parking_type;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParkingType() {
        return parking_type;
    }

    public void setParkingType(String parking_type) {
        this.parking_type = parking_type;
    }
}