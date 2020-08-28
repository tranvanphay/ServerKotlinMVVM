package com.phaytran.demo.controller;


import com.phaytran.demo.model.request.LoginReq;
import com.phaytran.demo.model.request.RegisterReq;
import com.phaytran.demo.model.response.LoginRes;
import com.phaytran.demo.model.response.RegisterRes;
import com.phaytran.demo.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserServices userServices;

    @RequestMapping(value = "login",method = RequestMethod.POST)
    private LoginRes loginService(@RequestBody LoginReq loginReq){
        return  this.userServices.isLoginSuccess(loginReq);
    }

    @RequestMapping(value = "register",method = RequestMethod.POST)
    private RegisterRes registerService(@RequestBody RegisterReq registerReq){
        return this.userServices.isRegisterSuccess(registerReq);
    }
}
