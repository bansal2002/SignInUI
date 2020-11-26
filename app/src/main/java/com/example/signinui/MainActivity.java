package com.example.signinui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    FloatingActionButton google,facebook,twitter;
    float v = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);
        google = findViewById(R.id.fab_google);
        facebook = findViewById(R.id.fab_facebook);
        twitter = findViewById(R.id.fab_twitter);

        tabLayout.addTab(tabLayout.newTab().setText("Login"));
        tabLayout.addTab(tabLayout.newTab().setText("Sign Up"));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        LoginAdapter loginAdapter = new LoginAdapter(getSupportFragmentManager(),1,this,tabLayout.getTabCount());
        viewPager.setAdapter(loginAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setupWithViewPager(viewPager,true);

        google.setTranslationY(300);
        facebook.setTranslationY(300);
        twitter.setTranslationY(300);
        tabLayout.setTranslationX(800);

        google.setAlpha(v);
        facebook.setAlpha(v);
        twitter.setAlpha(v);
        tabLayout.setAlpha(v);

        google.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        facebook.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        twitter.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        tabLayout.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(600).start();



    }
}