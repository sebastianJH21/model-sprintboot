package com.app.vehicle_types.infrastructure;

public class VehicleTypesDto {
    private Long id;
    private String vehicleType;

    // Empty constructor
    public VehicleTypesDto() {
    }

    // Constructor with parameters
    public VehicleTypesDto(Long id, String vehicleType) {
        this.id = id;
        this.vehicleType = vehicleType;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleTypes() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // toString() method
    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", Vehicel Type='" + vehicleType + '\'' +
                '}';
    }
}
