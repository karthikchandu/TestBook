package com.example.fyp.testbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Test_List extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private RecyclerView mRecyclerView;
    private MyAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private TextView test_txt;
    private ActionBar actionBar;
    private Spinner spinner;
    private ImageView circleMenuopen, circleMenuclose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test__list2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        test_txt = findViewById(R.id.test);
        circleMenuopen = findViewById(R.id.circle_openmenu);
        circleMenuclose = findViewById(R.id.circle_closemenu);
        Circle_Widget CW = new Circle_Widget();


        bindViews();

        circleMenuclose.setVisibility(View.INVISIBLE);
        circleMenuopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circleMenuclose.setVisibility(View.VISIBLE);
                circleMenuopen.setVisibility(View.INVISIBLE);
                Circle_Widget CW = new Circle_Widget();
                CW.CircleMenuMethod(Test_List.this);
            }
        });

        circleMenuclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circleMenuclose.setVisibility(View.INVISIBLE);
                circleMenuopen.setVisibility(View.VISIBLE);
            }


        });


        SpinnerClass SpC = new SpinnerClass(Test_List.this,getSupportActionBar());

    }


    private void bindViews(){

        mRecyclerView = findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        List<Itemlistobject> rowListItem = getAllItemList();
        mLayoutManager = new LinearLayoutManager(Test_List.this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter =new MyAdapter(Test_List.this,rowListItem);
        mRecyclerView.setAdapter(mAdapter);
        //    mAdapter.setClickListener(() this);
    }

    private List<Itemlistobject> getAllItemList() {

        List<Itemlistobject> allItems = new ArrayList<Itemlistobject>();

        allItems.add(new Itemlistobject("AMCAT","6 Tests", R.drawable.onee));
        allItems.add(new Itemlistobject("SBI","10 Tests",R.drawable.twooo));
        allItems.add(new Itemlistobject("SIB","12 Tests", R.drawable.three));
        allItems.add(new Itemlistobject("TCS","9 Tests", R.drawable.four));
        allItems.add(new Itemlistobject("IBM","5 Tests",R.drawable.five));
        allItems.add(new Itemlistobject("SBI","10 Tests",R.drawable.twooo));
        allItems.add(new Itemlistobject("SIB","12 Tests", R.drawable.three));
        allItems.add(new Itemlistobject("TCS","9 Tests", R.drawable.four));
        allItems.add(new Itemlistobject("IBM","5 Tests",R.drawable.five));

        return allItems;
    }


    public void itemClick(View view, int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_Home) {
            // Handle the camera action
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_about) {

            Intent intent = new Intent(this,About.class);
            startActivity(intent);
        } else if (id == R.id.nav_blogs) {

            Intent intent = new Intent(this,blogsMain.class);
            startActivity(intent);
        } else if (id == R.id.nav_tests) {

            Intent intent = new Intent(this,Test_List.class);
            startActivity(intent);
        }else if (id == R.id.nav_resutls) {
            Toast.makeText(getApplicationContext(),"UNDER CONSTRUCTION",Toast.LENGTH_LONG).show();
              Intent intent = new Intent(this,Result_Analysis.class);
             startActivity(intent);
        }else if (id == R.id.nav_videos) {

            Intent intent = new Intent(this,Videos.class);
            startActivity(intent);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
