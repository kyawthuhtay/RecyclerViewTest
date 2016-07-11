package com.fuckingtest.kyawthuhtay;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by KyawThuHtay on 7/10/2016.
 */

public class Menu extends ListActivity{

    String [] classes = { "JsonAndRecyclerView","ListViewTest","MyrecyclerViewMain","Example3","Example4","Example5","Example6","Example7"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Menu.this,android.R.layout.simple_list_item_1,classes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String cheese = classes[position];
        try {
            if(cheese == "JsonAndRecyclerView"){
                Class ourClass = Class.forName("com.fuckingtest.kyawthuhtay.recyclerviewtest." + cheese);
                Intent ourIntent = new Intent(this, ourClass);
                startActivity(ourIntent);
            }else if(cheese == "MyrecyclerViewMain"){
                Class ourClass = Class.forName("com.fuckingtest.kyawthuhtay.MyrecyclerView." + cheese);
                Intent ourIntent = new Intent(this, ourClass);
                startActivity(ourIntent);
            }else if(cheese == "ListViewTest") {
                Class ourClass = Class.forName("com.fuckingtest.kyawthuhtay.listviewtest." + cheese);
                Intent ourIntent = new Intent(this, ourClass);
                startActivity(ourIntent);
            }
        }catch(ClassNotFoundException e) { e.printStackTrace();}

    }
}
