package com.ida.tabdemo;
import java.util.ArrayList;

import com.ida.adapter.ListViewAdapter;
import com.ida.classes.Student;
import com.ida.tabdemo.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;


public class ListViewDemo extends AppCompatActivity {
	ListView listview;
	ArrayList<Student> list;
	ListViewAdapter adapter;
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_view);
		attachUI();
	}
	private void attachUI(){
		listview = (ListView)findViewById(R.id.listview_1);
		adapter = new ListViewAdapter(this, list);
		listview.setAdapter(adapter);
		showList();
	}
	private void showList(){
		/*for(Student s : ){
			list.add(s);
		}*/	
	}
}
