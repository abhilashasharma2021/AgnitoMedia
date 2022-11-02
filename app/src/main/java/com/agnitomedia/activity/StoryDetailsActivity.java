package com.agnitomedia.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.agnitomedia.MainActivity;
import com.agnitomedia.R;
import com.agnitomedia.adapers.AllStoryCategoryAdapter;
import com.agnitomedia.adapers.SavedNftsAdapter;
import com.agnitomedia.adapers.SliderAdapter;
import com.agnitomedia.data.AllStoryCategoryData;
import com.agnitomedia.data.SavedNftsData;
import com.agnitomedia.data.SliderItemData;
import com.agnitomedia.databinding.ActivityAllStoryBinding;
import com.agnitomedia.databinding.ActivityStoryDetailsBinding;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class StoryDetailsActivity extends AppCompatActivity {
    ActivityStoryDetailsBinding binding;
    ArrayList<AllStoryCategoryData> categoryDataList =new ArrayList<>();
    AllStoryCategoryAdapter categoryAdapter;
    RecyclerView.LayoutManager layoutManagerCategory;
    SliderAdapter sliderAdapter;
    List<SliderItemData> bannerList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityStoryDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.ivNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StoryDetailsActivity.this, NotificationActivity.class));
            }
        });
        binding.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
        binding.imageSlider.setIndicatorAnimation(IndicatorAnimations.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        binding.imageSlider.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        binding.imageSlider.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        binding.imageSlider.setIndicatorSelectedColor(Color.WHITE);
        binding.imageSlider.setIndicatorUnselectedColor(getResources().getColor(R.color.purple_200));
        binding.imageSlider.setScrollTimeInSec(3); //set scroll delay in seconds :
        binding.imageSlider.startAutoCycle();

        sliderAdapter = new SliderAdapter(bannerList, StoryDetailsActivity.this);
        binding.imageSlider.setSliderAdapter(sliderAdapter);

        layoutManagerCategory = new LinearLayoutManager(StoryDetailsActivity.this, LinearLayoutManager.HORIZONTAL, false);
        binding.rvStoryCategory.setLayoutManager(layoutManagerCategory);

        all_CategoryData();
    }

    private void all_CategoryData() {
        AllStoryCategoryData data=new AllStoryCategoryData("Travels");
        for (int i = 0; i < 5; i++) {
            categoryDataList.add(data);
        }
        categoryAdapter = new AllStoryCategoryAdapter(categoryDataList,StoryDetailsActivity.this);
        binding.rvStoryCategory.setAdapter(categoryAdapter);

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(StoryDetailsActivity.this,MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();

    }
}