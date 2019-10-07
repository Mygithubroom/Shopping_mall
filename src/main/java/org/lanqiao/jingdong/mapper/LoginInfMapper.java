package org.lanqiao.jingdong.mapper;

import org.lanqiao.jingdong.entity.LoginInf;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface LoginInfMapper {
    int deleteByPrimaryKey(Integer loginId);

    int insert(LoginInf record);

    int insertSelective(LoginInf record);

    LoginInf selectByPrimaryKey(Integer loginId);

    int updateByPrimaryKeySelective(LoginInf record);

    int updateByPrimaryKey(LoginInf record);
    int samePhone(BigInteger phoneNum);
    int sameUsername(String username);
    LoginInf checkuser(LoginInf loginInf);
}