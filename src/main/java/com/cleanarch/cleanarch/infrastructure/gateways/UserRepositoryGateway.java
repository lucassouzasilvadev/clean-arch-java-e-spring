package com.cleanarch.cleanarch.infrastructure.gateways;

import com.cleanarch.cleanarch.application.gateways.UserGateway;
import com.cleanarch.cleanarch.domain.entity.User;
import com.cleanarch.cleanarch.infrastructure.persistence.UserEntity;
import com.cleanarch.cleanarch.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;
    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity saveObj = userRepository.save(userEntity);
        return userEntityMapper.toDomainObj(saveObj);
    }
}
