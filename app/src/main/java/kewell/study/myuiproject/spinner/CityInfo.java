package kewell.study.myuiproject.spinner;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author 肖昌
 * @date 2016.3.15
 * 市实体类
 */
public class CityInfo {
    private String city;
    private List<AreaInfo> arealist;

    public CityInfo() {
        arealist=new ArrayList<AreaInfo>();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<AreaInfo> getArealist() {
        return arealist;
    }

    public void setArealist(List<AreaInfo> arealist) {
        this.arealist = arealist;
    }

    @Override
    public String toString() {
        return this.city;
    }
}
