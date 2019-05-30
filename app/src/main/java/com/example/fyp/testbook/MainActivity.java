package com.example.fyp.testbook;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private ImageView videos_btn, probsol_btn, update_btn, tipsntirck_btn, GK_btn,
            CA_btn, upcoming_btn,Discuss_btn;
    private ImageView  circleMenuclose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



      final ToggleButton  circleMenuopen = findViewById(R.id.circle_openmenu);
circleMenuopen.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    Circle_Widget CW = new Circle_Widget();

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked)
                {
                   CW.CircleMenuMethod(MainActivity.this);
                  //  circleMenuopen.setBackgroundDrawable(getDrawable(R.drawable.close_circle));
                    Log.d("alarmCheck","ALARM SET TO TRUE");
                }
                else
                {
                    CW.CircleMenuMethod(MainActivity.this);

                    //       circleMenuopen.setBackgroundDrawable(getDrawable(R.drawable.open_circle));
                    Log.d("alarmCheck","ALARM SET TO FALSE");
                }
            }
        });

        videos_btn = findViewById(R.id.img_view_videos);
        probsol_btn = findViewById(R.id.img_view_problmsolved);
        update_btn = findViewById(R.id.img_view_updates);
        tipsntirck_btn = findViewById(R.id.img_view_tips);
        GK_btn = findViewById(R.id.img_view_gk);
        CA_btn = findViewById(R.id.img_view_ca);
        upcoming_btn = findViewById(R.id.img_view_upcoming);
        Discuss_btn = findViewById(R.id.img_view_discus);

        final Circle_Widget CW = new Circle_Widget();



        // circleMenuclose.setVisibility(View.VISIBLE);
        // circleMenuopen.setVisibility(View.INVISIBLE);
        //


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



     /*   circleMenuclose.setVisibility(View.INVISIBLE);


        circleMenuopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circleMenuclose.setVisibility(View.VISIBLE);
                circleMenuopen.setVisibility(View.INVISIBLE);
                Circle_Widget CW = new Circle_Widget();
                CW.CircleMenuMethod(MainActivity.this);

            }
        });

        circleMenuclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                circleMenuclose.setVisibility(View.INVISIBLE);
                circleMenuopen.setVisibility(View.VISIBLE);

            }


        });
*/

        videos_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Videos.class);
                startActivity(intent);
            }
        });

        probsol_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "hey", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, quiz.class);
                startActivity(intent);
            }
        });
        update_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "hey", Toast.LENGTH_LONG).show();
              //  Intent intent = new Intent(MainActivity.this, blogsMain.class);
            //    startActivity(intent);
            }
        });

        tipsntirck_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mbuilder = new AlertDialog.Builder(MainActivity.this);
                View mview = getLayoutInflater().inflate(R.layout.dailogbox, null);
                mbuilder.setView(mview);
                AlertDialog dialog = mbuilder.create();
                dialog.show();
            }
        });
        update_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "hey", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, Test_List.class);
                startActivity(intent);
            }
        });
        CA_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
            }
        });

        GK_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GK.class);
                startActivity(intent);
            }
        });
        upcoming_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, blogsMain.class);
                startActivity(intent);
            }
        });

        Discuss_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IQ.class);
                startActivity(intent);
            }
        });
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
