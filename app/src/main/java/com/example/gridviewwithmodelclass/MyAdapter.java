package com.example.gridviewwithmodelclass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    Context context;
    ArrayList<Animal> myList;

    public MyAdapter(Context conetxt, ArrayList<Animal> myList)
    {
        this.context=conetxt;
        this.myList=myList;

    }

    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent)
    {
       view= LayoutInflater.from(context).inflate(R.layout.gridview_item,null);

        TextView txtanimalName=view.findViewById(R.id.txtanimalName);
        ImageView imganimal=view.findViewById(R.id.imganimal);

        txtanimalName.setText(myList.get(position).getAnimalName());
        imganimal.setImageResource(myList.get(position).getAnimalImage());

        return view;
    }
}
