package com.ida.tabdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Activity_Login extends AppCompatActivity{
	EditText t1,t2;
	Button button;
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		attachUI();
	}
	private void attachUI(){
		t1=(EditText)findViewById(R.id.edittext_1);
		t2=(EditText)findViewById(R.id.edittext_2);
		button=(Button)findViewById(R.id.button_1);
		button.setOnClickListener(clk);
	}
	private OnClickListener clk = new OnClickListener() {
	
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		}
	};
}
