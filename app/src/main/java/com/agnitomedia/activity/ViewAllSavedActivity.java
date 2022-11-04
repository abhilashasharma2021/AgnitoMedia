package com.agnitomedia.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.agnitomedia.R;
import com.agnitomedia.adapers.AllNftAdapter;
import com.agnitomedia.adapers.SavedStoriesAdapter;
import com.agnitomedia.adapers.ViewAllVideoAdapter;
import com.agnitomedia.data.AllNftData;
import com.agnitomedia.data.SavedStoriesData;
import com.agnitomedia.data.SavedVideoData;
import com.agnitomedia.databinding.ActivitySearchViewAllBinding;
import com.agnitomedia.databinding.ActivityViewAllSavedBinding;
import com.agnitomedia.utils.AppConstant;
import com.agnitomedia.utils.SharedHelper;

import java.util.ArrayList;

public class ViewAllSavedActivity extends AppCompatActivity {
    ActivityViewAllSavedBinding binding;

    ArrayList<SavedStoriesData> storiesDataList = new ArrayList<>();
    SavedStoriesAdapter storiesAdapter;
    RecyclerView.LayoutManager layoutManagerStories;
    String stview_All_Status="";

    ArrayList<AllNftData> allnftDataList =new ArrayList<>();
    AllNftAdapter adapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<SavedVideoData> videosDataList = new ArrayList<>();
    ViewAllVideoAdapter videosAdapter;
    RecyclerView.LayoutManager layoutManagerVideos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewAllSavedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             finish();

            }
        });
        stview_All_Status = SharedHelper.getKey(getApplicationContext(), AppConstant.VIEW_ALL_STATUS);
        if (stview_All_Status.equals("SavedStories")) {
            binding.rvStories.setVisibility(View.VISIBLE);
            show_Stories();
            binding.txTittle.setText("Stories");
            layoutManagerStories = new LinearLayoutManager(ViewAllSavedActivity.this, LinearLayoutManager.VERTICAL, false);
            binding.rvStories.setLayoutManager(new LinearLayoutManager(ViewAllSavedActivity.this));
        }
        else if (stview_All_Status.equals("SavedNft")){
            binding.rvNft.setVisibility(View.VISIBLE);
            binding.txTittle.setText("NFTs");
            binding.rvNft.setLayoutManager(new LinearLayoutManager(ViewAllSavedActivity.this));
            layoutManager = new LinearLayoutManager(ViewAllSavedActivity.this, LinearLayoutManager.VERTICAL, false);
            show_Nft();
        }

        else if (stview_All_Status.equals("SavedVideo")){
            binding.rvVideo.setVisibility(View.VISIBLE);
            binding.txTittle.setText("Videos");
            layoutManagerVideos = new GridLayoutManager(ViewAllSavedActivity.this,2, LinearLayoutManager.VERTICAL, false);
            binding.rvVideo.setLayoutManager(layoutManagerVideos);
            show_Video();
        }
    }

    private void show_Stories() {
        SavedStoriesData storiesData = new SavedStoriesData("20 Unknown Facts About Turkey That Every First-Timer Must Know", "20 Unknown Facts About Turkey That Every First-Timer Must Know", getResources().getDrawable(R.drawable.dummynew));
        for (int i = 0; i < 8; i++) {
            storiesDataList.add(storiesData);
        }

        storiesAdapter = new SavedStoriesAdapter(storiesDataList, ViewAllSavedActivity.this);
        binding.rvStories.setHasFixedSize(true);
        binding.rvStories.setAdapter(storiesAdapter);

    }

    private  void show_Nft(){
        AllNftData data=new AllNftData("Globe Hassan","₹ 0.375L","#KH0121", R.drawable.test);
        for (int i = 0; i <4 ; i++) {
            allnftDataList.add(data);
        }
        adapter = new AllNftAdapter(allnftDataList,ViewAllSavedActivity.this);
        binding.rvNft.setAdapter(adapter);
    }
    private void show_Video() {
        SavedVideoData videoData=new SavedVideoData("Videos Title here, da0nce with me.","100K",getResources().getDrawable(R.drawable.dummy3));
        for (int i = 0; i <12 ; i++) {
            videosDataList.add(videoData);
        }

        videosAdapter = new ViewAllVideoAdapter(videosDataList,ViewAllSavedActivity.this);
        binding.rvVideo.setAdapter(videosAdapter);

    }
}