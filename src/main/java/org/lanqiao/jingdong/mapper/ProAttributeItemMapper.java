package org.lanqiao.jingdong.mapper;

import org.lanqiao.jingdong.entity.ProAttributeItem;

public interface ProAttributeItemMapper {
    int deleteByPrimaryKey(Integer attributeItemId);

    int insert(ProAttributeItem record);

    int insertSelective(ProAttributeItem record);

    ProAttributeItem selectByPrimaryKey(Integer attributeItemId);

    int updateByPrimaryKeySelective(ProAttributeItem record);

    int updateByPrimaryKey(ProAttributeItem record);
}