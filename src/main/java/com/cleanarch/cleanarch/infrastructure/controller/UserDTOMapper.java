package com.cleanarch.cleanarch.infrastructure.controller;

import com.cleanarch.cleanarch.domain.entity.User;

public class UserDTOMapper {

    CreateUserResponse toResponse(User user){
        return new CreateUserResponse(user.username(), user.email());
    }

    public User toUser(CreateUserRequest createUserRequest){
        return new User(createUserRequest.userName(), createUserRequest.password(), createUserRequest.email());
    }
}
