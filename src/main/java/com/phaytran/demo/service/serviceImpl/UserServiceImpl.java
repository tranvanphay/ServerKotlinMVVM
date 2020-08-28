package com.phaytran.demo.service.serviceImpl;

import com.phaytran.demo.model.User;
import com.phaytran.demo.model.request.LoginReq;
import com.phaytran.demo.model.request.RegisterReq;
import com.phaytran.demo.model.response.LoginRes;
import com.phaytran.demo.model.response.RegisterRes;
import com.phaytran.demo.repository.UserRepository;
import com.phaytran.demo.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl  implements UserServices {
    @Autowired
    UserRepository userRepository;

    @Override
    public LoginRes isLoginSuccess(LoginReq logReq) {
        Optional<User> user = this.userRepository.findUserByUserNameAndPassword(logReq.getUserName(),logReq.getPassword());
        return user.map(value -> new LoginRes(true, value.getId())).orElseGet(() -> new LoginRes(false, null));
    }

    @Override
    public RegisterRes isRegisterSuccess(RegisterReq registerReq) {
        User user = new User();
        user.setUserName(registerReq.getUserName());
        user.setPassword(registerReq.getPassword());
        user.setEmail(registerReq.getEmail());
        user.setDisplayName(registerReq.getDisplayName());
        User userSaved = this.userRepository.save(user);
        return new RegisterRes(true);
    }
}
