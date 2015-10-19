package com.ida.tabdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.TabListener;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar.Tab;
import android.widget.Toast;

import com.ida.adapter.CustomPagerAdapter;

public class ActivitySwipeTap extends AppCompatActivity {
	
	ViewPager viewPager;
	PagerAdapter adapter;
	ActionBar actionBar;

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate( Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_swipe_tap);
		viewPager = (ViewPager)findViewById(R.id.pager);
		adapter = new CustomPagerAdapter(getSupportFragmentManager());
		
		viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int position) {
                    		actionBar = getSupportActionBar();
                    		actionBar.setSelectedNavigationItem(position); 
                    	}
                });
		viewPager.setAdapter(adapter);
        actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        goActionTab();    
	}
	
	@SuppressWarnings("deprecation")
	private void goActionTab(){
		ActionBar.TabListener tabListener = new TabListener() {
			@Override
			public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
				// TODO Auto-generated method stub
			}
			@Override
			public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
				// TODO Auto-generated method stub
				viewPager.setCurrentItem(tab.getPosition());
			}
			@Override
			public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
				// TODO Auto-generated method stub
				 Toast.makeText(getApplicationContext(),"Tab selected", Toast.LENGTH_SHORT).show();
			}
		};
		actionBar.addTab(actionBar.newTab().setText("Tab1").setTabListener(tabListener));
	    actionBar.addTab(actionBar.newTab().setText("Tab2").setTabListener(tabListener));
	    actionBar.addTab(actionBar.newTab().setText("Tab3").setTabListener(tabListener));
	}
}