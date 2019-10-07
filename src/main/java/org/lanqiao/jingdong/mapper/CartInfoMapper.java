package org.lanqiao.jingdong.mapper;

import org.lanqiao.jingdong.entity.CartInfo;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CartInfoMapper {
    int deleteByPrimaryKey(Integer cartId);

    int insert(CartInfo record);

    int insertSelective(CartInfo record);

    CartInfo selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(CartInfo record);

    int updateByPrimaryKey(CartInfo record);

    List<CartInfo> getAllCart(Integer loginId);

    int deleteByProductId(Integer productId);
}