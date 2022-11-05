package com.agnitomedia.activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.agnitomedia.R;
import com.agnitomedia.adapers.AllStoryAdapter;
import com.agnitomedia.adapers.AllStoryListCategoryAdapter;
import com.agnitomedia.data.AllStoryCategoryData;
import com.agnitomedia.data.AllStoryData;
import com.agnitomedia.databinding.ActivityAllStoryBinding;
import java.util.ArrayList;
import java.util.List;

public class AllStoryActivity extends AppCompatActivity {

    ActivityAllStoryBinding binding;
    List<AllStoryData> allStoryDataList ;
    AllStoryAdapter allStoryAdapter;
    RecyclerView.LayoutManager layoutManagerAllStory;
    ArrayList<AllStoryCategoryData> categoryDataList=new ArrayList<>() ;
    AllStoryListCategoryAdapter categoryAdapter;
    RecyclerView.LayoutManager layoutManagerCategory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAllStoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.ivNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             startActivity(new Intent(AllStoryActivity.this, NotificationActivity.class));
            }
        });

        binding.ivSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AllStoryActivity.this, SearchActivity.class));
            }
        });
        layoutManagerCategory = new LinearLayoutManager(AllStoryActivity.this, LinearLayoutManager.HORIZONTAL, false);
        binding.rvStoryCategory.setLayoutManager(layoutManagerCategory);
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
        AllStoryCategoryData data=new AllStoryCategoryData("Travels");
        for (int i = 0; i < 5; i++) {
            categoryDataList.add(data);
        }
        categoryAdapter = new AllStoryListCategoryAdapter(categoryDataList,AllStoryActivity.this);
        binding.rvStoryCategory.setAdapter(categoryAdapter);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(AllStoryActivity.this, StoryDetailsActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);


    }
}
