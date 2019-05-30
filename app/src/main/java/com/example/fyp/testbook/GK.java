package com.example.fyp.testbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class GK extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private GK_Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gk);
    bindViews();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    private void bindViews() {

        ArrayList<GK_ListItem> itemList = new ArrayList<GK_ListItem>();

        GK_Adapter itemArrayAdapter = new GK_Adapter(R.layout.gk_listitem, itemList);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_gk);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(itemArrayAdapter);

        itemList.add(new GK_ListItem("Airlines by Country","1"));

        itemList.add(new GK_ListItem("Founders of Organizations","2"));

        itemList.add(new GK_ListItem("Nobel Prizes","3"));

        itemList.add(new GK_ListItem("Real Names of Superheroes","4"));

        itemList.add(new GK_ListItem("Famous Horses","5"));

        itemList.add(new GK_ListItem("Name that Profession","6"));

        itemList.add(new GK_ListItem("Palaces and Castles","7"));


    }
}


