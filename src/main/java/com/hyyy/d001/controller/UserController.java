package com.hyyy.d001.controller;

import com.hyyy.d001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/del")
    public void delete(){
        userService.deleteUserById(2);
    }

    @GetMapping("/all")
    public void getAll(){
        userService.getAll(); }

    @GetMapping("/update")
    public void change(){

        userService.updateUser(); }

    @GetMapping("/add")
    public void add(){

        userService.add(); }

}
