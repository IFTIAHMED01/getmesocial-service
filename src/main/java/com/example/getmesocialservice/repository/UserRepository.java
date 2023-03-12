package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> userList = new ArrayList();

    public User getUser(){
        User user = new User(1234, "IFTI", "iftiahmed1997@gmail.com", "www.getmehired.com");
        return user;
    }

    public User saveUser(User user) {
        user.setId(userList.size() + 1);
        userList.add(user);
        return user;
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public User getUserById(int userId) {
        for(User user:userList){
            if(user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    public User updateUser(int userId, User user) {
        for(User u:userList){
            if(u.getId() == userId){
                u.setName(user.getName());
                u.setEmail(user.getEmail());
                u.setProfilePhotoUrl(user.getProfilePhotoUrl());
                return u;
            }
        }
        return null;
    }

    public User deleteUser(int userId) {
        User deletedUser = null;
        for(User u:userList){
            if(u.getId() == userId){
                deletedUser = u;
                userList.remove(u);
            }
        }
        return deletedUser;
    }
}
