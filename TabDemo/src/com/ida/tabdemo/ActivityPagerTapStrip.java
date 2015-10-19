package com.ida.tabdemo;

import com.ida.adapter.CustomPagerAdapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class ActivityPagerTapStrip extends AppCompatActivity {

	ViewPager viewPager;
	PagerAdapter adapter;
	
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pager_tabstrip);
		viewPager = (ViewPager) findViewById(R.id.pager);
        adapter = new CustomPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
	}
}
