package org.lanqiao.jingdong.mapper;

import org.lanqiao.jingdong.entity.LoginLog;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginLogMapper {
    int deleteByPrimaryKey(Integer logId);

    int insert(LoginLog record);

    int insertSelective(LoginLog record);

    LoginLog selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(LoginLog record);

    int updateByPrimaryKey(LoginLog record);
}