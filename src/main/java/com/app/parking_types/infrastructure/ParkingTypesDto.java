package com.app.parking_types.infrastructure;

public class ParkingTypesDto {
    private Long id;
    private String parkingType;

    // Empty constructor
    public ParkingTypesDto() {
    }

    // Constructor with parameters
    public ParkingTypesDto(Long id, String parkingType) {
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
        return "UserDto{" +
                "id=" + id +
                ", parking type='" + parkingType + '\'' +
                '}';
    }
}
