package com.example.fyp.testbook;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GK_Adapter extends RecyclerView.Adapter<GK_Adapter.ViewHolder> {

//All methods in this adapter are required for a bare minimum recyclerview adapter
private int listItemLayout;
private ArrayList<GK_ListItem> itemList;
// Constructor of the class
public GK_Adapter(int layoutId, ArrayList<GK_ListItem> itemList) {
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
        TextView gk_title = holder.GK_title;
        TextView gk_serial = holder.GK_serial;
       gk_title.setText(itemList.get(listPosition).getGk_title());
        gk_serial.setText(itemList.get(listPosition).getGK_serial());

        }

// Static inner class to initialize the views of rows
static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView GK_title;
    public TextView GK_serial;
    public ViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        GK_title =  itemView.findViewById(R.id.gk_text);
        GK_serial = itemView.findViewById(R.id.gk_serial_number);
    }
    @Override
    public void onClick(View view) {
       // Log.d("onclick", "onClick " + getLayoutPosition() + " " + VideoTitle.getText());
    }
}
}