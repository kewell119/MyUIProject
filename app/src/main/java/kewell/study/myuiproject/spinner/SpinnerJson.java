package kewell.study.myuiproject.spinner;

import android.content.Context;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import kewell.study.myuiproject.R;

/**
 * @author 肖昌
 * @date 2016.3.14
 * 解析city.json文件
 */
public class SpinnerJson {

    private Context mContext;

    public SpinnerJson(Context context) {
        this.mContext = context;
    }

    /**
     * @author 肖昌
     * @date 2016.3.14
     * @return json格式的字符串
     * 获得格式化city.json
     */
    public List<ProvinceInfo> getProvinceInfos() {
        Gson gson = new Gson();
        String json = this.getJsonData();
        ProvinceWrapper wrrap = gson.fromJson(json, ProvinceWrapper.class);
        return wrrap.provincelist;
    }

    /**
     * @author 肖昌
     * @date 2016.3.14
     * @return json格式的字符串
     * 获得city.json的内容
     */
    private String getJsonData() {
        StringBuffer sb = new StringBuffer();
        try {
            InputStream is = this.mContext.getResources().openRawResource(R.raw.city);
            int len = -1;
            byte[] bt = new byte[1024];
            while ((len = is.read(bt)) != -1) {
                sb.append(new String(bt, 0, len, "utf-8"));
            }
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
