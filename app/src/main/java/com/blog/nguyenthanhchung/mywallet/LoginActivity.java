package com.blog.nguyenthanhchung.mywallet;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private final int codeRequestRegister = 12345;
    private final int codeRequestForgotPassword = 123;

    private EditText loginEdtUsername, loginEdtPassword;
    private Button loginBtnLogin, loginBtnRegister, loginBtnForgotPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_login_action_bar);
        ActionBar.LayoutParams p = new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        p.gravity = Gravity.CENTER;

        addViews();
        addEvents();
    }

    private void addEvents() {
        loginBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(LoginActivity.this, RegisterActivity.class),
                        codeRequestRegister);
            }
        });

        loginBtnForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(LoginActivity.this, ForgotPasswordActivity.class),
                        codeRequestForgotPassword);
            }
        });
    }

    private void addViews() {
        loginEdtUsername = (EditText) findViewById(R.id.loginEdtUsername);
        loginEdtPassword = (EditText) findViewById(R.id.loginEdtUsername);
        loginBtnLogin = (Button) findViewById(R.id.loginBtnLogin);
        loginBtnRegister = (Button) findViewById(R.id.loginBtnRegister);
        loginBtnForgotPassword = (Button) findViewById(R.id.loginBtnForgotPassword);
    }
}
