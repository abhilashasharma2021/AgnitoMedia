package com.agnitomedia.activity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.agnitomedia.databinding.ActivityCommentBinding;

public class CommentActivity extends AppCompatActivity {
ActivityCommentBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityCommentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}