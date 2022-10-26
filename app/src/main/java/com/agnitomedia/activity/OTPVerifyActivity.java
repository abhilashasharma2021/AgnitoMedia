package com.agnitomedia.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.agnitomedia.MainActivity;
import com.agnitomedia.R;
import com.agnitomedia.databinding.ActivityOtpverifyBinding;
import com.agnitomedia.databinding.ActivitySignUpBinding;

public class OTPVerifyActivity extends AppCompatActivity {
ActivityOtpverifyBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityOtpverifyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OTPVerifyActivity.this, MainActivity.class));
            }
        });
    }
}