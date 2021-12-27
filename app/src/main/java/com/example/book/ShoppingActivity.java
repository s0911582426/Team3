package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.talk, menu);
        return true;
    }

    public void onClickShoppingBtn(View view) {
        switch (view.getId()) {
            case R.id.shopping_paid:
                Toast.makeText(this,"請稍後...",Toast.LENGTH_LONG).show();
                break;
            case R.id.shopping_delete:
                Toast.makeText(this,"已刪除",Toast.LENGTH_LONG).show();
                break;
        }
    }
}