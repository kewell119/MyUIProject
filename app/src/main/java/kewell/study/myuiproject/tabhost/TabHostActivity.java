package kewell.study.myuiproject.tabhost;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import java.security.acl.Group;

import kewell.study.myuiproject.R;

/**
 * @author 肖昌
 * @version 1.0
 *          TabHost示例
 *          使用Activity做出以下页卡效果，每个页卡单独对应一个Activity
 * @date 2016.3.24
 */
public class TabHostActivity extends ActivityGroup {

    TabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tabhost);
        this.initTabHost();
    }

    private void initTabHost() {
        String[] tabHostItemTexts = this.getResources().getStringArray(R.array.tabhost_texts);
        Intent[] intents = new Intent[]{new Intent(this, TabHostGameActivity.class),
                new Intent(this, TabHostMusicActivity.class), new Intent(this, TabHostSportsActivity.class)};

        mTabHost = (TabHost) this.findViewById(R.id.tabhost1);
        mTabHost.setup(this.getLocalActivityManager());

        for (int i = 0; i < tabHostItemTexts.length; i++) {
            View view = (View) LayoutInflater.from(this).inflate(R.layout.tabhost_tabview, null);
            TextView text1 = (TextView) view.findViewById(R.id.tv_tabhost);
            text1.setText(tabHostItemTexts[i]);

            mTabHost.addTab(this.buildTagSpec(tabHostItemTexts[i], view, intents[i]));
        }

        mTabHost.setCurrentTab(0);
    }

    private TabHost.TabSpec buildTagSpec(String tagName, View view, Intent intent) {
        return mTabHost.newTabSpec(tagName).setIndicator(view).setContent(intent);
    }
}
