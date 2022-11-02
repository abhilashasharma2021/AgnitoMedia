package com.agnitomedia.activity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.agnitomedia.databinding.ActivitySecurityBinding;

public class SecurityActivity extends AppCompatActivity {
ActivitySecurityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySecurityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding. ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}