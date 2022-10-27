package com.agnitomedia.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.agnitomedia.R;
import com.agnitomedia.adapers.AllStoryCategoryAdapter;
import com.agnitomedia.data.AllStoryCategoryData;
import com.agnitomedia.databinding.ActivityAllStoryBinding;
import com.agnitomedia.databinding.ActivityStoryDetailsBinding;

import java.util.ArrayList;
import java.util.List;

public class StoryDetailsActivity extends AppCompatActivity {
ActivityStoryDetailsBinding binding;


    List<AllStoryCategoryData> categoryDataList ;
    AllStoryCategoryAdapter categoryAdapter;
    RecyclerView.LayoutManager layoutManagerCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityStoryDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding. ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
        all_CategoryData();
    }

    private void all_CategoryData() {
        categoryDataList = new ArrayList<>();
        categoryDataList.add(new AllStoryCategoryData("Travels"));

        categoryAdapter = new AllStoryCategoryAdapter(categoryDataList,this);
        binding.rvStoryCategory.setHasFixedSize(true);
        layoutManagerCategory = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        binding.rvStoryCategory.setLayoutManager(new LinearLayoutManager(this));

        binding.rvStoryCategory.setAdapter(categoryAdapter);

    }
}