package com.example.book;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.book.ui.detail.DetailFragment;
import com.example.book.ui.paid.PaidFragment;
import com.example.book.ui.talk.TalkFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.Scanner;

public class KnowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_know);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back);

        setMain();
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.btm_detail:  //我上一篇的menu裡面設的id
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new DetailFragment()).commit();  //切換fragment
                return true;
            case R.id.btm_talk:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new TalkFragment()).commit();
                return true;
            case R.id.btm_paid:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new PaidFragment()).commit();
                return true;
        }
        return false;
    }

    private void setMain() {  //這個副程式用來設置顯示剛進來的第一個主畫面

        this.getSupportFragmentManager().beginTransaction().add(R.id.frameLayout,new DetailFragment()).commit();
    }
}