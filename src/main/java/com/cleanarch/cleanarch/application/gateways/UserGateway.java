package com.cleanarch.cleanarch.application.gateways;

import com.cleanarch.cleanarch.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
