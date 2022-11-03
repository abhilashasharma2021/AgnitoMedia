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
import com.agnitomedia.adapers.SavedVideoAdapter;
import com.agnitomedia.adapers.SearchProfileAdapter;
import com.agnitomedia.adapers.ViewAllProfileAdapter;
import com.agnitomedia.adapers.ViewAllVideoAdapter;
import com.agnitomedia.data.AllNftData;
import com.agnitomedia.data.SavedStoriesData;
import com.agnitomedia.data.SavedVideoData;
import com.agnitomedia.data.SearchProfileData;
import com.agnitomedia.data.ViewAllProfileData;
import com.agnitomedia.databinding.ActivitySearchViewAllBinding;
import com.agnitomedia.utils.AppConstant;
import com.agnitomedia.utils.SharedHelper;

import java.util.ArrayList;

public class SearchViewAllActivity extends AppCompatActivity {
    ActivitySearchViewAllBinding binding;
    String stview_All_Status = "";

    ArrayList<ViewAllProfileData> viewAllProfileDataList = new ArrayList<>();
    ViewAllProfileAdapter viewAllProfileAdapter;
    RecyclerView.LayoutManager layoutManagerProfile;

    ArrayList<SavedStoriesData> storiesDataList = new ArrayList<>();
    SavedStoriesAdapter storiesAdapter;
    RecyclerView.LayoutManager layoutManagerStories;

    ArrayList<AllNftData> allnftDataList =new ArrayList<>();
    AllNftAdapter adapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<SavedVideoData> videosDataList = new ArrayList<>();
    ViewAllVideoAdapter videosAdapter;
    RecyclerView.LayoutManager layoutManagerVideos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchViewAllBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        stview_All_Status = SharedHelper.getKey(getApplicationContext(), AppConstant.VIEW_ALL_STATUS);
        if (stview_All_Status.equals("Profile")) {
            binding.rlProfile.setVisibility(View.VISIBLE);
            binding.btProfileBlack.setVisibility(View.GONE);
            binding.btProfileBlue.setVisibility(View.VISIBLE);
        }
        else if (stview_All_Status.equals("Stories")){
            binding.rlStories.setVisibility(View.VISIBLE);
            binding.btStoryBlack.setVisibility(View.GONE);
            binding.btStoryBlue.setVisibility(View.VISIBLE);

        }

        else if (stview_All_Status.equals("Nft")){
            binding.rlNft.setVisibility(View.VISIBLE);
            binding.btNftBlack.setVisibility(View.GONE);
            binding.btNftBlue  .setVisibility(View.VISIBLE);

        }

        else if (stview_All_Status.equals("Videos")){
            binding.rlVideos.setVisibility(View.VISIBLE);
            binding.btVideoBlack.setVisibility(View.GONE);
            binding.btVideoBlue  .setVisibility(View.VISIBLE);

        }


