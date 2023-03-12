package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {

    List<Album> albumList = new ArrayList();

    public Album getAlbum(){
        Album album = new Album(1234, "IFTI", "artistic", "www.getmehired.com","2023/01/12");
        return album;
    }

    public Album saveAlbum(Album album) {
        album.setId(albumList.size() + 1);
      albumList.add(album);
      return album;
    }

    public List<Album> getAllAlbums() {
        return albumList;
    }

    public Album getAlbumById(int albumId) {
        for(Album album:albumList){
            if(album.getId() == albumId){
                return album;
            }
        }
        return null;
    }

    public Album updateAlbum(int albumId, Album album) {
        for(Album a:albumList){
            if(a.getId() == albumId){
                a.setName(album.getName());
                a.setCoverPhotoUrl(album.getCoverPhotoUrl());
                a.setCreatedBy(album.getCreatedBy());
                a.setDataCreated(album.getDataCreated());
                return a;
            }
        }
        return null;
    }

    public Album deleteAlbum(int albumId) {
        Album deletedAlbum = null;
        for(Album a:albumList){
            if(a.getId() == albumId){
                deletedAlbum = a;
                albumList.remove(a);
            }
        }
        return deletedAlbum;
    }
}
