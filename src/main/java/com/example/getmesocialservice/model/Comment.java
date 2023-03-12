package com.example.getmesocialservice.model;

public class Comment {
    private int id;
    private int photoId;
    private String message;
    private String createdBy;
    private String dataCreated;

    public Comment(int id, int photoId, String message, String createdBy, String dataCreated) {
        this.id = id;
        this.photoId = photoId;
        this.message = message;
        this.createdBy = createdBy;
        this.dataCreated = dataCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