        binding.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
        binding.rlAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SearchViewAllActivity.this, SearchActivity.class));

            }
        });

        layoutManagerProfile = new LinearLayoutManager(SearchViewAllActivity.this, LinearLayoutManager.VERTICAL, false);
        binding.rvProfile.setLayoutManager(new LinearLayoutManager(SearchViewAllActivity.this));
        show_Stories();

        layoutManagerStories = new LinearLayoutManager(SearchViewAllActivity.this, LinearLayoutManager.VERTICAL, false);
        binding.rvStories.setLayoutManager(new LinearLayoutManager(SearchViewAllActivity.this));
        show_Profile();

        binding.rvNft.setLayoutManager(new LinearLayoutManager(SearchViewAllActivity.this));
        layoutManager = new LinearLayoutManager(SearchViewAllActivity.this, LinearLayoutManager.VERTICAL, false);
        show_Nft();


        layoutManagerVideos = new GridLayoutManager(SearchViewAllActivity.this,2, LinearLayoutManager.VERTICAL, false);
        binding.rvVideos.setLayoutManager(layoutManagerVideos);
        show_Video();

        binding.btProfileBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btProfileBlue.setVisibility(View.VISIBLE);
                binding.btProfileBlack.setVisibility(View.GONE);
                binding.btNftBlack.setVisibility(View.VISIBLE);
                binding.btNftBlue.setVisibility(View.GONE);
                binding.rlNft.setVisibility(View.GONE);
                binding.rvProfile.setVisibility(View.VISIBLE);
                binding.btStoryBlue.setVisibility(View.GONE);
                binding.btStoryBlack.setVisibility(View.VISIBLE);
                binding.btVideoBlue.setVisibility(View.GONE);
                binding.btVideoBlack.setVisibility(View.VISIBLE);
                binding.rlProfile.setVisibility(View.VISIBLE);
                binding.rlVideos.setVisibility(View.GONE);
                binding.rlStories.setVisibility(View.GONE);
                binding.btAllBlack.setVisibility(View.VISIBLE);
            }
        });

        binding.btNftBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btNftBlack.setVisibility(View.GONE);
                binding.btNftBlue.setVisibility(View.VISIBLE);
                binding.rlNft.setVisibility(View.VISIBLE);
                binding.rvNft.setVisibility(View.VISIBLE);
                binding.btStoryBlue.setVisibility(View.GONE);
                binding.btStoryBlack.setVisibility(View.VISIBLE);
                binding.btVideoBlue.setVisibility(View.GONE);
                binding.rlVideos.setVisibility(View.GONE);
                binding.btVideoBlack.setVisibility(View.VISIBLE);
                binding.rlProfile.setVisibility(View.GONE);
                binding.rlStories.setVisibility(View.GONE);
                binding.btAllBlack.setVisibility(View.VISIBLE);
                binding.btProfileBlue.setVisibility(View.GONE);
                binding.btProfileBlack.setVisibility(View.VISIBLE);
            }
        });

        binding.btStoryBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btStoryBlack.setVisibility(View.GONE);
                binding.btStoryBlue.setVisibility(View.VISIBLE);
                binding.rlNft.setVisibility(View.GONE);
                binding.btNftBlack.setVisibility(View.VISIBLE);
                binding.btNftBlue.setVisibility(View.GONE);
                binding.rvStories.setVisibility(View.VISIBLE);
                binding.btVideoBlack.setVisibility(View.VISIBLE);
                binding.btVideoBlue.setVisibility(View.GONE);
                binding.rlVideos.setVisibility(View.GONE);
                binding.rlStories.setVisibility(View.VISIBLE);
                binding.rlProfile.setVisibility(View.GONE);
                binding.btProfileBlue.setVisibility(View.GONE);
                binding.btProfileBlack.setVisibility(View.VISIBLE);
                binding.btAllBlack.setVisibility(View.VISIBLE);
            }
        });


        binding.btVideoBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btVideoBlack.setVisibility(View.GONE);
                binding.btVideoBlue.setVisibility(View.VISIBLE);
                binding.btAllBlack.setVisibility(View.VISIBLE);
                binding.btNftBlack.setVisibility(View.VISIBLE);
                binding.rlNft.setVisibility(View.GONE);
                binding.btNftBlue.setVisibility(View.GONE);
                binding.btStoryBlack.setVisibility(View.VISIBLE);
                binding.btStoryBlue.setVisibility(View.GONE);
                binding.btProfileBlue.setVisibility(View.GONE);
                binding.btProfileBlack.setVisibility(View.VISIBLE);
                binding.rlVideos.setVisibility(View.VISIBLE);
                binding.rvVideos.setVisibility(View.VISIBLE);
                binding.rlVideos.setVisibility(View.VISIBLE);
            }
        });
    }

    private void show_Profile() {
        ViewAllProfileData profileData = new ViewAllProfileData("Samantha Vaishnav", "If you’re into non-fungible tokens (NFTs), you probably have pondered at some point", R.drawable.searchpro);
        for (int i = 0; i < 8; i++) {
            viewAllProfileDataList.add(profileData);
        }

        viewAllProfileAdapter = new ViewAllProfileAdapter(viewAllProfileDataList, SearchViewAllActivity.this);
        binding.rvProfile.setAdapter(viewAllProfileAdapter);

    }


    private void show_Stories() {
        SavedStoriesData storiesData = new SavedStoriesData("20 Unknown Facts About Turkey That Every First-Timer Must Know", "20 Unknown Facts About Turkey That Every First-Timer Must Know", getResources().getDrawable(R.drawable.dummynew));
        for (int i = 0; i < 8; i++) {
            storiesDataList.add(storiesData);
        }

        storiesAdapter = new SavedStoriesAdapter(storiesDataList, SearchViewAllActivity.this);

        binding.rvStories.setHasFixedSize(true);


        binding.rvStories.setAdapter(storiesAdapter);

    }

    private  void show_Nft(){
        AllNftData data=new AllNftData("Globe Hassan","₹ 0.375L","#KH0121", R.drawable.test);
        for (int i = 0; i <4 ; i++) {
            allnftDataList.add(data);
        }
        adapter = new AllNftAdapter(allnftDataList,SearchViewAllActivity.this);
        binding.rvNft.setAdapter(adapter);
    }

    private void show_Video() {
        SavedVideoData videoData=new SavedVideoData("Videos Title here, da0nce with me.","100K",getResources().getDrawable(R.drawable.dummy3));
        for (int i = 0; i <12 ; i++) {
            videosDataList.add(videoData);
        }

        videosAdapter = new ViewAllVideoAdapter(videosDataList,SearchViewAllActivity.this);
        binding.rvVideos.setAdapter(videosAdapter);

    }
}