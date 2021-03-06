package com.fuckingtest.kyawthuhtay.listviewtest;

/**
 * Created by KyawThuHtay on 7/10/2016.
 */

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.app.Activity;
import android.app.AlertDialog;

import com.fuckingtest.kyawthuhtay.recyclerviewtest.R;

public class ListViewTest extends Activity {

    AlertDialog alertDialogStores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewtest_activity_main);

        // a button to show the pop up with a list view
        View.OnClickListener handler = new View.OnClickListener(){
            public void onClick(View v) {
                switch (v.getId()) {

                    case R.id.buttonShowPopUp:
                        showPopUp();
                        break;
                }
            }
        };

        findViewById(R.id.buttonShowPopUp).setOnClickListener(handler);

        // our adapter instance
        ArrayAdapterItem adapter = new ArrayAdapterItem(ListViewTest.this, R.layout.listviewtest_row_item, getObjectItem());

        // create a new ListView, set the adapter and item click listener
        ListView listViewItems = (ListView)findViewById(R.id.list);
        listViewItems.setAdapter(adapter);
        listViewItems.setOnItemClickListener(new OnItemClickListenerListViewItem());
    }

    public void showPopUp(){

        // our adapter instance
        ArrayAdapterItem adapter = new ArrayAdapterItem(ListViewTest.this, R.layout.listviewtest_row_item, getObjectItem());

        // create a new ListView, set the adapter and item click listener
        ListView listViewItems = new ListView(this);
        listViewItems.setAdapter(adapter);
        listViewItems.setOnItemClickListener(new OnItemClickListenerListViewItem());

        // put the ListView in the pop up
        alertDialogStores = new AlertDialog.Builder(ListViewTest.this)
                .setView(listViewItems)
                .setTitle("Stores")
                .show();

    }

    public ObjectItem[] getObjectItem(){
        // add your items, this can be done programatically
        // your items can be from a database
        ObjectItem[] ObjectItemData = new ObjectItem[20];

        ObjectItemData[0] = new ObjectItem(91, "Mercury");
        ObjectItemData[1] = new ObjectItem(92, "Watson");
        ObjectItemData[2] = new ObjectItem(93, "Nissan");
        ObjectItemData[3] = new ObjectItem(94, "Puregold");
        ObjectItemData[4] = new ObjectItem(95, "SM");
        ObjectItemData[5] = new ObjectItem(96, "7 Eleven");
        ObjectItemData[6] = new ObjectItem(97, "Ministop");
        ObjectItemData[7] = new ObjectItem(98, "Fat Chicken");
        ObjectItemData[8] = new ObjectItem(99, "Master Siomai");
        ObjectItemData[9] = new ObjectItem(100, "Mang Inasal");
        ObjectItemData[10] = new ObjectItem(101, "Mercury 2");
        ObjectItemData[11] = new ObjectItem(102, "Watson 2");
        ObjectItemData[12] = new ObjectItem(103, "Nissan 2");
        ObjectItemData[13] = new ObjectItem(104, "Puregold 2");
        ObjectItemData[14] = new ObjectItem(105, "SM 2");
        ObjectItemData[15] = new ObjectItem(106, "7 Eleven 2");
        ObjectItemData[16] = new ObjectItem(107, "Ministop 2");
        ObjectItemData[17] = new ObjectItem(108, "Fat Chicken 2");
        ObjectItemData[18] = new ObjectItem(109, "Master Siomai 2");
        ObjectItemData[19] = new ObjectItem(110, "Mang Inasal 2");
        return ObjectItemData;
    }
}

