package com.startlearningspringboot.learningspringboot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startlearningspringboot.learningspringboot.model.User;

@RestController
@RequestMapping("/users")
public class UserController {
  private List<User> users = new ArrayList<>();

  @GetMapping("/")
  public User index() {
    User user = new User();
    user.setId(1L);
    user.setEmail("kevsonfilipesantos@gmail.com");
    user.setPassword("1234");
    return user;
  }

  @PostMapping("/")
  public List<User> create(@RequestBody User user) {
    users.add(user);
    return users;
  }
}
