package kewell.study.myuiproject.gridview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import kewell.study.myuiproject.R;

/**
 * @author 肖昌
 * @version 1.0
 *          GridView示例
 * @date 2016.3.16
 */
public class GridViewActivity extends Activity {

    GridView mGridViewImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);

        this.mGridViewImage = (GridView) this.findViewById(R.id.gv_image);
        this.bindGridView();
    }

    /**
     * 绑定GridView
     */
    private void bindGridView() {
        List<ImageInfo> imageInfos=this.getImageInfos();
        GridViewAdapter adapter =new GridViewAdapter(this,imageInfos);
        this.mGridViewImage.setAdapter(adapter);
    }

    /**
     * 建立数据源
     * @return List<ImageInfo>
     */
    private List<ImageInfo> getImageInfos() {
        List<ImageInfo> imageInfos=new ArrayList<ImageInfo>();
        String[] imageContens = getResources().getStringArray(R.array.gridview_texts);
        for(int i=0;i<imageContens.length;i++){
            ImageInfo imageInfo=new ImageInfo(imageContens[i],R.drawable.contacts);
            imageInfos.add(imageInfo);
        }
        return imageInfos;
    }

}
