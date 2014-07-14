package com.leo.liclitedagger2.app.ui;

/**
 * Created by leo on 7/8/14.
 */

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.leo.liclitedagger2.app.R;
import com.leo.liclitedagger2.app.ui.contents.FragmentOne;
import com.leo.liclitedagger2.app.ui.contents.FragmentThree;
import com.leo.liclitedagger2.app.ui.contents.FragmentTwo;

import java.util.Locale;

/**
 * A {@link android.support.v4.app.FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private Resources resources;

    public SectionsPagerAdapter(final FragmentManager fm, final Resources resources) {
        super(fm);
        this.resources = resources;
    }

    @Override
    public Fragment getItem(final int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

        final Fragment result;

        switch (position) {
            case 0:
                result = new FragmentOne();
                break;
            case 1:
                result = new FragmentTwo();
                break;
            case 2:
                result = new FragmentThree();
                break;
            default:
                result = null;
                break;
        }
        if (result != null) {
            result.setArguments(new Bundle()); //TODO do we need this?
        }
        return result;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return resources.getString(R.string.title_section1).toUpperCase(l);
            case 1:
                return resources.getString(R.string.title_section2).toUpperCase(l);
            case 2:
                return resources.getString(R.string.title_section3).toUpperCase(l);
        }
        return null;
    }






}
