package com.app.vehicle_types.infrastructure;

public class VehicleTypesDto {
    private Long id;
    private String vehicleType;
    private int regularRate;
    private int monthlyRate;

    // Empty constructor
    public VehicleTypesDto() {
    }

    // Constructor with parameters
    public VehicleTypesDto(Long id, String vehicleType, int regularRate, int monthlyRate) {
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

    public String getVehicleTypes() {
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
    
    public int getmonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(int monthlyRate) {
        this.monthlyRate = monthlyRate;
    }


    // toString() method
    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", Vehicel Type='" + vehicleType + '\'' +
                ", Regular Rate='" + regularRate + '\'' +
                ", Monthly Rate='" + monthlyRate + '\'' +
                '}';
    }
}
