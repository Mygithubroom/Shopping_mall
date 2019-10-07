package org.lanqiao.jingdong.mapper;

import org.lanqiao.jingdong.entity.CustomerInf;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerInfMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(CustomerInf record);

    int insertSelective(CustomerInf record);

    CustomerInf selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(CustomerInf record);

    int updateByPrimaryKey(CustomerInf record);

    CustomerInf selectByLoginId(Integer loginId);
}