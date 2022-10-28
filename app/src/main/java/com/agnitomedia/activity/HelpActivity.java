package com.agnitomedia.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.agnitomedia.MainActivity;
import com.agnitomedia.R;
import com.agnitomedia.databinding.ActivityEditProfileBinding;
import com.agnitomedia.databinding.ActivityHelpBinding;

public class HelpActivity extends AppCompatActivity {
ActivityHelpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityHelpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding. ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();
            }
        });
    }
}