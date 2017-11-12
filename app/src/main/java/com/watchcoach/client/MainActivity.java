package com.watchcoach.client;

import android.content.pm.ActivityInfo;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabBar;
    private ViewPager contentsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        tabBar = findViewById(R.id.TabBar);
        tabBar.addTab(tabBar.newTab().setText("Live"));
        tabBar.addTab(tabBar.newTab().setText("전술"));
        tabBar.addTab(tabBar.newTab().setText("통계"));

        contentsView = findViewById(R.id.contentsView);

        TabAdapter ta = new TabAdapter(getSupportFragmentManager(), tabBar.getTabCount());
        contentsView.setAdapter(ta);
        contentsView.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabBar));
        tabBar.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                contentsView.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
