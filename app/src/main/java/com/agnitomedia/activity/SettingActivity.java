package com.agnitomedia.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

import com.agnitomedia.R;
import com.agnitomedia.databinding.ActivityMyWalletBinding;
import com.agnitomedia.databinding.ActivitySettingBinding;

public class SettingActivity extends AppCompatActivity {
 public static DrawerLayout drawerlayout;
 ActivitySettingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_setting);
        //drawerlayout=findViewById(R.id.drawerlayout);
        binding= ActivitySettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}