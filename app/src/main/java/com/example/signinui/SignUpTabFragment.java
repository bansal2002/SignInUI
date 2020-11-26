package com.example.signinui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SignUpTabFragment extends Fragment {

    EditText email,password,mobileNumber,confirmPassword;
    Button signUpButton;
    float v = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.sign_fragment,container,false);

        email = root.findViewById(R.id.emailSignUp);
        password = root.findViewById(R.id.password);
        mobileNumber = root.findViewById(R.id.mobileNumber);
        confirmPassword = root.findViewById(R.id.confirmPassword);
        signUpButton = root.findViewById(R.id.loginButton);
//
//        email.setTranslationX(800);
//        password.setTranslationX(800);
//        mobileNumber.setTranslationX(800);
//        confirmPassword.setTranslationX(800);
//        signUpButton.setTranslationX(800);
//
//        email.setAlpha(v);
//        password.setAlpha(v);
//        mobileNumber.setAlpha(v);
//        confirmPassword.setAlpha(v);
//        signUpButton.setAlpha(v);
//
//        email.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(600).start();
//        password.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(600).start();
//        mobileNumber.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(600).start();
//        confirmPassword.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(600).start();
//        signUpButton.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(600).start();

        return root;
    }
}
