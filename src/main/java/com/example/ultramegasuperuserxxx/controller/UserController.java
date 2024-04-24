package com.example.ultramegasuperuserxxx.controller;

import com.example.ultramegasuperuserxxx.model.User;
import org.springframework.ui.Model;

public interface UserController {
    String findAll(Model model);
    String createUserForm(User user);
    String createUser(User user);
    String deleteUser(Long id);
    String updateUserForm(Long id, Model model);
    String updateUser(User user);
}