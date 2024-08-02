package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserServices {

    //User Operation

    //Create
    User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get single user of given userId

    User getUser(String userId);

    // Update an existing user
    User updateUser(User user);

    // Delete a user by userId
    void deleteUser(String userId);


}
