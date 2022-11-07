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



        layoutManager = new LinearLayoutManager(NFTDetailsActivity.this, LinearLayoutManager.HORIZONTAL, false);
        binding.rvNft.setLayoutManager(layoutManager);
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
        ReadMoreTextView readMoreTextView = new ReadMoreTextView();
        binding.textView.setText(getResources().getString(R.string.dummyDes));
        readMoreTextView.setTextView(binding.textView);
        readMoreTextView.setMaximumLine(5);
        readMoreTextView.setCollapseText("See Less");
        readMoreTextView.setExpandText("See More");
        readMoreTextView.setColorCode("#2CA6E9");
        readMoreTextView.setReadMore();
        binding.btDesClick.setVisibility(View.VISIBLE);
        binding.textView.setVisibility(View.VISIBLE);
        binding.btDesClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btDesClick.setVisibility(View.GONE);
                binding.textView.setVisibility(View.GONE);
                binding.btDescription.setVisibility(View.VISIBLE);
                binding.btAboutClick.setVisibility(View.GONE);
                binding.btAbout.setVisibility(View.VISIBLE);
            }
        });

        binding.btDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btDesClick.setVisibility(View.VISIBLE);
                binding.textView.setVisibility(View.VISIBLE);
                binding.btDescription.setVisibility(View.GONE);
                binding.btPropertyClick.setVisibility(View.GONE);
                binding.btProperty.setVisibility(View.VISIBLE);
                binding.btAboutClick.setVisibility(View.GONE);
                binding.btAbout.setVisibility(View.VISIBLE);
                binding.btDetailsClick.setVisibility(View.GONE);
                binding.btDetails.setVisibility(View.VISIBLE);
            }
        });

        binding.btProperty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btDesClick.setVisibility(View.GONE);
                binding.btPropertyClick.setVisibility(View.VISIBLE);
                binding.textView.setVisibility(View.GONE);
                binding.btDescription.setVisibility(View.VISIBLE);
                binding.btAboutClick.setVisibility(View.GONE);
                binding.btAbout.setVisibility(View.VISIBLE);
                binding.btDetails.setVisibility(View.VISIBLE);
                binding.btDetailsClick.setVisibility(View.GONE);
            }
        });
        binding.btPropertyClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btPropertyClick.setVisibility(View.GONE);
                binding.btProperty.setVisibility(View.VISIBLE);
                binding.textView.setVisibility(View.GONE);
                binding.btDescription.setVisibility(View.VISIBLE);
                binding.btAboutClick.setVisibility(View.GONE);
                binding.btAbout.setVisibility(View.VISIBLE);
                binding.btDetails.setVisibility(View.VISIBLE);
                binding.btDetailsClick.setVisibility(View.GONE);

            }
        });



        binding.btAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btAbout.setVisibility(View.GONE);
                binding.btAboutClick.setVisibility(View.VISIBLE);
                binding.btPropertyClick.setVisibility(View.GONE);
                binding.textView.setVisibility(View.GONE);
                binding.btProperty.setVisibility(View.VISIBLE);
                binding.btDetailsClick.setVisibility(View.GONE);
                binding.btDetails.setVisibility(View.VISIBLE);

            }
        });
        binding.btAboutClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btAboutClick.setVisibility(View.GONE);
                binding.btAbout.setVisibility(View.VISIBLE);
                binding.textView.setVisibility(View.GONE);
                binding.btDescription.setVisibility(View.VISIBLE);

            }
        });

        binding.btDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btDetails.setVisibility(View.GONE);
                binding.btDetailsClick.setVisibility(View.VISIBLE);
                binding.btPropertyClick.setVisibility(View.GONE);
                binding.textView.setVisibility(View.GONE);
                binding.btProperty.setVisibility(View.VISIBLE);
                binding.btDesClick.setVisibility(View.GONE);
                binding.btDescription.setVisibility(View.VISIBLE);
                binding.btAboutClick.setVisibility(View.GONE);
                binding.btAbout.setVisibility(View.VISIBLE);
            }
        });
        binding.btDetailsClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btDetailsClick.setVisibility(View.GONE);
                binding.btDetails.setVisibility(View.VISIBLE);
                binding.textView.setVisibility(View.GONE);
                binding.btDescription.setVisibility(View.VISIBLE);
                binding.btDesClick.setVisibility(View.GONE);
                binding.btAboutClick.setVisibility(View.GONE);
                binding.btProperty.setVisibility(View.VISIBLE);
                binding.btAbout.setVisibility(View.VISIBLE);

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