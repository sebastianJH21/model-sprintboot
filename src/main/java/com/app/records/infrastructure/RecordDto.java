package com.app.records.infrastructure;

// import jakarta.persistence.Column;

public class RecordDto {
    private Long id;
    private int parkingTypeId;
    private int parkingSpotId;
    private int vehicleTypeId;
    private String plate;
    private String entryDate;
    private String exitDate;
    private boolean statusU;

    // Empty constructor
    public RecordDto() {
    }

    // Constructor with parameters
    public RecordDto(int parkingTypeId, int parkingSpotId, int vehicleTypeId, String plate, String entryDate, String exitDate, boolean statusU) {
        this.parkingTypeId = parkingTypeId;
        this.parkingSpotId = parkingSpotId;
        this.vehicleTypeId = vehicleTypeId;
        this.plate = plate;
        this.entryDate = entryDate;
        this.exitDate = exitDate;
        this.statusU = statusU;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public int getParkingTypeId() {
        return parkingTypeId;
    }
    
    public void setParkingTypeId(int parkingTypeId) {
        this.parkingTypeId = parkingTypeId;
    }
    
    public int getParkingSpotId() {
        return parkingSpotId;
    }
    
    public void setParkingSpotId(int parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }
    
    public int getVehicleTypeId() {
        return vehicleTypeId;
    }
    
    public void setVehicleTypeId(int vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }
    
    public String getPlate() {
        return plate;
    }
    
    public void setPlate(String plate) {
        this.plate = plate;
    }
    
    public String getEntryDate() {
        return entryDate;
    }
    
    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }
    
    public String getExitDate() {
        return exitDate;
    }
    
    public void setExitDate(String exitDate) {
        this.exitDate = exitDate;
    }
    
    public boolean getStatusU() {
        return statusU;
    }
    
    public void setStatusU(boolean statusU) {
        this.statusU = statusU;
    }        

    // toString() method
    @Override
    public String toString() {
        return "RecordDto{" +
                "id=" + id +
                ", parkingTypeId='" + parkingTypeId + '\'' +
                ", parkingSpotId='" + parkingSpotId + '\'' +
                ", vehicleTypeId='" + vehicleTypeId + '\'' +
                ", plate='" + plate + '\'' +
                ", entryDate='" + entryDate + '\'' +
                ", exitDate='" + exitDate + '\'' +
                ", statusU='" + statusU + '\'' +
                '}';

    }
}
