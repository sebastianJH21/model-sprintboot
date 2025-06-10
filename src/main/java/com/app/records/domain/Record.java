package com.app.records.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "records")
@Data
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Parking type ID is required")
    @Column(name = "parking_type_id", nullable = false)
    private int parkingTypeId;

    @NotNull(message = "Vehicle type ID is required")
    @Column(name = "vehicle_type_id", nullable = false)
    private int vehicleTypeId;

    @NotBlank(message = "Plate is required")
    @Column(name = "plate", nullable = false)
    private String plate;

    @NotBlank(message = "Entry date is required")
    @Column(name = "entry_date", nullable = false)
    private String entryDate;

    @Column(name = "exit_date", nullable = true)
    private String exitDate;

    @Column(name = "amount", nullable = true)
    private Integer amount; // Cambiado a Integer para permitir NULL

    @NotNull(message = "Payment status is required")
    @Column(name = "payment", nullable = false)
    private boolean payment;

    // Empty constructor (required for JPA)
    public Record() {
    }

    // Constructor with parameters
    public Record(int parkingTypeId, int vehicleTypeId, String plate, String entryDate,
                  String exitDate, Integer amount, boolean payment) {
        this.parkingTypeId = parkingTypeId;
        this.vehicleTypeId = vehicleTypeId;
        this.plate = plate;
        this.entryDate = entryDate;
        this.exitDate = exitDate;
        this.amount = amount; // Ahora acepta null
        this.payment = payment;
    }

    // Getters y Setters (generados por @Data, pero los incluyes manualmente)
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public boolean getPayment() {
        return payment;
    }

    public void setPayment(boolean payment) {
        this.payment = payment;
    }
}