package com.example.getmesocialservice.model;

import com.example.getmesocialservice.validation.ValidName;
import org.hibernate.validator.constraints.Length;

public class Album {
    private int id;
    @Length(max = 10)
    private String name;
    private String coverPhotoUrl;
    @ValidName
    private String createdBy;
    private String dataCreated;

    public Album(int id, String name, String coverPhotoUrl, String createdBy, String dataCreated) {
        this.id = id;
        this.name = name;
        this.coverPhotoUrl = coverPhotoUrl;
        this.createdBy = createdBy;
        this.dataCreated = dataCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverPhotoUrl() {
        return coverPhotoUrl;
    }

    public void setCoverPhotoUrl(String coverPhotoUrl) {
        this.coverPhotoUrl = coverPhotoUrl;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(String dataCreated) {
        this.dataCreated = dataCreated;
    }
}