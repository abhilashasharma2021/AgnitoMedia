package com.agnitomedia.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.agnitomedia.R;
import com.agnitomedia.adapers.NftItemAdapter;
import com.agnitomedia.data.NftItemData;
import com.agnitomedia.databinding.ActivityNftdetailsBinding;
import com.agnitomedia.databinding.ActivitySignUpBinding;
import com.example.readmoretextview.ReadMoreTextView;

import java.util.ArrayList;
import java.util.List;

public class NFTDetailsActivity extends AppCompatActivity {
ActivityNftdetailsBinding binding;

    List<NftItemData> nftItemDataList = new ArrayList<>();
    NftItemAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityNftdetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.rvNft.setLayoutManager(new LinearLayoutManager(NFTDetailsActivity.this));
        layoutManager = new LinearLayoutManager(NFTDetailsActivity.this, LinearLayoutManager.VERTICAL, false);
        binding. ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                //  startActivity(new Intent(NftItemActivity.this, MainActivity.class));
            }
        });
       binding.btBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              startActivity(new Intent(NFTDetailsActivity.this, CompleteCheckOutActivity.class));
            }
        });

        binding.btDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView.setVisibility(View.VISIBLE);
                ReadMoreTextView readMoreTextView = new ReadMoreTextView();
                binding.textView.setText(getResources().getString(R.string.dummyDes));
                readMoreTextView.setTextView(binding.textView);
                readMoreTextView.setMaximumLine(5);
                readMoreTextView.setCollapseText("See Less");
                readMoreTextView.setExpandText("See More");
                readMoreTextView.setColorCode("#2CA6E9");
                readMoreTextView.setReadMore();
                binding.btDescription.setBackgroundColor(getResources().getColor(R.color.trans));
            }
        });
        show_Nft();

    }
    private void show_Nft() {
        NftItemData data = new NftItemData("Cristiano Ronaldo\n" +
                "Virat Kohyli", "₹ 7.954L", "6.954L", R.drawable.dummy2,"#CR0722");
        for (int i = 0; i < 4; i++) {
            nftItemDataList.add(data);
        }
        adapter = new NftItemAdapter(nftItemDataList, NFTDetailsActivity.this);
        binding.rvNft.setAdapter(adapter);
    }
}