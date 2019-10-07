package org.lanqiao.jingdong.mapper;

import org.lanqiao.jingdong.entity.ProAttribute;

public interface ProAttributeMapper {
    int deleteByPrimaryKey(Integer attributeId);

    int insert(ProAttribute record);

    int insertSelective(ProAttribute record);

    ProAttribute selectByPrimaryKey(Integer attributeId);

    int updateByPrimaryKeySelective(ProAttribute record);

    int updateByPrimaryKey(ProAttribute record);
}