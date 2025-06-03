package com.app.records.infrastructure;

// import jakarta.persistence.Column;

public class RecordDto {
    private Long id;
    private int parkingTypeId;
    private int vehicleTypeId;
    private String plate;
    private String entryDate;
    private String exitDate;
    private int amount;
    private boolean payment;

    // Empty constructor
    public RecordDto() {
    }

    // Constructor with parameters
    public RecordDto(int parkingTypeId, int vehicleTypeId, String plate, String entryDate, String exitDate, int amount, boolean payment) {
        this.parkingTypeId = parkingTypeId;
        this.vehicleTypeId = vehicleTypeId;
        this.plate = plate;
        this.entryDate = entryDate;
        this.exitDate = exitDate;
        this.amount = amount;
        this.payment = payment;
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
    
    public int getAmount() {
        return amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }     

    public boolean getPayment() {
        return payment;
    }
    
    public void setPayment(boolean payment) {
        this.payment = payment;
    }        

    // toString() method
    @Override
    public String toString() {
        return "RecordDto{" +
                "id=" + id +
                ", parkingTypeId='" + parkingTypeId + '\'' +
                ", vehicleTypeId='" + vehicleTypeId + '\'' +
                ", plate='" + plate + '\'' +
                ", entryDate='" + entryDate + '\'' +
                ", exitDate='" + exitDate + '\'' +
                ", amount=" + amount +
                ", payment='" + payment + '\'' +
                '}';

    }
}
