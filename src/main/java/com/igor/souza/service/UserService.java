package com.igor.souza.service;

import com.igor.souza.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
