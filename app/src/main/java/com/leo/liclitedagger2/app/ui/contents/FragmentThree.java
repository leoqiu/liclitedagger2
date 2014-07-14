package com.leo.liclitedagger2.app.ui.contents;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leo.liclitedagger2.app.R;

/**
 * Created by leo on 7/8/14.
 */
public class FragmentThree extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_sub3, container, false);

        return v;
    }
}
