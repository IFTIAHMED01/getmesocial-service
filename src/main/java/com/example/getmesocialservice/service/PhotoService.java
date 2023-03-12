package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Photo;
import com.example.getmesocialservice.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    @Autowired
    private PhotoRepository photoRepository;

    public Photo getPhoto(){
        return photoRepository.getPhoto();
    }

    public Photo savePhoto(Photo photo){
        return photoRepository.savePhoto(photo);
    }

    public List<Photo> getAllPhotos() {
        return photoRepository.getAllPhotos();
    }

    public Photo getPhotoById(int photoId) {
        return photoRepository.getPhotoById(photoId);
    }

    public Photo updatePhoto(int photoId, Photo photo) {
        return photoRepository.updatePhoto(photoId,photo);
    }

    public Photo deletePhoto(int photoId) {
        return photoRepository.deletePhoto(photoId);
    }
}
