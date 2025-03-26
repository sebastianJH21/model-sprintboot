package com.app.users.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "roles")
@Data
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name_u;

    // Empty constructor (required for JPA)
    public Roles() {}

    // Constructor with parameters
    public Roles(Long id, String name_u) {
        this.id = id;
        this.name_u = name_u;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name_u;
    }

    public void setName(String name_u) {
        this.name_u = name_u;
    }
}