package com.ida.tabdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;


public class MainActivityCommon extends AppCompatActivity {
	Toolbar toolbar;
	ShareActionProvider mShareActionProvider;
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	
	protected void setMaterialDesign(){
		toolbar=(Toolbar)findViewById(R.id.toolbar);
    	setSupportActionBar(toolbar);
    	//getSupportActionBar().setIcon(getResources().getDrawable(R.drawable.ic_launcher));	
	}
	
	protected void showMsg(String text){
		Toast.makeText(this, ""+text, Toast.LENGTH_SHORT).show();
	}
	
	protected void setMaterialTrans(){
		toolbar.setBackgroundColor(getResources().getColor(android.R.color.transparent));
		toolbar.bringToFront();
	}
	
	protected void setBackTrans(){
		toolbar.setBackgroundColor(getResources().getColor(R.color.Trans));
	}
	
	protected void setMaterialTitle(String title){
		getSupportActionBar().setTitle(title);
	}
	
	protected void showBack(){
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
	}
	
}
