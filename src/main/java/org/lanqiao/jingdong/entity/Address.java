package org.lanqiao.jingdong.entity;

public class Address {
    private Integer addressId;

    private ProvinceInfo provinceInfo;

    private CityInfo cityInfo;

    private DistrictInfo districtInfo;

    private String addressDetail;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public ProvinceInfo getProvinceInfo() {
        return provinceInfo;
    }

    public void setProvinceInfo(ProvinceInfo provinceInfo) {
        this.provinceInfo = provinceInfo;
    }

    public CityInfo getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

    public DistrictInfo getDistrictInfo() {
        return districtInfo;
    }

    public void setDistrictInfo(DistrictInfo districtInfo) {
        this.districtInfo = districtInfo;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }
}