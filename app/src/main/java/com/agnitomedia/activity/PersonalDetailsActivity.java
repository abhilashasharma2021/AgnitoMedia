package com.agnitomedia.activity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.agnitomedia.databinding.ActivityPersonalDetailsBinding;


public class PersonalDetailsActivity extends AppCompatActivity {
ActivityPersonalDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityPersonalDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding. ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }
}