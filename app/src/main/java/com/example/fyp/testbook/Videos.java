package com.example.fyp.testbook;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.Spanned;

import java.util.ArrayList;

public class Videos extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private Video_Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        bindViews();
    }
    private void bindViews() {

        ArrayList<video_list_item> itemList = new ArrayList<video_list_item>();

        Video_Adapter itemArrayAdapter = new Video_Adapter(R.layout.video_recycler_item, itemList);
        mRecyclerView = (RecyclerView) findViewById(R.id.item_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(itemArrayAdapter);

        itemList.add(new video_list_item("How to prepare for English Language Section",R.drawable.ic_launcher_background));

        itemList.add(new video_list_item("Watch Current Affair Series for 2018",R.drawable.ic_launcher_background));

        itemList.add(new video_list_item("Tips and Tricks for SET/SLET",R.drawable.ic_launcher_background));

    }
}
