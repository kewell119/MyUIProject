package kewell.study.myuiproject.spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 肖昌
 * @date 2016.3.15
 * 省实体类
 */
public class ProvinceInfo {
    private String province;
    private List<CityInfo> citylist;

    public ProvinceInfo() {
        citylist = new ArrayList<CityInfo>();
    }

    public List<CityInfo> getCitylist() {
        return citylist;
    }

    public void setCitylist(List<CityInfo> citylist) {
        this.citylist = citylist;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return this.province;
    }

}