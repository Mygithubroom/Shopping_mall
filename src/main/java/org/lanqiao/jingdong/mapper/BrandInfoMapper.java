package org.lanqiao.jingdong.mapper;

import org.lanqiao.jingdong.entity.BrandInfo;

public interface BrandInfoMapper {
    int deleteByPrimaryKey(Integer brandId);

    int insert(BrandInfo record);

    int insertSelective(BrandInfo record);

    BrandInfo selectByPrimaryKey(Integer brandId);

    int updateByPrimaryKeySelective(BrandInfo record);

    int updateByPrimaryKey(BrandInfo record);
}