package org.lanqiao.jingdong.service;

import org.lanqiao.jingdong.entity.CustomerInf;
import org.lanqiao.jingdong.entity.LoginInf;

import java.math.BigInteger;

public interface RegisterService {
    public int createAccount(LoginInf loginInf);
    public int samePhone(BigInteger phoneNum);
    public int sameUsername(String username);
    public int certificate(CustomerInf customerInf);
}
