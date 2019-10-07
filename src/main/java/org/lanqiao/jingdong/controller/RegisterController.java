package org.lanqiao.jingdong.controller;

import org.lanqiao.jingdong.entity.CustomerInf;
import org.lanqiao.jingdong.entity.LoginInf;
import org.lanqiao.jingdong.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class RegisterController {
    @Autowired
    RegisterService registerService;
    @RequestMapping("/register")
    public int creatAccount(LoginInf loginInf){
        registerService.createAccount(loginInf);
        return 0;
    }
    @RequestMapping("/samePhone")
    public int samePhone(BigInteger phoneNum){
        return registerService.samePhone(phoneNum);
    }
    @RequestMapping("/sameUsername")
    public int sameUsername(String username){
        return registerService.sameUsername(username);
    }
    @RequestMapping("/certificate")
    public int certificate(CustomerInf customerInf){
        return registerService.certificate(customerInf);
    }
}
