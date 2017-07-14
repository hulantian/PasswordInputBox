package com.magic.passwordinput;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.magic.pwdinputbox.MagicKeyBoard;
import com.magic.pwdinputbox.PasswordInputBox;

import static com.magic.passwordinput.R.id.pwdinputbox;

public class MainActivity extends Activity implements PasswordInputBox.OnPwdInputListener, View.OnClickListener {

    private static final String TAG = "MainActivity";
    private PasswordInputBox pwdInputBox;
    private Button clearbutton;
    private MagicKeyBoard magicKeyBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        pwdInputBox = (PasswordInputBox) findViewById(pwdinputbox);
        clearbutton = (Button) findViewById(R.id.clearbutton);
        magicKeyBoard = (MagicKeyBoard) findViewById(R.id.magickeyboard);
        pwdInputBox.setOnPwdInputListener(this);
        clearbutton.setOnClickListener(this);
        pwdInputBox.register(magicKeyBoard);
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
                pwdInputBox.clearPwd();
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        pwdInputBox.unregister();
    }
}
