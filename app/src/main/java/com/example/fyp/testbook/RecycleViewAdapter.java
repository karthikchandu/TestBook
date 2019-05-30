package com.example.fyp.testbook;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    Context context;
    List<Blogs> BlogsList;

    public RecycleViewAdapter(Context context, List<Blogs> BlogsList) {
        this.context = context;
        this.BlogsList = BlogsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.item_blogs, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.blog_title.setText(BlogsList.get(position).getName());
        holder.View_count.setText(BlogsList.get(position).getPhn());
        holder.Blog_image.setImageResource(BlogsList.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return BlogsList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView blog_title,View_count;
        ImageView Blog_image,blog_bookmark,blog_like;


        public MyViewHolder(View itemView) {
            super(itemView);

            blog_title = (TextView) itemView.findViewById(R.id.blog_blogtitle_id);
            View_count = (TextView) itemView.findViewById(R.id.blog_count_id);
            Blog_image = (ImageView) itemView.findViewById(R.id.blog_image_id);
            blog_bookmark= (ImageView) itemView.findViewById(R.id.blog_bookedmark_id);
            blog_like= (ImageView) itemView.findViewById(R.id.blog_like_id);

        }
    }
}
