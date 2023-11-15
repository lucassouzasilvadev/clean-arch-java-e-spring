package com.cleanarch.cleanarch.infrastructure.gateways;

import com.cleanarch.cleanarch.domain.entity.User;
import com.cleanarch.cleanarch.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObj){
        return new UserEntity(userDomainObj.username(), userDomainObj.password(), userDomainObj.email());
    }

    User toDomainObj(UserEntity userEntity){
        return new User(userEntity.getUserName(), userEntity.getPassword(), userEntity.getEmail());
    }
}
