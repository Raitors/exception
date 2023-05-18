package com.example.exception.services;

import com.example.exception.exceptions.WrongLoginException;
import com.example.exception.exceptions.WrongPasswordException;
import org.springframework.stereotype.Service;

@Service
public class CheckServiceImpl implements CheckService {
    private static final String REGEX = "^[a-zA-Z0-9_]*$";

    @Override
    public void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches(REGEX)) {
            throw new WrongLoginException("содержание логина неверное");
        }
        if (login.length() > 20) {
            throw new WrongLoginException("размер логина не должен быть больше 20");
        }
        if (!password.matches(REGEX)) {
            throw new WrongPasswordException("содержание пароля неверное");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("размер пароля не должен быть больше 20");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("пароли не совпадают");
        }
    }
}




