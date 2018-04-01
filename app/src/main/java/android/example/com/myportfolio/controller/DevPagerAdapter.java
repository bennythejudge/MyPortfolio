package android.example.com.myportfolio.controller;

import android.example.com.myportfolio.views.AboutFragment;
import android.example.com.myportfolio.views.ContactFragment;
import android.example.com.myportfolio.views.SkillsFragment;
import android.example.com.myportfolio.views.WorkFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by neo on 01/04/2018.
 */

public class DevPagerAdapter extends FragmentPagerAdapter {

    public DevPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0: return new AboutFragment();
            case 1: return new ContactFragment();
            case 2: return new SkillsFragment();
            case 3: return new WorkFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        // hard coding number of fragments for the time being
        return 4;
    }
}
