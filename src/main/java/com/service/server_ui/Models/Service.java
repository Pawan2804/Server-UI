package com.service.server_ui.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String imageName;

    private String imageType;
    @Lob
    @Column(name = "image", columnDefinition = "LONGBLOB") // MySQL-specific for large binary data
    private byte[] image;

    public Service() {
    }

    public Service(Long id, String name, Map<String, String> statusLocation, String imageName, String imageType, byte[] image) {
        this.id = id;
        this.name = name;
        this.statusLocation = statusLocation;
        this.imageName = imageName;
        this.imageType = imageType;
        this.image = image;
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

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
