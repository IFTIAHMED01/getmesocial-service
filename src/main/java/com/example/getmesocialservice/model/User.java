package com.example.getmesocialservice.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class User {
    private int id;
    private String name;
    @Length(min = 2)
    private String email;
    @NotEmpty
    private String profilePhotoUrl;

    public User(int id, String name, String email, String profilePhotoUrl) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.profilePhotoUrl = profilePhotoUrl;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }
}
