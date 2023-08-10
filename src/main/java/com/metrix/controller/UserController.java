package com.metrix.controller;

import com.metrix.service.UserService;
import com.metrix.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public ResultData findAllUsers() {
        ResultData data = userService.findAllUsers();
        return data;
    }

}
