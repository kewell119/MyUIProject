package kewell.study.myuiproject.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.List;

import kewell.study.myuiproject.R;

/**
 * Created by Administrator on 2016-03-18.
 */
public class ListViewAdapter2 extends ArrayAdapter {

    private Context mContext;
    private List<ListNumInfo> mListNums;

    public ListViewAdapter2(Context context, int resource,List<ListNumInfo> listNums) {
        super(context, resource, listNums);
        this.mContext = context;
        this.mListNums = listNums;
    }

    @Override
    public int getCount() {
        return mListNums.size();
    }

    @Override
    public Object getItem(int i) {
        return mListNums.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = LayoutInflater.from(this.mContext).inflate(R.layout.listview_item2, null);
        TextView textViewId = (TextView) view.findViewById(R.id.tv_item2);
        final CheckBox checkBox = (CheckBox) view.findViewById(R.id.cb_item2);
        checkBox.setTag(i);
        textViewId.setText(mListNums.get(i).getNumName());
        checkBox.setChecked(mListNums.get(i).getIsChecked());
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mListNums.get((int)compoundButton.getTag()).setIsChecked(b);
            }
        });
        return view;
    }
}
