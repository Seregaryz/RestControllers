package ru.kpfu.itis.rest.service;

import ru.kpfu.itis.rest.dto.SignInDto;
import ru.kpfu.itis.rest.dto.TokenDto;

public interface SignInService {
    TokenDto signIn(SignInDto signInData);
}
