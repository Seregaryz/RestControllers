package ru.kpfu.itis.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.rest.models.user.User;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByEmail(String email);
}

