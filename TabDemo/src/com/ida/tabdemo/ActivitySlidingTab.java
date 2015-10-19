package com.ida.tabdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.ida.adapter.CustomPagerAdapter;
import com.ida.classes.SlidingTabLayout;

public class ActivitySlidingTab extends MainActivityCommon {
	
	SlidingTabLayout mSlidingTabLayout;
	ViewPager mViewPager;
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slide_tab);
		setMaterialDesign();
		setMaterialTitle("WhatsApp");
		attachUI();
	}
	private void attachUI(){
		mViewPager = (ViewPager) findViewById(R.id.view_pager);
		mViewPager.setAdapter(new CustomPagerAdapter(getSupportFragmentManager()));
		mSlidingTabLayout = (SlidingTabLayout) findViewById(R.id.sliding_tabs);
		mSlidingTabLayout.setSelectedIndicatorColors(getResources().getColor(R.color.Pink));   
		mSlidingTabLayout.setDistributeEvenly(true);
		mSlidingTabLayout.setViewPager(mViewPager);
		//mSlidingTabLayout.setBackgroundColor(getResources().getColor(R.color.white));
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		//getMenuInflater().inflate(R.menu.add_new, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		/*int id = item.getItemId();
		if(id == R.id.action_add){
			next();
		}*/
		return super.onOptionsItemSelected(item);
	}
	private void next(){
		TextView tv= (TextView)findViewById(R.layout.tab_1);								
		//new FragmentTab_1();
		showMsg("hello.............");
	}
}
