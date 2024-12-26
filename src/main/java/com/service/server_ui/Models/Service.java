package com.service.server_ui.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;


@Entity
@Table(name = "servers")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "JSON") // Ensure this matches your MySQL version
    @Convert(converter = MapToJsonConverter.class)
    private Map<String, String> statusLocation;

    public Service() {
    }

    public Service(Long id, String name, Map<String, String> statusLocation) {
        this.id = id;
        this.name = name;
        this.statusLocation = statusLocation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getStatusLocation() {
        return statusLocation;
    }

    public void setStatusLocation(Map<String, String> statusLocation) {
        this.statusLocation = statusLocation;
    }
}
