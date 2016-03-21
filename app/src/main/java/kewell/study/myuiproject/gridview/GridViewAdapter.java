package kewell.study.myuiproject.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import kewell.study.myuiproject.R;

/**
 * Created by Administrator on 2016-03-16.
 */
public class GridViewAdapter extends BaseAdapter {
    //上下文对象
    private Context mContext;
    private List<ImageInfo> mImageInfos;

    public GridViewAdapter(Context context, List<ImageInfo> imageInfos) {
        this.mContext = context;
        this.mImageInfos = imageInfos;
    }

    @Override
    public int getCount() {
        return mImageInfos.size();
    }

    @Override
    public Object getItem(int i) {
        return mImageInfos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(this.mContext).inflate(R.layout.gridview_item, null);
        ImageView imageView=(ImageView)view.findViewById(R.id.image_gridview);
        TextView textView=(TextView)view.findViewById(R.id.tv_gridview);

        //设置Image
        imageView.setAdjustViewBounds(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
        imageView.setImageResource(mImageInfos.get(i).getImageId());
        //设置文本
        textView.setText(mImageInfos.get(i).getImageText());
        return view;
    }
}
