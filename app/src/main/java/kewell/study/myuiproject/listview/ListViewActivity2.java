package kewell.study.myuiproject.listview;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kewell.study.myuiproject.R;


/**
 * @author 肖昌
 * @version 1.0
 *          ListView示例二
 * @date 2016.3.17
 */
public class ListViewActivity2 extends ListActivity {

    List<ListNumInfo> mListNuminfos;
    ListViewAdapter2 mListadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.registerForContextMenu(getListView());

        getListView().setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        //ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_multiple_choice,itemStrings);
        this.initListNumInfo();
        mListadapter = new ListViewAdapter2(this, R.layout.listview_item2, mListNuminfos);
        setListAdapter(mListadapter);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.contextmenu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item
                .getMenuInfo();
        String msg = "";
        switch (item.getItemId()) {
            case R.id.item_select_all:
                this.selectAllOrNot(true);
                msg = item.getTitle().toString();
                break;
            case R.id.item_unselect_all:
                this.selectAllOrNot(false);
                msg = item.getTitle().toString();
                break;
            case R.id.item_delete:
                msg = "删除了" + this.removeItem() + "条数据";
                break;
            default:
                break;
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        return super.onContextItemSelected(item);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(this, mListNuminfos.get(position).getNumName(), Toast.LENGTH_SHORT).show();
    }

    /**
     * 初始化数据源
     */
    private void initListNumInfo() {
        mListNuminfos = new ArrayList<ListNumInfo>();
        String[] itemStrings = getResources().getStringArray(R.array.listview_texts);
        for (int i = 0; i < itemStrings.length; i++) {
            mListNuminfos.add(new ListNumInfo(itemStrings[i]));
        }
        ;
    }

    /**
     * @param isChecked 是否选择
     *                  全选或者全部选
     * @author 肖昌
     */
    private void selectAllOrNot(boolean isChecked) {
        int count = mListNuminfos.size();
        for (int i = 0; i < count; i++) {
            mListNuminfos.get(i).setIsChecked(isChecked);
        }
        mListadapter.notifyDataSetChanged();
    }

    /**
     * 删除选择的项
     *
     * @return 删除多少列
     */
    private int removeItem() {
        int count = mListNuminfos.size();
        int index = 0;
        for (int i = 0; i < count; i++) {

            if (mListNuminfos.get(i).getIsChecked()) {
                mListNuminfos.remove(i);
                i--;
                count--;
                index++;
            }
        }
        mListadapter.notifyDataSetChanged();
        return index;
    }
}
