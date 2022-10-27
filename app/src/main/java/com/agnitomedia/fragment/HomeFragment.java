package com.agnitomedia.fragment;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.agnitomedia.R;
import com.agnitomedia.activity.NotificationActivity;
import com.agnitomedia.adapers.HomeAllAdapter;
import com.agnitomedia.adapers.HomeNftFAdapter;
import com.agnitomedia.adapers.HomeStoryFAdapter;
import com.agnitomedia.adapers.HomeVideoAdapter;
import com.agnitomedia.data.HomeAlltData;
import com.agnitomedia.data.HomeNftData;
import com.agnitomedia.data.HomeStoryData;
import com.agnitomedia.data.HomeVideoData;
import com.agnitomedia.databinding.FragmentHomeBinding;
import com.example.readmoretextview.ReadMoreTextView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;
    View view;
    Context context;
    ArrayList<HomeAlltData> homeAlltDataList = new ArrayList<>();
    HomeAllAdapter adapterAllData;
    RecyclerView.LayoutManager layoutManagerAll;

    ArrayList<HomeNftData> homeNftDataList;
    HomeNftFAdapter nftAdapter;
    RecyclerView.LayoutManager layoutManagerNft;


    List<HomeVideoData> homeVideoDataList;
    HomeVideoAdapter videoAdapter;
    RecyclerView.LayoutManager layoutManagerVideo;

    List<HomeStoryData> homeStoryDataList = new ArrayList<>();
    HomeStoryFAdapter adapterStoryData;
    RecyclerView.LayoutManager layoutManagerStory;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(getLayoutInflater(), container, false);
        view = binding.getRoot();
        context = getActivity();

  /*      binding.rvAll.setLayoutManager(new LinearLayoutManager(getActivity()));
        layoutManagerAll = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
*/
       /* Uri video = Uri.parse("http://www.servername.com/projects/projectname/videos/1361439400.mp4");
        MediaController mediaController = new MediaController(getActivity());
        mediaController.setAnchorView(mVideoView);
       binding. videoView.setMediaController(mediaController);
        mVideoView.setVideoURI(uriVideo);
        mVideoView.requestFocus();

        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
        {
            @Override
            public void onPrepared(MediaPlayer mp)
            {
                mVideoView.start();
            }
        });*/
        ReadMoreTextView readMoreTextView = new ReadMoreTextView();
        binding.textView.setText(getResources().getString(R.string.dummy_text));
        readMoreTextView.setTextView(binding.textView);
        readMoreTextView.setMaximumLine(2);
        readMoreTextView.setCollapseText("See Less");
        readMoreTextView.setExpandText("See More");
        readMoreTextView.setColorCode("#2CA6E9");
        readMoreTextView.setReadMore();

        ReadMoreTextView readMoreTextView1 = new ReadMoreTextView();
        binding.textView1.setText(getResources().getString(R.string.dummy_text));
        readMoreTextView1.setTextView(binding.textView1);
        readMoreTextView1.setMaximumLine(2);
        readMoreTextView1.setCollapseText("See Less");
        readMoreTextView1.setExpandText("See More");
        readMoreTextView1.setColorCode("#2CA6E9");
        readMoreTextView1.setReadMore();


        ReadMoreTextView readMoreTextView2 = new ReadMoreTextView();
        binding.textView2.setText(getResources().getString(R.string.dummy_text));
        readMoreTextView2.setTextView(binding.textView2);
        readMoreTextView2.setMaximumLine(2);
        readMoreTextView2.setCollapseText("See Less");
        readMoreTextView2.setExpandText("... See More");
        readMoreTextView2.setColorCode("#2CA6E9");
        readMoreTextView2.setReadMore();


        binding.btNftBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btNftBlack.setVisibility(View.GONE);
                binding.AllDataVisible.setVisibility(View.GONE);
                binding.btNftBlue.setVisibility(View.VISIBLE);
                binding.relNFT.setVisibility(View.VISIBLE);
                binding.relStory.setVisibility(View.GONE);
                binding.btStoryBlue.setVisibility(View.GONE);
                binding.btStoryBlack.setVisibility(View.VISIBLE);
                binding.btVideoBlue.setVisibility(View.GONE);
                binding.btVideoBlack.setVisibility(View.VISIBLE);
                binding.relPost.setVisibility(View.GONE);
                binding.relVideo.setVisibility(View.GONE);
                binding.textView.setVisibility(View.GONE);
            }
        });

        binding.btStoryBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btStoryBlack.setVisibility(View.GONE);
                binding.AllDataVisible.setVisibility(View.GONE);
                binding.btStoryBlue.setVisibility(View.VISIBLE);
                binding.relNFT.setVisibility(View.GONE);
                binding.btNftBlack.setVisibility(View.VISIBLE);
                binding.btNftBlue.setVisibility(View.GONE);
                binding.relStory.setVisibility(View.VISIBLE);
                binding.relPost.setVisibility(View.GONE);
                binding.relVideo.setVisibility(View.GONE);
                binding.textView.setVisibility(View.GONE);
            }
        });


        binding.btVideoBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btVideoBlack.setVisibility(View.GONE);
                binding.btVideoBlue.setVisibility(View.VISIBLE);
                binding.AllDataVisible.setVisibility(View.GONE);
                binding.relNFT.setVisibility(View.GONE);
                binding.btNftBlack.setVisibility(View.VISIBLE);
                binding.btNftBlue.setVisibility(View.GONE);
                binding.btStoryBlack.setVisibility(View.VISIBLE);
                binding.btStoryBlue.setVisibility(View.GONE);
                binding.relStory.setVisibility(View.GONE);
                binding.relPost.setVisibility(View.GONE);
                binding.relVideo.setVisibility(View.VISIBLE);
                binding.textView.setVisibility(View.GONE);
            }
        });


        binding.ivNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(getActivity(), NotificationActivity.class));
            }
        });
        //  show_AllData();


        show_NftFilter();
        show_StoryFilter();
        show_VideoFilter();
        return view;
    }

    private void show_AllData() {


        HomeAlltData homeAlltData = new HomeAlltData("Satyam Mishra", "Developer", R.drawable.profi, R.drawable.test, "202K", "500", "800", "Pushpendra And", "");
        homeAlltDataList.add(homeAlltData);
        homeAlltData = new HomeAlltData("Satyam Mishra", "Developer", R.drawable.profi, R.drawable.test, "202K", "500", "800", "Pushpendra And", "");
        homeAlltDataList.add(homeAlltData);
        homeAlltData = new HomeAlltData("Sonal Sharma", "Developer", R.drawable.dymm, R.drawable.bgnew, "202K", "500", "800", "Pushpendra And", "");
        homeAlltDataList.add(homeAlltData);

        adapterAllData = new HomeAllAdapter(homeAlltDataList, getActivity());
        //   binding.rvAll.setAdapter(adapterAllData);
    }


    private void show_NftFilter() {
        homeNftDataList = new ArrayList<>();
        homeNftDataList.add(new HomeNftData("Satyam Mishra", "Developer", getResources().getDrawable(R.drawable.profi), getResources().getDrawable(R.drawable.profi), "202K", "500", "800", "Pushpendra And", ""));
        homeNftDataList.add(new HomeNftData("Govind Mishra", "Artist", getResources().getDrawable(R.drawable.profi), getResources().getDrawable(R.drawable.profi), "202K", "500", "800", "Pushpendra And", ""));
        homeNftDataList.add(new HomeNftData("Abhishek Misra", "Painter", getResources().getDrawable(R.drawable.profi), getResources().getDrawable(R.drawable.profi), "202K", "500", "800", "Pushpendra And", ""));
        homeNftDataList.add(new HomeNftData("Pavan Seni", "Student", getResources().getDrawable(R.drawable.profi), getResources().getDrawable(R.drawable.profi), "202K", "500", "800", "Pushpendra And", ""));
        homeNftDataList.add(new HomeNftData("Vikas Soni", "Singer", getResources().getDrawable(R.drawable.profi), getResources().getDrawable(R.drawable.profi), "202K", "500", "800", "Pushpendra And", ""));

        nftAdapter = new HomeNftFAdapter(homeNftDataList, getActivity());

        binding.rvHomeNft.setHasFixedSize(true);
        layoutManagerNft = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        binding.rvHomeNft.setLayoutManager(new LinearLayoutManager(getActivity()));

        binding.rvHomeNft.setAdapter(nftAdapter);

    }


    private void show_StoryFilter() {
        homeStoryDataList = new ArrayList<>();
        homeStoryDataList.add(new HomeStoryData("Sonal Soni", "Cricketer", getResources().getDrawable(R.drawable.dymm), getResources().getDrawable(R.drawable.bgnew), "202K", "500", "800", "Pushpendra And", "", "Umaid Bhawan Palace- A Must-See Royal Residence in Jodhpur", "And because of their excellent acting skills, we have seen a lot of Bollywood actors in Hollywood movies over etc."));
        homeStoryDataList.add(new HomeStoryData("Akriti Mishra", "Artist", getResources().getDrawable(R.drawable.dymm), getResources().getDrawable(R.drawable.bgnew), "202K", "500", "800", "Pushpendra And", "", "Umaid Bhawan Palace- A Must-See Royal Residence in Jodhpur", "And because of their excellent acting skills, we have seen a lot of Bollywood actors in Hollywood movies over etc."));
        homeStoryDataList.add(new HomeStoryData("Shobhna Misra", "Painter", getResources().getDrawable(R.drawable.dymm), getResources().getDrawable(R.drawable.bgnew), "202K", "500", "800", "Pushpendra And", "", "Umaid Bhawan Palace- A Must-See Royal Residence in Jodhpur", "And because of their excellent acting skills, we have seen a lot of Bollywood actors in Hollywood movies over etc."));
        homeStoryDataList.add(new HomeStoryData("Swati Seni", "Student", getResources().getDrawable(R.drawable.dymm), getResources().getDrawable(R.drawable.bgnew), "202K", "500", "800", "Pushpendra And", "", "Umaid Bhawan Palace- A Must-See Royal Residence in Jodhpur", "And because of their excellent acting skills, we have seen a lot of Bollywood actors in Hollywood movies over etc."));
        homeStoryDataList.add(new HomeStoryData("Priya Kholi", "Singer", getResources().getDrawable(R.drawable.dymm), getResources().getDrawable(R.drawable.bgnew), "202K", "500", "800", "Pushpendra And", "", "Umaid Bhawan Palace- A Must-See Royal Residence in Jodhpur", "And because of their excellent acting skills, we have seen a lot of Bollywood actors in Hollywood movies over etc."));

        adapterStoryData = new HomeStoryFAdapter(homeStoryDataList, getActivity());

        binding.rvStory.setHasFixedSize(true);
        layoutManagerStory = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        binding.rvStory.setLayoutManager(new LinearLayoutManager(getActivity()));

        binding.rvStory.setAdapter(adapterStoryData);

    }


    private void show_VideoFilter() {
        homeVideoDataList = new ArrayList<>();
        homeVideoDataList.add(new HomeVideoData("Vikas Soni", "Developer", getResources().getDrawable(R.drawable.profi), getResources().getDrawable(R.drawable.real), "202K", "500", "800", "Pushpendra And", ""));
        homeVideoDataList.add(new HomeVideoData("Govind Mishra", "Artist", getResources().getDrawable(R.drawable.profi), getResources().getDrawable(R.drawable.real), "202K", "500", "800", "Pushpendra And", ""));
        homeVideoDataList.add(new HomeVideoData("Abhishek Misra", "Painter", getResources().getDrawable(R.drawable.profi), getResources().getDrawable(R.drawable.real), "202K", "500", "800", "Pushpendra And", ""));
        homeVideoDataList.add(new HomeVideoData("Pavan Seni", "Student", getResources().getDrawable(R.drawable.profi), getResources().getDrawable(R.drawable.real), "202K", "500", "800", "Pushpendra And", ""));
        homeVideoDataList.add(new HomeVideoData("Vikas Soni", "Singer", getResources().getDrawable(R.drawable.profi), getResources().getDrawable(R.drawable.real), "202K", "500", "800", "Pushpendra And", ""));

        videoAdapter = new HomeVideoAdapter(homeVideoDataList, getActivity());

        binding.rvHomeVideo.setHasFixedSize(true);
        layoutManagerVideo = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        binding.rvHomeVideo.setLayoutManager(new LinearLayoutManager(getActivity()));

        binding.rvHomeVideo.setAdapter(videoAdapter);

    }

}