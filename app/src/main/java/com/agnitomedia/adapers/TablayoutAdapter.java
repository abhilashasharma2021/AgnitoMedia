package com.agnitomedia.adapers;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.agnitomedia.NftsTablayoutFragment;
import com.agnitomedia.fragment.ProfileStoryFragment;

public class TablayoutAdapter  extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;

    public TablayoutAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        context = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ProfileStoryFragment storyFragment =new ProfileStoryFragment();
                return  storyFragment;
            case 1:

            case 2:
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