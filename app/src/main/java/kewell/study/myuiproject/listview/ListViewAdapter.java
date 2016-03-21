package kewell.study.myuiproject.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import kewell.study.myuiproject.R;
import kewell.study.myuiproject.gridview.ImageInfo;

/**
 * Created by Administrator on 2016-03-16.
 */
public class ListViewAdapter extends BaseAdapter {
    //上下文对象
    private Context mContext;
    private List<StudentInfo> mStudentInfo;

    public ListViewAdapter(Context context, List<StudentInfo> studentInfos) {
        this.mContext = context;
        this.mStudentInfo = studentInfos;
    }

    @Override
    public int getCount() {
        return mStudentInfo.size();
    }

    @Override
    public Object getItem(int i) {
        return mStudentInfo.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(this.mContext).inflate(R.layout.listview_item, null);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageview1);
        TextView textViewId=(TextView)view.findViewById(R.id.tv_listview_id);
        TextView textViewName=(TextView)view.findViewById(R.id.tv_listview_name);
        TextView textViewAge=(TextView)view.findViewById(R.id.tv_listview_age);

        //设置Image
        imageView.setAdjustViewBounds(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
        imageView.setImageResource(mStudentInfo.get(i).getImageId());
        //设置文本
        textViewId.setText(String.valueOf(mStudentInfo.get(i).getStudentId()));
        textViewName.setText(String.valueOf(mStudentInfo.get(i).getStudentName()));
        textViewAge.setText(String.valueOf(mStudentInfo.get(i).getStudentAge()));
        return view;
    }
}
