package com.agnitomedia.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.agnitomedia.R;
import com.agnitomedia.adapers.AllStoryAdapter;
import com.agnitomedia.adapers.AllStoryCategoryAdapter;
import com.agnitomedia.adapers.HomeNftFAdapter;
import com.agnitomedia.adapers.HomeVideoAdapter;
import com.agnitomedia.data.AllStoryCategoryData;
import com.agnitomedia.data.AllStoryData;
import com.agnitomedia.data.HomeNftData;
import com.agnitomedia.data.HomeVideoData;
import com.agnitomedia.databinding.ActivityAllStoryBinding;

import java.util.ArrayList;
import java.util.List;

public class AllStoryActivity extends AppCompatActivity {
    ActivityAllStoryBinding binding;
    List<AllStoryData> allStoryDataList ;
    AllStoryAdapter allStoryAdapter;
    RecyclerView.LayoutManager layoutManagerAllStory;

    List<AllStoryCategoryData> categoryDataList ;
    AllStoryCategoryAdapter categoryAdapter;
    RecyclerView.LayoutManager layoutManagerCategory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAllStoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        all_StoryData();
        all_CategoryData();
    }

    private void all_StoryData() {
        allStoryDataList = new ArrayList<>();
        allStoryDataList.add(new AllStoryData("Umaid Bhawan Palace- A Must-See Royal Residence in Jodhpur", "Umaid Bhawan Palace Hotel in Jodhpur is a place where royalty and Rajasthan’s history exist at their best. The moment you step here, an unusual sense of royalty embraces you.\n", getResources().getDrawable(R.drawable.bgnew),"October 21, 2022","By Harsh Dubey"));
        allStoryDataList.add(new AllStoryData("Umaid Bhawan Palace- A Must-See Royal Residence in Jodhpur", "Umaid Bhawan Palace Hotel in Jodhpur is a place where royalty and Rajasthan’s history exist at their best. The moment you step here, an unusual sense of royalty embraces you.\n", getResources().getDrawable(R.drawable.bgnew),"October 21, 2022","By Harsh Dubey"));
        allStoryDataList.add(new AllStoryData("Umaid Bhawan Palace- A Must-See Royal Residence in Jodhpur", "Umaid Bhawan Palace Hotel in Jodhpur is a place where royalty and Rajasthan’s history exist at their best. The moment you step here, an unusual sense of royalty embraces you.\n", getResources().getDrawable(R.drawable.bgnew),"October 21, 2022","By Harsh Dubey"));
        allStoryDataList.add(new AllStoryData("Umaid Bhawan Palace- A Must-See Royal Residence in Jodhpur", "Umaid Bhawan Palace Hotel in Jodhpur is a place where royalty and Rajasthan’s history exist at their best. The moment you step here, an unusual sense of royalty embraces you.\n", getResources().getDrawable(R.drawable.bgnew),"October 21, 2022","By Harsh Dubey"));
        allStoryDataList.add(new AllStoryData("Umaid Bhawan Palace- A Must-See Royal Residence in Jodhpur", "Umaid Bhawan Palace Hotel in Jodhpur is a place where royalty and Rajasthan’s history exist at their best. The moment you step here, an unusual sense of royalty embraces you.\n", getResources().getDrawable(R.drawable.bgnew),"October 21, 2022","By Harsh Dubey"));

        allStoryAdapter = new AllStoryAdapter(allStoryDataList,this);
        binding.rvAllStory.setHasFixedSize(true);
        layoutManagerAllStory = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        binding.rvAllStory.setLayoutManager(new LinearLayoutManager(this));

        binding.rvAllStory.setAdapter(allStoryAdapter);

    }


    private void all_CategoryData() {
        categoryDataList = new ArrayList<>();
        categoryDataList.add(new AllStoryCategoryData("Latest News"));

        categoryAdapter = new AllStoryCategoryAdapter(categoryDataList,this);
        binding.rvStoryCategory.setHasFixedSize(true);
        layoutManagerCategory = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        binding.rvStoryCategory.setLayoutManager(new LinearLayoutManager(this));

        binding.rvStoryCategory.setAdapter(categoryAdapter);

    }
}