package com.example.controller;

import Hz.BaseCommon.InfoUtility.Base.ObjectReturn;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getuser")
    public ObjectReturn hello(){
        ObjectReturn objRun=new ObjectReturn();
        objRun.data=userService.getUser();
        return objRun;
    }
}
