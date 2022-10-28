package com.agnitomedia.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.agnitomedia.databinding.ActivityContactUsBinding;
import com.agnitomedia.databinding.ActivitySecurityBinding;

public class ContactUsActivity extends AppCompatActivity {
ActivityContactUsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityContactUsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding. ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}