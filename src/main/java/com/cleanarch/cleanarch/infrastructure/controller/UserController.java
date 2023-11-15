package com.cleanarch.cleanarch.infrastructure.controller;

import com.cleanarch.cleanarch.application.usecases.CreateUserInteractor;
import com.cleanarch.cleanarch.domain.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    private CreateUserInteractor createUserInteractor;
    private UserDTOMapper userDTOMapper;

    public UserController(CreateUserInteractor createUserInteractor, UserDTOMapper userDTOMapper) {
        this.createUserInteractor = createUserInteractor;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping
    CreateUserResponse create(@RequestBody CreateUserRequest request){
        User userBussinesObj = userDTOMapper.toUser(request);
        User user = createUserInteractor.createUser(userBussinesObj);
        return  userDTOMapper.toResponse(user);
    }

}
