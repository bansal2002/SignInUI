package com.example.signinui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment {

    EditText email,password;
    TextView forgetPassword;
    Button login;
    float v = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_fragment,container,false);

        email = root.findViewById(R.id.emailLogin);
        password = root.findViewById(R.id.mobileNumber);
        forgetPassword = root.findViewById(R.id.forgetPassword);
        login = root.findViewById(R.id.button);

        email.setTranslationX(800);
        password.setTranslationX(800);
        forgetPassword.setTranslationX(800);
        login.setTranslationX(800);

        email.setAlpha(v);
        password.setAlpha(v);
        forgetPassword.setAlpha(v);
        login.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        forgetPassword.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();

        return root;
    }

}
