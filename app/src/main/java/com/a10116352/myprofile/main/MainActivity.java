package com.a10116352.myprofile.main;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.a10116352.myprofile.R;
import com.a10116352.myprofile.contact.ContactFragment;
import com.a10116352.myprofile.list_friends.ListFriendsFragment;
import com.a10116352.myprofile.profile.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;


public class MainActivity extends AppCompatActivity {
    private int menuProfile = 0;
    private int menuContact = 1;
    private int menuListFriends = 2;

    BottomNavigationView bottomNavigationView;
    private ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPager = findViewById(R.id.vp_main);

        bottomNavigationView = findViewById(R.id.bnv_main);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.itemProfile:
                        mPager.setCurrentItem(menuProfile);
                        break;
                    case R.id.itemContact:
                        mPager.setCurrentItem(menuContact);
                        break;
                    case R.id.itemListFriends:
                        mPager.setCurrentItem(menuListFriends);
                }
                return false;
            }
        });

        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            MenuItem prevMenuItem;
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null){
                    prevMenuItem.setChecked(false);
                } else {
                    bottomNavigationView.getMenu().getItem(0).setChecked(false);
                }
                MenuItem bottomIconActive = bottomNavigationView.getMenu().getItem(position);
                bottomIconActive.setChecked(true);
                prevMenuItem = bottomIconActive;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        setupViewPager(mPager);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (mPager.getCurrentItem() == 0){
            super.onBackPressed();
        } else {
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }

    private void setupViewPager(ViewPager viewPager){
        MainAdapter pagerAdapter = new MainAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new ProfileFragment());
        pagerAdapter.addFragment(new ContactFragment());
        pagerAdapter.addFragment(new ListFriendsFragment());
        viewPager.setAdapter(pagerAdapter);
    }
}
