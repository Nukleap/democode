package com.ida.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ida.fragment.FragmentTab_1;
import com.ida.fragment.FragmentTab_2;
import com.ida.fragment.FragmentTab_3;

public class CustomPagerAdapter extends FragmentStatePagerAdapter {
	
	public CustomPagerAdapter(FragmentManager fragmentManager) {
		super(fragmentManager);
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		switch(position){
		case 0:
			return new FragmentTab_1();
		case 1:
			return new FragmentTab_2();
		case 2:
			return new FragmentTab_3();
		 default:
             return null;
		}
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}
	
	@Override
	public CharSequence getPageTitle(int position) {
		// TODO Auto-generated method stub
		
		switch(position){
		case 0:
			return "CALLS";
		case 1:
			return "CHAT";
		case 2:
			return "CONTACTS";
		}
		//String s= "Tab"+(position+1);
		return null;
		
	}
}
