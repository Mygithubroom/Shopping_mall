package org.lanqiao.jingdong.mapper;

import org.lanqiao.jingdong.entity.OrderInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderInfoMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

    int insertLoginId(OrderInfo orderInfo);

    OrderInfo getOrderInfo(Integer orderId);
}