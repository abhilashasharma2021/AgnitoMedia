package com.agnitomedia.adapers;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.agnitomedia.databinding.FragmentStoryBinding;
import com.agnitomedia.fragment.ProfileFragment;
import com.agnitomedia.fragment.StoryFragment;
import com.agnitomedia.fragment.VideoFragment;

public class TablayoutAdapter  extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public TablayoutAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                StoryFragment storyFragment =new StoryFragment();
                return  storyFragment;
            case 1:

            case 2:
                VideoFragment videoFragment = new VideoFragment();
                return videoFragment;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}