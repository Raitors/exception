package com.example.exception.services;

import com.example.exception.exceptions.WrongLoginException;
import com.example.exception.exceptions.WrongPasswordException;

public interface CheckService {

    void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException;
}
