package com.app.parking_spots.infrastructure;

public class ParkingSpotDto {
    private Long id;
    private String code;
    private String flor;
    private boolean status;

    // Empty constructor
    public ParkingSpotDto() {
    }

    // Constructor with parameters
    public ParkingSpotDto(Long id, String code, String flor, boolean status) {
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
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // toString() method
    @Override
    public String toString() {
        return "ParkingSpotsDto{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", flor='" + flor + '\'' +
                ", status=" + status +
                '}';
    }
}