package com.agnitomedia.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.agnitomedia.R;
import com.agnitomedia.adapers.HomeAllAdapter;
import com.agnitomedia.adapers.HomeNftFAdapter;
import com.agnitomedia.adapers.SavedNftsAdapter;
import com.agnitomedia.adapers.SavedStoriesAdapter;
import com.agnitomedia.adapers.SavedVideoAdapter;
import com.agnitomedia.data.HomeAlltData;
import com.agnitomedia.data.HomeNftData;
import com.agnitomedia.data.SavedNftsData;
import com.agnitomedia.data.SavedStoriesData;
import com.agnitomedia.data.SavedVideoData;
import com.agnitomedia.databinding.ActivityAllStoryBinding;
import com.agnitomedia.databinding.ActivitySavedBinding;

import java.util.ArrayList;

public class SavedActivity extends AppCompatActivity {
ActivitySavedBinding binding;

    ArrayList<SavedStoriesData> storiesDataList = new ArrayList<>();
    SavedStoriesAdapter storiesAdapter;
    RecyclerView.LayoutManager layoutManagerStories;

    ArrayList<SavedNftsData> nftsDataList = new ArrayList<>();
    SavedNftsAdapter nftsAdapter;
    RecyclerView.LayoutManager layoutManagerNfts;

    ArrayList<SavedVideoData> videosDataList = new ArrayList<>();
    SavedVideoAdapter videosAdapter;
    RecyclerView.LayoutManager layoutManagerVideos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySavedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding. ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
        layoutManagerNfts = new LinearLayoutManager(SavedActivity.this, LinearLayoutManager.HORIZONTAL, false);
        binding.rvNft.setLayoutManager(layoutManagerNfts);


        layoutManagerVideos = new LinearLayoutManager(SavedActivity.this, LinearLayoutManager.HORIZONTAL, false);
        binding.rvVideo.setLayoutManager(layoutManagerVideos);

        show_SavedNfts();
        show_SavedStories();
        show_SavedVideo();
    }




    private void show_SavedStories() {
        SavedStoriesData storiesData=new SavedStoriesData("20 Unknown Facts About Turkey That Every First-Timer Must Know","20 Unknown Facts About Turkey That Every First-Timer Must Know",getResources().getDrawable(R.drawable.dummynew));
        for (int i = 0; i <2 ; i++) {
            storiesDataList.add(storiesData);
        }

        storiesAdapter = new SavedStoriesAdapter(storiesDataList,SavedActivity.this);

        binding.rvStory.setHasFixedSize(true);
        layoutManagerStories = new LinearLayoutManager(SavedActivity.this, LinearLayoutManager.VERTICAL, false);
        binding.rvStory.setLayoutManager(new LinearLayoutManager(SavedActivity.this));

        binding.rvStory.setAdapter(storiesAdapter);

    }

    private void show_SavedNfts() {
        SavedNftsData nftsData=new SavedNftsData("virat Kholi",getResources().getDrawable(R.drawable.virat));
        for (int i = 0; i <5 ; i++) {
            nftsDataList.add(nftsData);
        }

        nftsAdapter = new SavedNftsAdapter(nftsDataList,SavedActivity.this);
        binding.rvNft.setAdapter(nftsAdapter);

    }

    private void show_SavedVideo() {
        SavedVideoData videoData=new SavedVideoData("Videos Title here, da0nce with me.","100K",getResources().getDrawable(R.drawable.dummy3));
        for (int i = 0; i <5 ; i++) {
            videosDataList.add(videoData);
        }

        videosAdapter = new SavedVideoAdapter(videosDataList,SavedActivity.this);



        binding.rvVideo.setAdapter(videosAdapter);

    }

}