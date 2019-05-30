package com.example.fyp.testbook;

import android.app.Activity;
import android.content.Intent;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerClass {

    public SpinnerClass(final Activity activity, ActionBar supportActionBar) {
        final String[] dropDownItemArr = {"All Posts", "SBI Clerk", "item 3"};

        // Get ActionBar

        // Set below attributes to add logo in ActionBar.
        SpinnerAdapter spinnerAdapter = new SpinnerAdapter() {

            @Override
            public View getDropDownView(int itemIndex, View view, ViewGroup viewGroup) {
                // Create a LinearLayout view object.
                LinearLayout linearLayout = new LinearLayout(activity);
                linearLayout.setOrientation(LinearLayout.VERTICAL);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, Gravity.CENTER);
                linearLayout.setLayoutParams(layoutParams);

                // Create ImageView and set image source by item index.
                ImageView itemImageView = new ImageView(activity);
                // Add ImageView in return view.
                linearLayout.addView(itemImageView, 0);
                // Create TextView and set it's text and color.
                TextView itemTextView = new TextView(activity);
                String itemText = dropDownItemArr[itemIndex];
                itemTextView.setText(itemText);
                itemTextView.setTextSize(20);
                itemTextView.setBackgroundColor(Color.WHITE);
                itemTextView.setTextColor(Color.parseColor("#22ab1e"));

                // Add TextView in return view.
                linearLayout.addView(itemTextView, 1);

                linearLayout.setBackgroundColor(Color.WHITE);

                return linearLayout;
            }

            @Override
            public void registerDataSetObserver(DataSetObserver dataSetObserver) {

            }

            @Override
            public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

            }

            @Override
            public int getCount() {
                // Return drop down menu item count.
                return dropDownItemArr.length;
            }

            @Override
            public Object getItem(int itemIndex) {
                // Return drop down menu item text.
                return dropDownItemArr[itemIndex];
            }

            @Override
            public long getItemId(int itemIndex) {
                return itemIndex;
            }

            @Override
            public boolean hasStableIds() {
                return false;
            }

            // This method return the View object for drop down input box.
            // It only return TextView object.
            @Override
            public View getView(int itemIndex, View view, ViewGroup viewGroup) {
                TextView itemTextView = new TextView(activity);
                String itemText = dropDownItemArr[itemIndex];
                itemTextView.setText(itemText);
                itemTextView.setTextSize(20);
                itemTextView.setTextColor(Color.WHITE);
                return itemTextView;
            }

            @Override
            public int getItemViewType(int i) {
                return 0;
            }

            @Override
            public int getViewTypeCount() {
                // This method must return 1, otherwise java.lang.IllegalArgumentException will be thrown.
                return 1;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

        };


        // Set action bar navigation mode to list mode.
        supportActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        // Set action bar list navigation data and item click listener.
        supportActionBar.setListNavigationCallbacks(spinnerAdapter, new ActionBar.OnNavigationListener() {
            @Override
            public boolean onNavigationItemSelected(int itemPosition, long itemId) {

                String menuItemText = dropDownItemArr[itemPosition];
                String message = "You click menu " + menuItemText;
                switch (itemPosition) {
                    case 0:
                        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show();

                        break;
                    case 1:

                        Intent intent_quiz = new Intent(activity,quiz.class);
                        activity.startActivity(intent_quiz);
                        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show();

                        break;
                    case 2:
                        AlertDialog alertDialog = new AlertDialog.Builder(activity).create();
                        alertDialog.setMessage(message);
                        alertDialog.show();
                        break;
                    default:
                        break;
                }
                return true;
            }
        });



    }



    }
