package ru.kpfu.itis.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.rest.models.user.User;
import ru.kpfu.itis.rest.repository.UsersRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public void deleteUser(Long userId) {
        usersRepository.deleteById(userId);
    }

    @Override
    public User getUserById(long id) {
        Optional<User> userOptional = usersRepository.findById(id);
        return userOptional.orElse(null);
    }
}
