package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Photo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PhotoRepository {
    List<Photo> photoList = new ArrayList();

    public Photo getPhoto(){
        Photo photo = new Photo(234, 678, "www.pics.com", "SAMUEL","2023/02/12");
        return photo;
    }

    public Photo savePhoto(Photo photo) {
        photo.setId(photoList.size() + 1);
        photoList.add(photo);
        return photo;
    }

    public List<Photo> getAllPhotos() {
        return photoList;
    }

    public Photo getPhotoById(int photoId) {
        for(Photo photo:photoList){
            if(photo.getId() == photoId){
                return photo;
            }
        }
        return null;
    }

    public Photo updatePhoto(int photoId, Photo photo) {
        for(Photo p:photoList){
            if(p.getId() == photoId){
                p.setPhotoUrl(photo.getPhotoUrl());
                p.setCreatedBy(photo.getCreatedBy());
                p.setDataCreated(photo.getDataCreated());
                return p;
            }
        }
        return null;
    }

    public Photo deletePhoto(int photoId) {
        Photo deletedPhoto = null;
        for(Photo p:photoList){
            if(p.getId() == photoId){
                deletedPhoto = p;
                photoList.remove(p);
            }
        }
        return deletedPhoto;
    }
}
