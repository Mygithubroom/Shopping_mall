package org.lanqiao.jingdong.mapper;

import org.lanqiao.jingdong.entity.ProductCategory;

public interface ProductCategoryMapper {
    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);
}