package com.agnitomedia.fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.agnitomedia.MainActivity;
import com.agnitomedia.R;
import com.agnitomedia.adapers.VideoAdapter;
import com.agnitomedia.data.VideoData;
import com.agnitomedia.databinding.FragmentVideoBinding;
import java.util.ArrayList;
import java.util.List;


public class VideoFragment extends Fragment {
    FragmentVideoBinding binding;
    View view;
    List<VideoData> videoDataList =new ArrayList<>();
    VideoAdapter adapter;
    RecyclerView rvVideo;
    RecyclerView.LayoutManager layoutManager;
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentVideoBinding.inflate(getLayoutInflater(), container, false);
        view = binding.getRoot();
        context = getActivity();


       /* ReadMoreTextView readMoreTextView = new ReadMoreTextView();
       binding. textView.setText(getResources().getString(R.string.dummy_text));
        readMoreTextView.setTextView(  binding.textView);
        readMoreTextView.setMaximumLine(2);
        readMoreTextView.setCollapseText("See Less");
        readMoreTextView.setExpandText("... See More");
        readMoreTextView.setColorCode("#FFFFFF");
        readMoreTextView.setReadMore();*/

        binding. ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), MainActivity.class));
            }
        });

        binding.rvVideo.setLayoutManager(new LinearLayoutManager(getActivity()));
        layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);

        show_Video();
        return  view;

    }

    private  void show_Video(){
        VideoData data=new VideoData("Satyam Mishra","100K","10.5K", "400","120","","Tanishq Singh aka Paradox | Hustle 2.0",R.drawable.real,R.drawable.dummy);
        for (int i = 0; i <4 ; i++) {
            videoDataList.add(data);
        }
        adapter = new VideoAdapter(videoDataList,getActivity());
       binding. rvVideo.setAdapter(adapter);
    }
}