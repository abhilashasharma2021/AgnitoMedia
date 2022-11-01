package com.agnitomedia.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.agnitomedia.MainActivity;
import com.agnitomedia.NftsTablayoutFragment;
import com.agnitomedia.R;
import com.agnitomedia.activity.ContactUsActivity;
import com.agnitomedia.activity.EditProfileActivity;
import com.agnitomedia.activity.HelpActivity;
import com.agnitomedia.activity.PersonalDetailsActivity;
import com.agnitomedia.activity.SavedActivity;
import com.agnitomedia.activity.SecurityActivity;
import com.agnitomedia.adapers.TablayoutAdapter;
import com.agnitomedia.databinding.FragmentProfileBinding;
import com.example.readmoretextview.ReadMoreTextView;
import com.google.android.material.tabs.TabLayout;


public class ProfileFragment extends Fragment {
    FragmentProfileBinding binding;
    View view;
    Context context;

    private int[] tabIcons = {
            R.drawable.story,
            R.drawable.play,
            R.drawable.nfft
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(getLayoutInflater(), container, false);
        view = binding.getRoot();
        context = getActivity();

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
                startActivity(new Intent(getActivity(), MainActivity.class));
            }
        });


       /* getActivity().getSupportFragmentManager().beginTransaction()
                .add(R.id.layout, new NftsTablayoutFragment()).commit();*/

        binding.ivCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.rlVisibleSetting.setVisibility(View.GONE);
            }
        });

        binding.ivSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.rlVisibleSetting.setVisibility(View.VISIBLE);
            }
        });

        binding.rlSaved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              startActivity(new Intent(getActivity(), SavedActivity.class));
            }
        });
        binding.rlPersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), PersonalDetailsActivity.class));
            }
        });

        binding.rlHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), HelpActivity.class));
            }
        });


        binding.rlSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(getActivity(), SecurityActivity.class));
            }
        });

        binding.rlContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(getActivity(), ContactUsActivity.class));
            }
        });

        binding.rlEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), EditProfileActivity.class));
            }
        });


        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Story"));
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Video"));
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Nfts"));
        binding.tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        binding. tabLayout.setupWithViewPager(binding.viewPager);
        final TablayoutAdapter adapter = new TablayoutAdapter(getActivity().getSupportFragmentManager(), binding.tabLayout.getTabCount());
        binding.viewPager.setAdapter(adapter);

        binding.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout));

        binding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        setupTabIcons();

        return view;

    }
    private void setupTabIcons() {
        binding.tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        binding. tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        binding.tabLayout.getTabAt(2).setIcon(tabIcons[2]);
    }

}