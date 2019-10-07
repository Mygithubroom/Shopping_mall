package org.lanqiao.jingdong.mapper;

import org.lanqiao.jingdong.entity.ProvinceInfo;

public interface ProvinceInfoMapper {
    int deleteByPrimaryKey(Integer province);

    int insert(ProvinceInfo record);

    int insertSelective(ProvinceInfo record);

    ProvinceInfo selectByPrimaryKey(Integer province);

    int updateByPrimaryKeySelective(ProvinceInfo record);

    int updateByPrimaryKey(ProvinceInfo record);
}