package com.cleanarch.cleanarch.main;

import com.cleanarch.cleanarch.application.gateways.UserGateway;
import com.cleanarch.cleanarch.application.usecases.CreateUserInteractor;
import com.cleanarch.cleanarch.infrastructure.controller.UserDTOMapper;
import com.cleanarch.cleanarch.infrastructure.gateways.UserEntityMapper;
import com.cleanarch.cleanarch.infrastructure.gateways.UserRepositoryGateway;
import com.cleanarch.cleanarch.infrastructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);

    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }
}
