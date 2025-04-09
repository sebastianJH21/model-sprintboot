package com.app.parking_spots.infrastructure;

public class ParkingSpotsDto {
    private Long id;
    private String code;
    private String flor;
    private boolean status_u;

    // Empty constructor
    public ParkingSpotsDto() {
    }

    // Constructor with parameters
    public ParkingSpotsDto(Long id, String code, String flor, boolean status_u) {
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
        return status_u;
    }

    public void setStatus_u(boolean status_u) {
        this.status_u = status_u;
    }

    // toString() method
    @Override
    public String toString() {
        return "ParkingSpotsDto{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", flor='" + flor + '\'' +
                ", status_u=" + status_u +
                '}';
    }
}