package com.magic.passwordinput;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.magic.pwdinputbox.PasswordInputBox;

public class MainActivity extends Activity implements PasswordInputBox.OnPwdInputListener, View.OnClickListener {

    private static final String TAG = "MainActivity";
    private PasswordInputBox pwdinputbox;
    private Button clearbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        pwdinputbox = (PasswordInputBox) findViewById(R.id.pwdinputbox);
        clearbutton = (Button) findViewById(R.id.clearbutton);
        pwdinputbox.setOnPwdInputListener(this);
        clearbutton.setOnClickListener(this);
    }


    @Override
    public void pwdChange(String pwd, PasswordInputBox.PwdInput flag) {
        Log.i(TAG, "pwdChange: " + pwd + "      flag：" + flag);
    }

    @Override
    public void pwdComplete(String pwd) {
        Log.i(TAG, "pwdComplete: " + pwd);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.clearbutton:
                pwdinputbox.clearPwd();
                break;
        }
    }
}
