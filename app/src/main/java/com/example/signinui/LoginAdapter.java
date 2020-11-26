package com.example.signinui;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginAdapter extends FragmentPagerAdapter {

    private Context context;
    int totalTab;

    public LoginAdapter(@NonNull FragmentManager fm, int behavior, Context context, int totalTab) {
        super(fm, behavior);
        this.context = context;
        this.totalTab = totalTab;
    }

    @Override
    public int getCount() {
        return totalTab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new LoginTabFragment();
            case 1:
                return new SignUpTabFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        switch (position){
            case 0:
                title = "Login";
                return title;
            case 1:
                title = "Sign Up";
                return title;
            default:
                return title;
        }
    }

}
