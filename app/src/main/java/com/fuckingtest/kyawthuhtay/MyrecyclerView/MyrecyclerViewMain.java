package com.fuckingtest.kyawthuhtay.MyrecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.fuckingtest.kyawthuhtay.recyclerviewtest.DividerItemDecoration;
import com.fuckingtest.kyawthuhtay.recyclerviewtest.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KyawThuHtay on 7/11/2016.
 */

public class MyrecyclerViewMain extends Activity{
    RecyclerView recyclerview;
    MyrecyclerViewCustomAdapter adapter;
    List<Ebook> ebookList = new ArrayList<Ebook>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myrecyclerview_main);
        recyclerview = (RecyclerView) findViewById(R.id.Myrecycler_view);
        adapter = new MyrecyclerViewCustomAdapter(this,ebookList);

        //recyclerview.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerview.setLayoutManager(mLayoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());
        recyclerview.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerview.setAdapter(adapter);
        prepareEbookData();
    }
    public void prepareEbookData(){
        Ebook book;
        for(int i=1;i<=30;i++){
            book = new Ebook(i,"Title " + i , "Author " + i);
            ebookList.add(book);
        }

        adapter.notifyDataSetChanged();
    }
}
