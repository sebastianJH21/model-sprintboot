package com.app.parking_types.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "parking_types")
@Data
public class ParkingType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String parkingType;

    // Empty constructor (required for JPA)
    public ParkingType() {}

    // Constructor with parameters
    public ParkingType(Long id, String parkingType) {
        this.id = id;
        this.parkingType = parkingType;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParkingType() {
        return parkingType;
    }

    public void setParkingType(String parkingType) {
        this.parkingType = parkingType;
    }
}