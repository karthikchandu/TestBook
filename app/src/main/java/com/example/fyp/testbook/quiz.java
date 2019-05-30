package com.example.fyp.testbook;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class quiz extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private mcq_adapter mcqAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private Spinner spinner;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        bindViews();


     //   Toolbar toolbar = findViewById(R.id.toolbar);
       // getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
       // getSupportActionBar().setDisplayShowCustomEnabled(true);
       // getSupportActionBar().setCustomView(R.layout.custom_action_bar_layout);


      /*    View view = getSupportActionBar().getCustomView();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // back button pressed
                   onBackPressed();
                finish();
            }
        });
*/
        //Spinner

        SpinnerClass SpC = new SpinnerClass(quiz.this, getSupportActionBar());

    }
    private void bindViews(){

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_mcqs);
        mRecyclerView.setHasFixedSize(true);
        List<Itemlistobject> rowListItem = getAllItemList();
        mLayoutManager = new LinearLayoutManager(quiz.this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mcqAdapter =new mcq_adapter(quiz.this,rowListItem);
        mRecyclerView.setAdapter(mcqAdapter);
//        mcqAdapter.setClickListener((mcq_adapter.ItemClickListener) this);
    }

    private List<Itemlistobject> getAllItemList() {

        List<Itemlistobject> allItems = new ArrayList<Itemlistobject>();

        allItems.add(new Itemlistobject("Q1. At what percentage should he mark the Wiper up to get the required percentage profit","10%","20%","15%","5%"));
        allItems.add(new Itemlistobject("Q2. The discount given by the shopkeeper on the purchase of the Toothpaste to the customer is Rs.4.40; find at what price did the shopkeeper sold the Toothpaste"," A. Rs. 50"," B. Rs. 50.60 ","C. Rs. 45","D. Rs. 48"));
        allItems.add(new Itemlistobject("QUESTION3","1","2","3","4"));
        allItems.add(new Itemlistobject("QUESTION4","1","2","3","4"));

        return allItems;
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
