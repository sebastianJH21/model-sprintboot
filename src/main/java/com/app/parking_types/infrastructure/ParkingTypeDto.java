package com.app.parking_types.infrastructure;

public class ParkingTypeDto {
    private Long id;
    private String parkingType;

    // Empty constructor
    public ParkingTypeDto() {
    }

    // Constructor with parameters
    public ParkingTypeDto(Long id, String parkingType) {
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

    // toString() method
    @Override
    public String toString() {
        return "ParkingTypeDto{" +
                "id=" + id +
                ", parking type='" + parkingType + '\'' +
                '}';
    }
}
