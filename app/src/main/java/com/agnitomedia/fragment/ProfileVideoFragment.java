package com.agnitomedia.fragment;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.agnitomedia.R;
import com.agnitomedia.adapers.ProfileVideoAdapter;
import com.agnitomedia.data.ProfileVideoData;
import com.agnitomedia.databinding.FragmentProfileVideoBinding;
import java.util.ArrayList;


public class ProfileVideoFragment extends Fragment {

    FragmentProfileVideoBinding binding;
    View view;
    Context context;
    ArrayList<ProfileVideoData> videoDataList=new ArrayList<>() ;
    ProfileVideoAdapter videoAdapter;
    RecyclerView.LayoutManager layoutManagerVideo;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProfileVideoBinding.inflate(getLayoutInflater(), container, false);
        view = binding.getRoot();
        context = getActivity();
        layoutManagerVideo = new GridLayoutManager(getActivity(),2, LinearLayoutManager.VERTICAL, false);
        binding.rvVideo.setLayoutManager(layoutManagerVideo);
        showVideo();
        return view;

    }


    private void showVideo(){
        ProfileVideoData data=new ProfileVideoData(R.drawable.dy2);
        for (int i = 0; i < 12; i++) {
            videoDataList.add(data);
        }
        videoAdapter = new ProfileVideoAdapter(videoDataList, getActivity());
        binding.rvVideo.setAdapter(videoAdapter);

    }
}