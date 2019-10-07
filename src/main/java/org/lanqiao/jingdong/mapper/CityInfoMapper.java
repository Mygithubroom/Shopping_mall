package org.lanqiao.jingdong.mapper;

import org.lanqiao.jingdong.entity.CityInfo;

public interface CityInfoMapper {
    int deleteByPrimaryKey(Integer city);

    int insert(CityInfo record);

    int insertSelective(CityInfo record);

    CityInfo selectByPrimaryKey(Integer city);

    int updateByPrimaryKeySelective(CityInfo record);

    int updateByPrimaryKey(CityInfo record);
}