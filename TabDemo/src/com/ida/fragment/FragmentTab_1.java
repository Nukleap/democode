package com.ida.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ida.tabdemo.R;

public class FragmentTab_1 extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v =inflater.inflate(R.layout.tab_1, container, false);
		((TextView)v.findViewById(R.id.textview)).setText("Hello...");
		return v;
	}
	public static void show(){
		
	}
}
