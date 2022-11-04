package com.agnitomedia.activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.agnitomedia.R;
import com.agnitomedia.adapers.SavedNftsAdapter;
import com.agnitomedia.adapers.SavedStoriesAdapter;
import com.agnitomedia.adapers.SavedVideoAdapter;
import com.agnitomedia.adapers.SearchProfileAdapter;
import com.agnitomedia.data.SavedNftsData;
import com.agnitomedia.data.SavedStoriesData;
import com.agnitomedia.data.SavedVideoData;
import com.agnitomedia.data.SearchProfileData;
import com.agnitomedia.databinding.ActivityAllStoryBinding;
import com.agnitomedia.databinding.ActivitySearchBinding;
import com.agnitomedia.databinding.ActivitySecurityBinding;
import com.agnitomedia.utils.AppConstant;
import com.agnitomedia.utils.SharedHelper;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    ActivitySearchBinding binding;
    ArrayList<SavedStoriesData> storiesDataList = new ArrayList<>();
    SavedStoriesAdapter storiesAdapter;
    RecyclerView.LayoutManager layoutManagerStories;

    ArrayList<SavedNftsData> nftsDataList = new ArrayList<>();
    SavedNftsAdapter nftsAdapter;
    RecyclerView.LayoutManager layoutManagerNfts;

    ArrayList<SavedVideoData> videosDataList = new ArrayList<>();
    SavedVideoAdapter videosAdapter;
    RecyclerView.LayoutManager layoutManagerVideos;

    ArrayList<SearchProfileData> searchProfileDataList = new ArrayList<>();
    SearchProfileAdapter searchProfileAdapter;
    RecyclerView.LayoutManager layoutManagerProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySearchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding. ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });

        binding. viewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedHelper.putKey(getApplicationContext(), AppConstant.VIEW_ALL_STATUS,"Profile");
            startActivity(new Intent(SearchActivity.this,SearchViewAllActivity.class));

            }
        });
        binding. viewStories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedHelper.putKey(getApplicationContext(), AppConstant.VIEW_ALL_STATUS,"Stories");
                startActivity(new Intent(SearchActivity.this,SearchViewAllActivity.class));

            }
        });

        binding. viewNft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedHelper.putKey(getApplicationContext(), AppConstant.VIEW_ALL_STATUS,"Nft");
                startActivity(new Intent(SearchActivity.this,SearchViewAllActivity.class));

            }
        });

        binding. viewVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedHelper.putKey(getApplicationContext(), AppConstant.VIEW_ALL_STATUS,"Videos");
               startActivity(new Intent(SearchActivity.this,SearchViewAllActivity.class));

            }
        });




        layoutManagerStories = new LinearLayoutManager(SearchActivity.this, LinearLayoutManager.VERTICAL, false);
        binding.rvStory.setLayoutManager(new LinearLayoutManager(SearchActivity.this));

        layoutManagerNfts = new LinearLayoutManager(SearchActivity.this, LinearLayoutManager.HORIZONTAL, false);
        binding.rvNft.setLayoutManager(layoutManagerNfts);


        layoutManagerVideos = new LinearLayoutManager(SearchActivity.this, LinearLayoutManager.HORIZONTAL, false);
        binding.rvVideo.setLayoutManager(layoutManagerVideos);

        layoutManagerProfile = new LinearLayoutManager(SearchActivity.this, LinearLayoutManager.HORIZONTAL, false);
        binding.rvProfile.setLayoutManager(layoutManagerProfile);

        show_SavedNfts();
        show_SavedStories();
        show_SavedVideo();
        show_Profile();
    }
    private void show_SavedStories() {
        SavedStoriesData storiesData=new SavedStoriesData("20 Unknown Facts About Turkey That Every First-Timer Must Know","20 Unknown Facts About Turkey That Every First-Timer Must Know",getResources().getDrawable(R.drawable.dummynew));
        for (int i = 0; i <2 ; i++) {
            storiesDataList.add(storiesData);
        }

        storiesAdapter = new SavedStoriesAdapter(storiesDataList,SearchActivity.this);

        binding.rvStory.setHasFixedSize(true);
        binding.rvStory.setAdapter(storiesAdapter);

    }

    private void show_SavedNfts() {
        SavedNftsData nftsData=new SavedNftsData("virat Kholi",getResources().getDrawable(R.drawable.virat));
        for (int i = 0; i <3 ; i++) {
            nftsDataList.add(nftsData);
        }

        nftsAdapter = new SavedNftsAdapter(nftsDataList,SearchActivity.this);
        binding.rvNft.setAdapter(nftsAdapter);

    }

    private void show_SavedVideo() {
        SavedVideoData videoData=new SavedVideoData("Videos Title here, da0nce with me.","100K",getResources().getDrawable(R.drawable.dummy3));
        for (int i = 0; i <3 ; i++) {
            videosDataList.add(videoData);
        }

        videosAdapter = new SavedVideoAdapter(videosDataList,SearchActivity.this);
        binding.rvVideo.setAdapter(videosAdapter);

    }

    private void show_Profile() {
        SearchProfileData profileData=new SearchProfileData("Samantha Vaishnav",R.drawable.profi);
        for (int i = 0; i <5 ; i++) {
            searchProfileDataList.add(profileData);
        }

        searchProfileAdapter = new SearchProfileAdapter(searchProfileDataList,SearchActivity.this);
        binding.rvProfile.setAdapter(searchProfileAdapter);

    }


}