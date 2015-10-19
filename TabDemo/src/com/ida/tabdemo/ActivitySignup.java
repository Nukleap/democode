package com.ida.tabdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class ActivitySignup extends AppCompatActivity{
	EditText t1,t2,t3,t4,t5;
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
		attachUI();
	}
	private void attachUI(){
		t1=(EditText)findViewById(R.id.edittext_1);
		t2=(EditText)findViewById(R.id.edittext_2);
		t3=(EditText)findViewById(R.id.edittext_3);
		t4=(EditText)findViewById(R.id.edittext_4);
		t5=(EditText)findViewById(R.id.edittext_5);
	}
	private void saveRegistrationForm(){
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getItemId() == R.id.action_save){
			saveRegistrationForm();
		}
		return super.onOptionsItemSelected(item);
	}
}
