package kewell.study.myuiproject.spinner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;
import java.util.List;

import kewell.study.myuiproject.R;

/**
 * @author 肖昌
 * @version 1.0
 *          Spinner示例
 *          使用spinner完成三级联动效果，选择省份，加载相应的城市，
 *          选择城市加载相应的区域使用spinner完成三级联动效果，选择省份，加载相应的城市，选择城市加载相应的区域
 * @date 2016.3.14
 */
public class SpinnerActivity extends Activity {

    Spinner mSpinnerProvince;
    Spinner mSpinnerCity;
    Spinner mSpinnerArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        //初始化控件
        this.initUI();
        //绑定省份信息
        this.bindSpinnerProvince();
        //注册Spinner的选择事件
        this.spinnerListenerSelect();
    }

    /**
     * 初始化控件
     */
    private void initUI() {
        this.mSpinnerProvince = (Spinner) this.findViewById(R.id.spinner_province);
        this.mSpinnerCity = (Spinner) this.findViewById(R.id.spinner_city);
        this.mSpinnerArea = (Spinner) this.findViewById(R.id.spinner_area);
    }

    /**
     * 绑定省份信息
     */
    private void bindSpinnerProvince() {
        //获得数据源
        SpinnerJson spinnerJson = new SpinnerJson(this);
        List<ProvinceInfo> lstProvinceInfo = spinnerJson.getProvinceInfos();
        //建立Adapter
        ArrayAdapter<ProvinceInfo> adapterProvinceInfo = new ArrayAdapter<ProvinceInfo>(this, android.R.layout.simple_dropdown_item_1line, lstProvinceInfo);
        //绑定Adapter到UI
        mSpinnerProvince.setAdapter(adapterProvinceInfo);
    }

    /**
     * 注册省份和城市的选择事件
     */
    private void spinnerListenerSelect() {
        mSpinnerProvince.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ProvinceInfo provinceInfo = (ProvinceInfo) adapterView.getSelectedItem();
                List<CityInfo> lstCityInfo = provinceInfo.getCitylist();
                ArrayAdapter<CityInfo> adapterCityInfo = new ArrayAdapter<CityInfo>(SpinnerActivity.this, android.R.layout.simple_dropdown_item_1line, lstCityInfo);
                //绑定Adapter到UI
                mSpinnerCity.setAdapter(adapterCityInfo);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        mSpinnerCity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                CityInfo cityInfo = (CityInfo) adapterView.getSelectedItem();
                List<AreaInfo> lstAreaInfo = cityInfo.getArealist();

                ArrayAdapter<AreaInfo> adapterAreaInfo = new ArrayAdapter<AreaInfo>(SpinnerActivity.this, android.R.layout.simple_dropdown_item_1line, lstAreaInfo);
                //绑定Adapter到UI
                mSpinnerArea.setAdapter(adapterAreaInfo);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
