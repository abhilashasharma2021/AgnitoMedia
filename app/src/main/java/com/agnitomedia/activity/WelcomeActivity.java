package com.agnitomedia.activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.agnitomedia.R;
import com.agnitomedia.databinding.ActivityWelcomeBinding;

public class WelcomeActivity extends AppCompatActivity {
ActivityWelcomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityWelcomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.rlCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WelcomeActivity.this, SignUpActivity.class));
            }
        });
        binding.btOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WelcomeActivity.this, OTPVerifyActivity.class));
            }
        });
        binding.rlPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               binding.rlMAil.setVisibility(View.GONE);
               binding.phoneVisible.setVisibility(View.VISIBLE);
                binding.txPhone.setTextColor(getResources().getColor(R.color.white));
                binding.txMail.setTextColor(getResources().getColor(R.color.black));
                binding.ivPhone.setColorFilter(ContextCompat.getColor(WelcomeActivity.this,R.color.white));
                binding.ivMail.setColorFilter(ContextCompat.getColor(WelcomeActivity.this,R.color.black));
                binding.rlEmail.setBackgroundColor(getResources().getColor(R.color.trans));
                binding.rlPhone.setBackgroundColor(getResources().getColor(R.color.purple_700));
            }
        });
        binding.rlEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.rlMAil.setVisibility(View.VISIBLE);
                binding.phoneVisible.setVisibility(View.GONE);
                binding.ivPhone.setColorFilter(ContextCompat.getColor(WelcomeActivity.this,R.color.black));
                binding.ivMail.setColorFilter(ContextCompat.getColor(WelcomeActivity.this,R.color.white));
                binding.txPhone.setTextColor(getResources().getColor(R.color.black));
                binding.txMail.setTextColor(getResources().getColor(R.color.white));
                binding.rlEmail.setBackgroundColor(getResources().getColor(R.color.purple_700));
                binding.rlPhone.setBackgroundColor(getResources().getColor(R.color.trans));

            }
        });

    }
}