package com.example.exception.controllers;

import com.example.exception.services.CheckService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {
    private final CheckService checkService;

    public CheckController(CheckService checkService) {
        this.checkService = checkService;
    }

    @GetMapping("/check")
    public String check(String login, String password, String confirmPassword) {
        checkService.check(login, password, confirmPassword);
        return "проверка пройдина";
    }
}
