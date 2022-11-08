package com.agnitomedia.activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;

import com.agnitomedia.R;
import com.agnitomedia.adapers.ReplyShowAdapter;
import com.agnitomedia.data.ReplyShowData;
import com.agnitomedia.databinding.ActivityCommentBinding;
import com.example.readmoretextview.ReadMoreTextView;

import java.util.ArrayList;

public class CommentActivity extends AppCompatActivity {
ActivityCommentBinding binding;
    ArrayList<ReplyShowData> replyShowDataList=new ArrayList<>() ;
    ReplyShowAdapter replyShowAdapter;
    RecyclerView.LayoutManager layoutManagerShowReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityCommentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ReadMoreTextView readMoreTextView = new ReadMoreTextView();
        binding.txDescription.setText(getResources().getString(R.string.dummy_new));
        readMoreTextView.setTextView(binding.txDescription);
        readMoreTextView.setMaximumLine(2);
        readMoreTextView.setCollapseText("See Less");
        readMoreTextView.setExpandText("See More");
        readMoreTextView.setColorCode("#2CA6E9");
        readMoreTextView.setReadMore();

        binding.ivCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        binding.ivSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.rlReplyShow.setVisibility(View.VISIBLE);
            }
        });
        layoutManagerShowReply = new LinearLayoutManager(CommentActivity.this, LinearLayoutManager.VERTICAL, false);
        binding.rvShowReply.setLayoutManager(new LinearLayoutManager(CommentActivity.this));
        all_ShowReply();
    }

    private void all_ShowReply() {
        ReplyShowData data=new ReplyShowData("Aditya Vaishnav","You’re Stunning!\\nHow are you always so perfect?","21","50","Today",R.drawable.profi);
        for (int i = 0; i < 3; i++) {
            replyShowDataList.add(data);
        }
        replyShowAdapter = new ReplyShowAdapter(replyShowDataList,CommentActivity.this);
        binding.rvShowReply.setAdapter(replyShowAdapter);

    }
}