package org.lanqiao.jingdong.mapper;

import org.lanqiao.jingdong.entity.DistrictInfo;

public interface DistrictInfoMapper {
    int deleteByPrimaryKey(Integer district);

    int insert(DistrictInfo record);

    int insertSelective(DistrictInfo record);

    DistrictInfo selectByPrimaryKey(Integer district);

    int updateByPrimaryKeySelective(DistrictInfo record);

    int updateByPrimaryKey(DistrictInfo record);
}