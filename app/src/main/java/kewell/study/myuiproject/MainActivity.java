package kewell.study.myuiproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kewell.study.myuiproject.gridview.GridViewActivity;
import kewell.study.myuiproject.imageswitcher.ImageSwitcherActivity;
import kewell.study.myuiproject.listview.ListViewActivity;
import kewell.study.myuiproject.listview.ListViewActivity2;
import kewell.study.myuiproject.login.LoginActivity;
import kewell.study.myuiproject.seekbar.SeekbarActivity;
import kewell.study.myuiproject.spinner.SpinnerActivity;
import kewell.study.myuiproject.tabhost.TabHostActivity;
import kewell.study.myuiproject.weixin.WeiXinActivity;

public class MainActivity extends AppCompatActivity {
    Button mButtonSpinner;
    Button mButtonSeekBar;
    Button mButtonGridView;
    Button mButtonListView;
    Button mButtonListView2;
    Button mButtonTabHost;
    Button mButtonLogin;
    Button mButtonImageSwitcher;
    Button mButtonWeiXin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.initView();
        this.setButtonClickListene();
    }

    private void initView() {
        this.mButtonSpinner = (Button) this.findViewById(R.id.button_spinner);
        this.mButtonSeekBar = (Button) this.findViewById(R.id.button_seekbar);
        this.mButtonGridView = (Button) this.findViewById(R.id.button_gridview);
        this.mButtonListView = (Button) this.findViewById(R.id.button_listview);
        this.mButtonListView2 = (Button) this.findViewById(R.id.button_listview2);
        this.mButtonTabHost = (Button) this.findViewById(R.id.button_tabhost);
        this.mButtonLogin = (Button) this.findViewById(R.id.button_login);
        this.mButtonImageSwitcher = (Button) this.findViewById(R.id.button_imageswitcher);
        this.mButtonWeiXin = (Button) this.findViewById(R.id.button_weixin);
    }

    private void setButtonClickListene() {
        this.mButtonSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SpinnerActivity.class);
                startActivity(intent);
            }
        });

        this.mButtonSeekBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SeekbarActivity.class);
                startActivity(intent);
            }
        });

        this.mButtonGridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, GridViewActivity.class);
                startActivity(intent);
            }
        });

        this.mButtonListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });

        this.mButtonListView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ListViewActivity2.class);
                startActivity(intent);
            }
        });

        this.mButtonTabHost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, TabHostActivity.class);
                startActivity(intent);
            }
        });

        this.mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        this.mButtonImageSwitcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ImageSwitcherActivity.class);
                startActivity(intent);
            }
        });

        this.mButtonWeiXin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, WeiXinActivity.class);
                startActivity(intent);
            }
        });
    }
}
