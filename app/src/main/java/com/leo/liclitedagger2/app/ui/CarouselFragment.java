package com.leo.liclitedagger2.app.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leo.liclitedagger2.app.R;
import com.viewpagerindicator.TitlePageIndicator;

import butterknife.InjectView;
import butterknife.ButterKnife;

/**
 * Fragment which houses the View pager.
 */
public class CarouselFragment extends Fragment {


    /**
     * http://viewpagerindicator.com/
     */
    @InjectView(R.id.tpi_header)
    protected TitlePageIndicator indicator;

    /**
     * The {@link ViewPager} that will host the se ction contents.
     */
    @InjectView(R.id.vp_pages)
    protected ViewPager pager;

    /**
     * SectionsPagerAdapter, for ViewPager to display different fragment
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter sectionsPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_carousel, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ButterKnife.inject(this, getView());

        sectionsPagerAdapter = new SectionsPagerAdapter(getChildFragmentManager(), getResources());
        pager.setAdapter(sectionsPagerAdapter);
        indicator.setViewPager(pager);
        pager.setCurrentItem(0);

    }
}
