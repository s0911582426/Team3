package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onClickLoginBtn(View view) {
        switch (view.getId()) {
            case R.id.login_login:
                Toast.makeText(this,"登入中...",Toast.LENGTH_LONG).show();
                Intent intent = new Intent();
                intent.setClass(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.login_clear:
                EditText et1 = findViewById(R.id.login_textaccount);
                et1.setText("");
                EditText et2 = findViewById(R.id.login_textapassword);
                et2.setText(null);
                Toast.makeText(this,"已清除",Toast.LENGTH_LONG).show();
                break;
            case R.id.login_forget:
                Toast.makeText(this,"請稍後...",Toast.LENGTH_LONG).show();
                break;
            case R.id.login_register:
                Toast.makeText(this,"請稍後...",Toast.LENGTH_LONG).show();
                break;
        }
    }
}