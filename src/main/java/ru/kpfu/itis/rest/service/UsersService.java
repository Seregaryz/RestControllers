package ru.kpfu.itis.rest.service;


import ru.kpfu.itis.rest.models.user.User;

import java.util.List;

public interface UsersService {
    List<User> getAllUsers();

    void deleteUser(Long userId);

    User getUserById(long id);
}

