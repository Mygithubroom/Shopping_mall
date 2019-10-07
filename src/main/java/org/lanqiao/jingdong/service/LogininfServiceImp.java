package org.lanqiao.jingdong.service;

import org.lanqiao.jingdong.entity.LoginInf;
import org.lanqiao.jingdong.entity.OrderInfo;
import org.lanqiao.jingdong.mapper.LoginInfMapper;
import org.lanqiao.jingdong.mapper.OrderInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.math.BigInteger;
import java.util.regex.*;
@Service
public class LogininfServiceImp implements LogininfService {
    @Autowired
    LoginInfMapper loginInfMapper;
    @Override
    public boolean checkuser(LoginInf loginInf, HttpServletResponse response) {
        String matchem="[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+";
        String maychtel="1([38]\\d|5[0-35-9]|7[3678])\\d{8}";
        boolean isMatch=Pattern.matches(matchem,loginInf.getAccount());
        if(isMatch){
            loginInf.setEmail(loginInf.getAccount());
        }else {
            isMatch=Pattern.matches(maychtel,loginInf.getAccount());
            if (isMatch){
                loginInf.setPhoneNum(Long.valueOf(loginInf.getAccount()));
            }else {
                loginInf.setUsername(loginInf.getAccount());
            }
        }
        LoginInf loginInf1 = loginInfMapper.checkuser(loginInf);

        if(loginInf1!=null) {
//            loginInf1.setStatus(1);
//            session.setAttribute("loginInf",loginInf1);
            Cookie cookie=new Cookie("loginId",String.valueOf(loginInf1.getLoginId()));
            cookie.setPath("/");
            response.addCookie(cookie);
            return true;
        }
        return false;
    }
}
