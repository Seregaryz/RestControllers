package ru.kpfu.itis.rest.dto;

import lombok.Data;

@Data
public class SignInDto {
    private String email;
    private String password;
}

