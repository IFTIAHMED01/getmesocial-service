package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Album;
import org.springframework.stereotype.Repository;

@Repository
public class AlbumRepository {
    public Album getAlbum(){
        Album album = new Album(1234, "IFTI", "artistic", "www.getmehired.com");
        return album;
    }
}
