package com.app.records.infrastructure;

import jakarta.persistence.Column;

public class RecordDto {
    private Long id;
    private String userId;
    private int parkingTypeId;
    private int parkingSpotId;
    private int vehicleTypeId;
    private String plate;
    private String entryDate;
    private double entryTime;
    private String exitDate;
    private double exitTime;
    private boolean statusU;

    // Empty constructor
    public RecordDto() {
    }

    // Constructor with parameters
    public RecordDto(String userId, int parkingTypeId, int parkingSpotId, int vehicleTypeId, String plate, String entryDate, double entryTime, String exitDate, double exitTime, boolean statusU) {
        this.userId = userId;
        this.parkingTypeId = parkingTypeId;
        this.parkingSpotId = parkingSpotId;
        this.vehicleTypeId = vehicleTypeId;
        this.plate = plate;
        this.entryDate = entryDate;
        this.entryTime = entryTime;
        this.exitDate = exitDate;
        this.exitTime = exitTime;
        this.statusU = statusU;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
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
    
    public double getEntryTime() {
        return entryTime;
    }
    
    public void setEntryTime(double entryTime) {
        this.entryTime = entryTime;
    }
    
    public String getExitDate() {
        return exitDate;
    }
    
    public void setExitDate(String exitDate) {
        this.exitDate = exitDate;
    }
    
    public double getExitTime() {
        return exitTime;
    }
    
    public void setExitTime(double exitTime) {
        this.exitTime = exitTime;
    }
    
    public boolean getIsStatusU() {
        return statusU;
    }
    
    public void setIsStatusU(boolean statusU) {
        this.statusU = statusU;
    }        

    // toString() method
    @Override
    public String toString() {
        return "RecordDto{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", parkingTypeId='" + parkingTypeId + '\'' +
                ", parkingSpotId='" + parkingSpotId + '\'' +
                ", vehicleTypeId='" + vehicleTypeId + '\'' +
                ", plate='" + plate + '\'' +
                ", entryDate='" + entryDate + '\'' +
                ", entryTime='" + entryTime + '\'' +
                ", exitDate='" + exitDate + '\'' +
                ", exitTime='" + exitTime + '\'' +
                ", statusU='" + statusU + '\'' +
                '}';

    }
}
