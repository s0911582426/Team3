package com.example.book;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import com.example.book.ui.talk.TalkFragment;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.talk, menu);
        return true;
    }

    public void onClickMessageBtn(View view) {
        switch (view.getId()) {
            case R.id.message_relativeLayout:
                Toast.makeText(this,"請稍後...",Toast.LENGTH_LONG).show();
                FragmentManager fm1 = this.getSupportFragmentManager();
                fm1.beginTransaction().replace(R.id.message_view,new TalkFragment()).commit();
                break;
            case R.id.message_image1:
                Toast.makeText(this,"請稍後...",Toast.LENGTH_LONG).show();
                break;
        }
    }
}