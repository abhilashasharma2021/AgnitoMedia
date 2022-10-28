package com.agnitomedia.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.agnitomedia.R;
import com.agnitomedia.databinding.ActivityCommentBinding;
import com.agnitomedia.databinding.ActivityContactUsBinding;

public class CommentActivity extends AppCompatActivity {
ActivityCommentBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityCommentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}