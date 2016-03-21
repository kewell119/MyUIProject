package kewell.study.myuiproject.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

import kewell.study.myuiproject.R;

/**
 * Created by Administrator on 2016-03-18.
 */
public class ListViewAdapter2 extends ArrayAdapter {

    private Context mContext;
    private String[] mStringNums;

    public ListViewAdapter2(Context context, int resource, String[] stringNums) {
        super(context, resource, stringNums);
        this.mContext = context;
        this.mStringNums = stringNums;
    }

    @Override
    public int getCount() {
        return mStringNums.length;
    }

    @Override
    public Object getItem(int i) {
        return mStringNums[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = LayoutInflater.from(this.mContext).inflate(R.layout.listview_item2, null);
        TextView textViewId = (TextView) view.findViewById(R.id.tv_item2);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.cb_item2);
        textViewId.setText(mStringNums[i]);
        checkBox.setChecked(false);
        return view;
    }
}
