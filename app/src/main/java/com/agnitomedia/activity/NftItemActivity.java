package com.agnitomedia.activity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.agnitomedia.R;
import com.agnitomedia.adapers.NftItemAdapter;
import com.agnitomedia.data.NftItemData;
import com.agnitomedia.databinding.ActivityNftItemBinding;
import com.example.readmoretextview.ReadMoreTextView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.List;

public class NftItemActivity extends AppCompatActivity {

    List<NftItemData> nftItemDataList = new ArrayList<>();
    NftItemAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ActivityNftItemBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNftItemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rvNft.setLayoutManager(new LinearLayoutManager(NftItemActivity.this));
        layoutManager = new LinearLayoutManager(NftItemActivity.this, LinearLayoutManager.VERTICAL, false);

        ReadMoreTextView readMoreTextView = new ReadMoreTextView();
        binding.textView.setText(getResources().getString(R.string.dummy_text));
        readMoreTextView.setTextView(binding.textView);
        readMoreTextView.setMaximumLine(2);
        readMoreTextView.setCollapseText("See Less");
        readMoreTextView.setExpandText("... See More");
        readMoreTextView.setColorCode("#2CA6E9");
        readMoreTextView.setReadMore();

        binding. ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                //  startActivity(new Intent(NftItemActivity.this, MainActivity.class));
            }
        });


        binding.appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {

                if (Math.abs(verticalOffset) - appBarLayout.getTotalScrollRange() == 0) {

                    //  Collapsed
                    Log.e("fgkfhgfg", "Collapsed");
                    binding.toolbarCollapsing.setVisibility(View.VISIBLE);
                    binding.tx8.setVisibility(View.GONE);
                } else {
                    //Expanded
                    Log.e("fgkfhgfg", "Expanded");
                    binding.toolbarCollapsing.setVisibility(View.GONE);
                }
            }
        });

        show_Nft();
    }


    private void show_Nft() {
        NftItemData data = new NftItemData("Virat Kholi Stardust \\nDreamer By", "₹ 7.954L", "6.954L", R.drawable.virat,"#CR0722");
        for (int i = 0; i < 4; i++) {
            nftItemDataList.add(data);
        }
        adapter = new NftItemAdapter(nftItemDataList, NftItemActivity.this);
        binding.rvNft.setAdapter(adapter);
    }
}