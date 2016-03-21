package kewell.study.myuiproject.seekbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import kewell.study.myuiproject.R;

/**
 * @author 肖昌
 * @version 1.0
 *          SeekBar示例
 *          最小值是0，最大值是500，拖动Bar，数值变化，数值存储在一个TextView中。
 * @date 2016.3.15
 */
public class SeekbarActivity extends Activity {

    TextView mTextViewNum;
    SeekBar mSeekBarProgrss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);
        //初始化控件
        this.initUI();
        //注册SeekBar的选择事件
        this.seekBarListenerSelect();
    }

    /**
     * 初始化控件
     */
    private void initUI() {
        this.mTextViewNum = (TextView) this.findViewById(R.id.tv_num);
        this.mSeekBarProgrss = (SeekBar) this.findViewById(R.id.sb_progress);
    }

    /**
     * 注册拖动条的事件
     */
    private void seekBarListenerSelect() {
        this.mSeekBarProgrss.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                mTextViewNum.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                mTextViewNum.setText(String.valueOf(seekBar.getProgress()));
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mTextViewNum.setText(String.valueOf(seekBar.getProgress()));
            }
        });
    }
}
