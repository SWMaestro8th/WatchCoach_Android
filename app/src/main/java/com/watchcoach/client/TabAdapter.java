package com.watchcoach.client;

import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;

/**
 * Created by WatchCoach on 2017-11-13.
 */

public class TabAdapter extends FragmentStatePagerAdapter {
    private int tabCount;

    public TabAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        // Returning the current tabs
        switch (position) {
            case 0:
                MoniFragment moniFragment = new MoniFragment();
                return moniFragment;
            case 1:
                RecoFragment recoFragment = new RecoFragment();
                return recoFragment;
            case 2:
                StatFragment statFragment = new StatFragment();
                return statFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }

}
