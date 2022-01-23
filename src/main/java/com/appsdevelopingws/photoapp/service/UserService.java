package com.appsdevelopingws.photoapp.service;


import com.appsdevelopingws.photoapp.dto.UserDto;
import com.appsdevelopingws.photoapp.entity.UserEntity;

public interface UserService {
    UserDto createUser(UserDto user);
    Iterable<UserEntity> getUsers();
}
