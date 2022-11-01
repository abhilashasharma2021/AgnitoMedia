package com.agnitomedia.adapers;

import android.content.Context;
import android.util.Log;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.agnitomedia.NftsTablayoutFragment;
import com.agnitomedia.fragment.ProfileStoryFragment;
import com.agnitomedia.fragment.ProfileVideoFragment;

public class TablayoutAdapter  extends FragmentPagerAdapter {


    int totalTabs;

    public TablayoutAdapter(FragmentManager fm, int totalTabs) {
        super(fm);
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                Log.e("TAG", "0");
                ProfileStoryFragment storyFragment =new ProfileStoryFragment();
                return  storyFragment;

            case 1:
                Log.e("TAG", "1");
                ProfileVideoFragment videoFragment =new ProfileVideoFragment();
                return  videoFragment;
            case 2:
                Log.e("TAG", "2");
            NftsTablayoutFragment tablayoutFragment=new NftsTablayoutFragment();
                return  tablayoutFragment;



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