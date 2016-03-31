package kewell.study.myuiproject.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import kewell.study.myuiproject.R;

/**
 * Created by Administrator on 2016-03-24.
 */
public class LoginActivity extends Activity implements View.OnClickListener {

    Button mButtonLogin;
    Button mButtonReset;
    EditText mEditTextName;
    EditText mEditTextPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_login);

        this.initView();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                this.login();
                break;
            case R.id.btn_reset:
                this.reset();
                break;
            default:
                break;
        }
    }

    private void initView() {
        this.mButtonLogin = (Button) this.findViewById(R.id.btn_login);
        this.mButtonReset = (Button) this.findViewById(R.id.btn_reset);
        this.mEditTextName = (EditText) this.findViewById(R.id.txt_loginname);
        this.mEditTextPwd = (EditText) this.findViewById(R.id.txt_pwd);

        this.mButtonLogin.setOnClickListener(this);
        this.mButtonReset.setOnClickListener(this);
    }

    private void login() {
        String loginName = "";
        String pwd = "";
        String msg = "";
        loginName = this.mEditTextName.getText().toString().trim();
        pwd = this.mEditTextPwd.getText().toString().trim();
        if (loginName.length() == 0) {
            msg = "用户名不能为空";
            this.mEditTextName.setFocusable(true);
            this.mEditTextName.requestFocus();
        }
        if (pwd.length() != 6) {
            msg += (msg.length() == 0 ? "" : "\n") + "密码长度必须为6位";
            this.mEditTextPwd.setText("");
        }
        Toast.makeText(this, (msg.length() == 0 ? "登录成功" : msg), Toast.LENGTH_LONG).show();
    }

    private void reset() {
        this.mEditTextName.setText("");
        this.mEditTextPwd.setText("");
        this.mEditTextName.setFocusable(true);
        this.mEditTextName.requestFocus();
    }
}