package com.fuckingtest.kyawthuhtay.MyrecyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fuckingtest.kyawthuhtay.recyclerviewtest.R;

import java.util.List;

/**
 * Created by KyawThuHtay on 7/11/2016.
 */


public class MyrecyclerViewCustomAdapter extends RecyclerView.Adapter<MyrecyclerViewCustomAdapter.MyViewHolder>{
    private List<Ebook> ebookList;
    View view;
    LayoutInflater inflater;

    public MyrecyclerViewCustomAdapter(Context context, List<Ebook> ebookList) {
        this.ebookList = ebookList;
        inflater = LayoutInflater.from(context);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title,id,author;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.textViewTitle);
            id = (TextView) itemView.findViewById(R.id.textViewId);
            author = (TextView) itemView.findViewById(R.id.textViewAuthor);
        }
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = inflater.inflate(R.layout.myrecyclerview_singleitem,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Ebook ebook = ebookList.get(position);
        holder.title.setText(ebook.getTitle());
        holder.id.setText(Integer.toString(ebook.getId())); //Fucking Error
        holder.author.setText(ebook.getAuthor());
    }

    @Override
    public int getItemCount() {
        return ebookList.size();
    }
}
