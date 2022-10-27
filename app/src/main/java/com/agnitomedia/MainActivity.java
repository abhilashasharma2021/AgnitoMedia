package com.agnitomedia;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.agnitomedia.activity.WelcomeActivity;
import com.agnitomedia.fragment.HomeFragment;
import com.agnitomedia.fragment.AllNftFragment;
import com.agnitomedia.fragment.ProfileFragment;
import com.agnitomedia.fragment.VideoFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, NavigationView.OnNavigationItemSelectedListener {
BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       bottomNavigationView=findViewById(R.id.bottomNavigationView);
        //bottomNavigationView.setItemIconTintList(null);
        bottomNavigationView.getMenu().getItem(2).setCheckable(false);
        bottomNavigationView.setOnItemSelectedListener(this);


       // bottomNavigationView.getMenu().getItem(3).getIcon().setColorFilter(getResources().getColor(R.color.grey), PorterDuff.Mode.SRC_ATOP);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
               // bottomNavigationView.setItemTextColor(ColorStateList.valueOf(getResources().getColor(R.color.purple_700)));
                return true;
            case R.id.Video:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new VideoFragment()).commit();

                return true;
          case R.id.nft:

              getSupportFragmentManager().beginTransaction().replace(R.id.container, new AllNftFragment()).commit();

              return true;

            case R.id.Profile:

                getSupportFragmentManager().beginTransaction().replace(R.id.container, new ProfileFragment()).commit();

                return true;
        }
        return true;
    }


}