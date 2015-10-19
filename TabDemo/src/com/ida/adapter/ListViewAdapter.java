package com.ida.adapter;

import java.util.ArrayList;
import com.ida.classes.Student;
import com.ida.tabdemo.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListViewAdapter extends ArrayAdapter<Student>{

	Context context;
	ArrayList<Student> objects;
	public ListViewAdapter(Context context, ArrayList<Student> objects) {
		super(context, R.layout.adapter,objects);
		// TODO Auto-generated constructor stub
		this.context = context;
		this.objects = objects;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view =(View)inflater.inflate(R.layout.adapter, parent,false);
		TextView tv1=(TextView)view.findViewById(R.id.textview_1);
		TextView tv2=(TextView)view.findViewById(R.id.textview_2);
		tv1.setText(""+objects.get(position).getName());
		tv2.setText(""+objects.get(position).getAddress());
		return view;
	}
}
