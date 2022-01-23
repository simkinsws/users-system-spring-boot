package com.appsdevelopingws.photoapp.ui.controller;
import com.appsdevelopingws.photoapp.dto.UserDto;
import com.appsdevelopingws.photoapp.service.UserService;
import com.appsdevelopingws.photoapp.ui.model.request.UserDetailsRequestModel;
import com.appsdevelopingws.photoapp.ui.model.response.UserDetailsResponseModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<UserDetailsResponseModel> getUsers() {
        return null;
    }

    @GetMapping("/:id")
    public String getUser(@RequestParam long id)
    {
        return "get user was called";
    }

    @PostMapping
    public UserDetailsResponseModel createUser(@RequestBody UserDetailsRequestModel userDetails)
    {
        UserDetailsResponseModel responseModel = new UserDetailsResponseModel();

        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetails,userDto);

        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser,responseModel);

        return responseModel;
    }

    @PutMapping
    public String updateUser()
    {
        return "user update was called";
    }

    @DeleteMapping
    public String deleteUser()
    {
        return "delete user was called";
    }

}
