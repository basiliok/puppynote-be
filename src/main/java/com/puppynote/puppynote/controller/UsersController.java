package com.puppynote.puppynote.controller;

import com.puppynote.puppynote.model.Users;
import com.puppynote.puppynote.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    public List<Users> getUsers() {
        return usersService.getAllUsers();
    }
}
