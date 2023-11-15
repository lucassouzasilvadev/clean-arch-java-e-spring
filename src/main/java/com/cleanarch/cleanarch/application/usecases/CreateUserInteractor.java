package com.cleanarch.cleanarch.application.usecases;

import com.cleanarch.cleanarch.application.gateways.UserGateway;
import com.cleanarch.cleanarch.domain.entity.User;

public class CreateUserInteractor {

    private UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user){
        return userGateway.createUser(user);
    }


}
