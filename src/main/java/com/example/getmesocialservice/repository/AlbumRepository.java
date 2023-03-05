package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {

    List<Album> albumList = new ArrayList();

    public Album getAlbum(){
        Album album = new Album(1234, "IFTI", "artistic", "www.getmehired.com");
        return album;
    }

    public Album saveAlbum(Album album) {
        album.setAlbumId(albumList.size() + 1);
      albumList.add(album);
      return album;
    }

    public List<Album> getAllAlbums() {
        return albumList;
    }

    public Album getAlbumById(int albumId) {
        for(Album album:albumList){
            if(album.getAlbumId() == albumId){
                return album;
            }
        }
        return null;
    }
}
