package com.agnitomedia.fragment;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.agnitomedia.R;
import com.agnitomedia.adapers.ProfileStoriesAdapter;
import com.agnitomedia.data.ProfileStoriesData;
import com.agnitomedia.databinding.FragmentProfileStoryBinding;
import java.util.ArrayList;

public  class ProfileStoryFragment extends Fragment {
    FragmentProfileStoryBinding binding;
    View view;
    Context context;
    ArrayList<ProfileStoriesData> storiesDataList=new ArrayList<>() ;
    ProfileStoriesAdapter storiesAdapter;
    RecyclerView.LayoutManager layoutManagerStories;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProfileStoryBinding.inflate(getLayoutInflater(), container, false);
        view = binding.getRoot();
        context = getActivity();

        layoutManagerStories = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        binding.rvStory.setLayoutManager(layoutManagerStories);
        showStories();
        return view;
    }
    private void showStories(){
        ProfileStoriesData data=new ProfileStoriesData("Umaid Bhawan Palace- A Must-See Royal Residence in Jodhpur","Travels","And because of their excellent acting skills, we have seen a lot of Bollywood actors in Hollywood movies over etc.",R.drawable.bgnew);
        for (int i = 0; i < 12; i++) {
            storiesDataList.add(data);
        }
        storiesAdapter = new ProfileStoriesAdapter(storiesDataList, getActivity());
        binding.rvStory.setAdapter(storiesAdapter);

    }
}