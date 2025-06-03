package com.app.records.domain;

import jakarta.persistence.*;
import lombok.Data;
// import lombok.var;

@Entity
@Table(name = "records")
@Data
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int parkingTypeId;

    @Column(nullable = false)
    private int parkingSpotId;

    @Column(nullable = false)
    private int vehicleTypeId;

    @Column(nullable = false)
    private String plate;

    @Column(nullable = false)
    private String entryDate;

    @Column(nullable = true)
    private String exitDate;

    @Column(nullable = false)
    private boolean payment;

    // Empty constructor (required for JPA)
    public Record() {}

    // Constructor with parameters
    public Record(int parkingTypeId, int parkingSpotId, int vehicleTypeId, String plate, String entryDate, String exitDate, boolean payment) 
    
    {
    this.parkingTypeId = parkingTypeId;
    this.parkingSpotId = parkingSpotId;
    this.vehicleTypeId = vehicleTypeId;
    this.plate = plate;
    this.entryDate = entryDate;
    this.exitDate = exitDate;
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
    
    public boolean getPayment() {
        return payment;
    }
    
    public void setPayment(boolean payment) {
        this.payment = payment;
    }        
}
