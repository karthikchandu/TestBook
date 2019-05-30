package com.example.fyp.testbook;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class Video_Adapter extends RecyclerView.Adapter<Video_Adapter.ViewHolder> {

    //All methods in this adapter are required for a bare minimum recyclerview adapter
    private int listItemLayout;
    private ArrayList<video_list_item> itemList;
    // Constructor of the class
    public Video_Adapter(int layoutId, ArrayList<video_list_item> itemList) {
        listItemLayout = layoutId;
        this.itemList = itemList;
    }

    // get the size of the list
    @Override
    public int getItemCount() {
        return itemList == null ? 0 : itemList.size();
    }


    // specify the row layout file and click for each row
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(listItemLayout, parent, false);
        ViewHolder myViewHolder = new ViewHolder(view);
        return myViewHolder;
    }

    // load data in each row element
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int listPosition) {
        TextView Video_title = holder.VideoTitle;
        ImageView video_poster = holder.VideoPoster;
        Video_title.setText(itemList.get(listPosition).getVideoName());
        video_poster.setImageResource(itemList.get(listPosition).getposter());

    }

    // Static inner class to initialize the views of rows
    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView VideoTitle;
        public ImageView VideoPoster;
        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            VideoTitle =  itemView.findViewById(R.id.video_name_recycler_id);
            VideoPoster = itemView.findViewById(R.id.video_image_recycler_id);
        }
        @Override
        public void onClick(View view) {
            Log.d("onclick", "onClick " + getLayoutPosition() + " " + VideoTitle.getText());
        }
    }
}