package org.lanqiao.jingdong.service;

import org.lanqiao.jingdong.entity.CustomerInf;
import org.lanqiao.jingdong.entity.LoginInf;
import org.lanqiao.jingdong.mapper.CustomerInfMapper;
import org.lanqiao.jingdong.mapper.LoginInfMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;

@Service
public class RegisterServiceImpl implements RegisterService{
    @Autowired
    LoginInfMapper loginInfMapper;
    @Autowired
    CustomerInfMapper customerInfMapper;
    @Override
    @Transactional
    public int createAccount(LoginInf loginInf) {
        CustomerInf customerInf=new CustomerInf();
        loginInfMapper.insertSelective(loginInf);
        customerInf.setLoginId(loginInf.getLoginId());
        customerInfMapper.insertSelective(customerInf);
        return 0;
    }
    @Override
    @Transactional
    public int samePhone(BigInteger phoneNum){
        return loginInfMapper.samePhone(phoneNum);
    }

    @Override
    @Transactional
    public int sameUsername(String username) {
        return loginInfMapper.sameUsername(username);
    }

    @Override
    public int certificate(CustomerInf customerInf) {
        customerInfMapper.updateByPrimaryKeySelective(customerInf);
        return 0;
    }
}
