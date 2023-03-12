package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Photo;
import com.example.getmesocialservice.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PhotoResource {
    @Autowired
    private PhotoService photoService;

    @GetMapping("/photo")
    public Photo getPhoto(){
        return photoService.getPhoto();
    }

    @PostMapping("/photo")
    public Photo savePhoto(@RequestBody Photo photo){
        return photoService.savePhoto(photo);
    }

    @GetMapping("/allPhotos")
    public List<Photo> getAllPhotos(){
        return photoService.getAllPhotos();
    }

    @GetMapping("/photo/{photoId}")
    public Photo getPhotoById(@PathVariable("photoId") int photoId){
        return photoService.getPhotoById(photoId);
    }

    @PutMapping("/photo/{photoId}")
    public Photo updatePhoto(@PathVariable("photoId") int photoId, @RequestBody Photo photo){
        return photoService.updatePhoto(photoId,photo);
    }

    @DeleteMapping("/photo")
    public Photo deletePhoto(@RequestParam(name = "photoId") int photoId){
        return photoService.deletePhoto(photoId);
    }
}
