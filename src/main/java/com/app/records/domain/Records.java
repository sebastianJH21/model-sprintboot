package com.app.users.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.var;

@Entity
@Table(name = "records")
@Data
public class Records {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String user_ide;

    @Column(nullable = false, unique = true)
    private int parking_type_id;

    @Column(nullable = false)
    private int parking_spot_id;

    @Column(nullable = false)
    private int vehicle_type_id;

    @Column(nullable = false)
    private String plate;

    @Column(nullable = false)
    private String entry_date;

    @Column(nullable = false)
    private double entry_time;

    @Column(nullable = false)
    private String exit_date;

    @Column(nullable = false)
    private double exit_time;

    @Column(nullable = false)
    private boolean status_u;

    // Empty constructor (required for JPA)
    public Records() {}

    // Constructor with parameters
    public Records(String user_ide, int parking_type_id, int parking_spot_id, int vehicle_type_id, String plate, String entry_date, double entry_time, String exit_date, double exit_time, boolean status_u) 
    
    {
    this.user_ide = user_ide;
    this.parking_type_id = parking_type_id;
    this.parking_spot_id = parking_spot_id;
    this.vehicle_type_id = vehicle_type_id;
    this.plate = plate;
    this.entry_date = entry_date;
    this.entry_time = entry_time;
    this.exit_date = exit_date;
    this.exit_time = exit_time;
    this.status_u = status_u;
}

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserIde() {
        return user_ide;
    }
    
    public void setUserIde(String user_ide) {
        this.user_ide = user_ide;
    }
    
    public int getParkingTypeId() {
        return parking_type_id;
    }
    
    public void setParkingTypeId(int parking_type_id) {
        this.parking_type_id = parking_type_id;
    }
    
    public int getParkingSpotId() {
        return parking_spot_id;
    }
    
    public void setParkingSpotId(int parking_spot_id) {
        this.parking_spot_id = parking_spot_id;
    }
    
    public int getVehicleTypeId() {
        return vehicle_type_id;
    }
    
    public void setVehicleTypeId(int vehicle_type_id) {
        this.vehicle_type_id = vehicle_type_id;
    }
    
    public String getPlate() {
        return plate;
    }
    
    public void setPlate(String plate) {
        this.plate = plate;
    }
    
    public String getEntryDate() {
        return entry_date;
    }
    
    public void setEntryDate(String entry_date) {
        this.entry_date = entry_date;
    }
    
    public double getEntryTime() {
        return entry_time;
    }
    
    public void setEntryTime(double entry_time) {
        this.entry_time = entry_time;
    }
    
    public String getExitDate() {
        return exit_date;
    }
    
    public void setExitDate(String exit_date) {
        this.exit_date = exit_date;
    }
    
    public double getExitTime() {
        return exit_time;
    }
    
    public void setExitTime(double exit_time) {
        this.exit_time = exit_time;
    }
    
    public boolean isStatusU() {
        return status_u;
    }
    
    public void setStatusU(boolean status_u) {
        this.status_u = status_u;
    }        
}
