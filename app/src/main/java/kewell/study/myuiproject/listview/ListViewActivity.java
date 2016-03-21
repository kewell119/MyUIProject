package kewell.study.myuiproject.listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kewell.study.myuiproject.R;
import kewell.study.myuiproject.gridview.GridViewAdapter;
import kewell.study.myuiproject.gridview.ImageInfo;

/**
 * @author 肖昌
 * @version 1.0
 *          ListView示例一
 * @date 2016.3.16
 */
public class ListViewActivity extends Activity {

    ListView mListViewStudnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        this.mListViewStudnt = (ListView) this.findViewById(R.id.lv_student);
        this.bindListView();
    }

    /**
     * 绑定GridView
     */
    private void bindListView() {
        List<StudentInfo> studentInfos = this.getStudntInfos();
        ListViewAdapter adapter = new ListViewAdapter(this, studentInfos);
        this.mListViewStudnt.setAdapter(adapter);
    }

    /**
     * 建立数据源
     *
     * @return List<StudentInfo>
     */
    private List<StudentInfo> getStudntInfos() {
        List<StudentInfo> studentInfos = new ArrayList<StudentInfo>();
        studentInfos.add(new StudentInfo(1, "张三", 20, R.drawable.china));
        studentInfos.add(new StudentInfo(1, "李四", 21, R.drawable.america));
        studentInfos.add(new StudentInfo(1, "王五", 22, R.drawable.argentina));
        studentInfos.add(new StudentInfo(1, "赵四", 23, R.drawable.australia));
        studentInfos.add(new StudentInfo(1, "小沈阳",24, R.drawable.canada));
        studentInfos.add(new StudentInfo(1, "刘能", 25, R.drawable.korea));
        studentInfos.add(new StudentInfo(1, "宋小宝", 26, R.drawable.brazil));
        studentInfos.add(new StudentInfo(1, "小岳岳", 27, R.drawable.spain));
        return studentInfos;
    }
}
