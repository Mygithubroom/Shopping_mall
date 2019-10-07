package org.lanqiao.jingdong.mapper;

import org.lanqiao.jingdong.entity.ProductPic;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPicMapper {
    int deleteByPrimaryKey(Integer productPicId);

    int insert(ProductPic record);

    int insertSelective(ProductPic record);

    ProductPic selectByPrimaryKey(Integer productPicId);

    int updateByPrimaryKeySelective(ProductPic record);

    int updateByPrimaryKey(ProductPic record);
}