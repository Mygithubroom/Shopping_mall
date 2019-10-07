package org.lanqiao.jingdong.entity;

public class ProAttributeItem {
    private Integer attributeItemId;

    private Integer attributeId;

    private String attrItemName;

    private String attrItemSort;

    public Integer getAttributeItemId() {
        return attributeItemId;
    }

    public void setAttributeItemId(Integer attributeItemId) {
        this.attributeItemId = attributeItemId;
    }

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public String getAttrItemName() {
        return attrItemName;
    }

    public void setAttrItemName(String attrItemName) {
        this.attrItemName = attrItemName == null ? null : attrItemName.trim();
    }

    public String getAttrItemSort() {
        return attrItemSort;
    }

    public void setAttrItemSort(String attrItemSort) {
        this.attrItemSort = attrItemSort == null ? null : attrItemSort.trim();
    }
}