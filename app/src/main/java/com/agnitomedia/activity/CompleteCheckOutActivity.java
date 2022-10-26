package com.agnitomedia.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.agnitomedia.R;
import com.agnitomedia.databinding.ActivityCompleteCheckOutBinding;
import com.agnitomedia.databinding.ActivityNftdetailsBinding;

public class CompleteCheckOutActivity extends AppCompatActivity {
ActivityCompleteCheckOutBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityCompleteCheckOutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    binding.btPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CompleteCheckOutActivity.this, MyWalletActivity.class));
            }
        });
        binding. ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }
}