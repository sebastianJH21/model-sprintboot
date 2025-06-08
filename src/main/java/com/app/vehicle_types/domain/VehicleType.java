package com.app.vehicle_types.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name = "vehicle_types")
@Data
public class VehicleType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Vehicle type is required")
    @Column(nullable = false, unique = true)
    private String vehicleType;
    
    @Column(nullable = false)
    @NotBlank(message= "Regular rate is requied")
    private int regularRate;
    
    @Column(nullable = false)
    @NotBlank(message= "Monthly rate is requied")
    private int monthlyRate;

    // Empty constructor (required for JPA)
    public VehicleType() {}

    // Constructor with parameters
    public VehicleType(Long id, String vehicleType, int regularRate, int monthlyRate) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.regularRate = regularRate;
        this.monthlyRate = monthlyRate;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getRegularRate() {
        return regularRate;
    }

    public void setRegularRate(int regularRate) {
        this.regularRate = regularRate;
    }

    public int getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(int monthlyRate) {
        this.monthlyRate = monthlyRate;
    }
}