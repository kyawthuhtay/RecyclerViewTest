package com.fuckingtest.kyawthuhtay.listviewtest;

/**
 * Created by KyawThuHtay on 7/10/2016.
 */

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.fuckingtest.kyawthuhtay.recyclerviewtest.R;

// here's our beautiful adapter
public class ArrayAdapterItem extends ArrayAdapter<ObjectItem> {

    Context mContext;
    int layoutResourceId;
    ObjectItem data[] = null;
    static int i;
    ViewHolderItem viewHolder;

    public ArrayAdapterItem(Context mContext, int layoutResourceId, ObjectItem[] data) {

        super(mContext, layoutResourceId, data);

        this.layoutResourceId = layoutResourceId;
        this.mContext = mContext;
        this.data = data;
    }

//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//        /*
//         * The convertView argument is essentially a "ScrapView" as described is Lucas post
//         * http://lucasr.org/2012/04/05/performance-tips-for-androids-listview/
//         * It will have a non-null value when ListView is asking you recycle the row layout.
//         * So, when convertView is not null, you should simply update its contents instead of inflating a new row layout.
//         */
//        if(convertView==null){
//            // inflate the layout
//            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
//            convertView = inflater.inflate(layoutResourceId, parent, false);
//        }
//
//        // object item based on the position
//        ObjectItem objectItem = data[position];
//
//        // get the TextView and then set the text (item name) and tag (item ID) values
//        TextView textViewItem = (TextView) convertView.findViewById(R.id.textViewItem);
//        textViewItem.setText(objectItem.itemName + " -- times -> " + i++);
//        textViewItem.setTag(objectItem.itemId);
//
//        return convertView;
//    }

    // our ViewHolder.
    // caches our TextView
    static class ViewHolderItem {
        TextView textViewItem;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            // inflate the layout
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(layoutResourceId, parent, false);

            // well set up the ViewHolder
            viewHolder = new ViewHolderItem();
            viewHolder.textViewItem = (TextView) convertView.findViewById(R.id.textViewItem);

            // store the holder with the view.
            convertView.setTag(viewHolder);
        }else{
            // we've just avoided calling findViewById() on resource everytime
            // just use the viewHolder
            viewHolder = (ViewHolderItem) convertView.getTag();

        }
        // object item based on the position
        ObjectItem objectItem = data[position];

        // assign values if the object is not null
        if(objectItem != null) {
            // get the TextView from the ViewHolder and then set the text (item name) and tag (item ID) values
            viewHolder.textViewItem.setText(objectItem.itemName + " -- times -> " + i++);
            viewHolder.textViewItem.setTag(objectItem.itemId);
        }

        return convertView;

    }
}
