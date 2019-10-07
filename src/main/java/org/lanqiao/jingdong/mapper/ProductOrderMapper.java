package org.lanqiao.jingdong.mapper;

import org.lanqiao.jingdong.entity.ProductOrder;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOrderMapper {
    int insert(ProductOrder record);

    int insertSelective(ProductOrder record);
}