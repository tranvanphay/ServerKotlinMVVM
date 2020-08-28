package com.phaytran.demo.service;


import com.phaytran.demo.model.request.LoginReq;
import com.phaytran.demo.model.request.RegisterReq;
import com.phaytran.demo.model.response.LoginRes;
import com.phaytran.demo.model.response.RegisterRes;

public interface UserServices {
    LoginRes isLoginSuccess(LoginReq logReq);
    RegisterRes isRegisterSuccess(RegisterReq registerReq);
}
