package com.carethy.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.carethy.R;

public class ViewPagerIndicatorFragment extends Fragment{
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {

	        View rootView = inflater.inflate(R.layout.fragment_viewpagerindicator, container, false);

	        return rootView;
	    }
}