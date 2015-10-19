package com.ida.tabdemo;


import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.ida.adapter.CustomPagerAdapter;
import com.ida.fragment.FragmentTab_1;
import com.ida.fragment.FragmentTab_2;
import com.ida.fragment.FragmentTab_3;

public class MainActivity extends AppCompatActivity {
	PagerAdapter adapter;
	ViewPager viewPager;
	
    
	private FragmentTabHost mTabHost;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator("Tab 1", null),
                FragmentTab_1.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator("Tab 2", null),
                FragmentTab_2.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab3").setIndicator("Tab 3", null),
                FragmentTab_3.class, null);
    }	
}



























/*TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));
tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);*/

/*viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
    
	 @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
});*/
//http://www.truiton.com/2015/06/android-tabs-example-fragments-viewpager/
/*build.gradle file:

dependencies {
    compile 'com.android.support:design:22.2.0'
}*/
    
    //, tabLayout.getTabCount() final PagerAdapter adapter = new CustomPagerAdapter(getSupportFragmentManager(),);
/*TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

TabSpec tab1 = tabHost.newTabSpec("First Tab");
TabSpec tab2 = tabHost.newTabSpec("Second Tab");
TabSpec tab3 = tabHost.newTabSpec("Third tab");

tab1.setIndicator("Tab1");
tab1.setContent(new Intent(this,FragmentTab_1.class));

tab2.setIndicator("Tab2");
tab2.setContent(new Intent(this,FragmentTab_2.class));

tab3.setIndicator("Tab3");
tab3.setContent(new Intent(this,FragmentTab_3.class));

tabHost.addTab(tab1);
tabHost.addTab(tab2);
tabHost.addTab(tab3);*/