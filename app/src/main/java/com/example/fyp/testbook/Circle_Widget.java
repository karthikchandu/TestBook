package com.example.fyp.testbook;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Circle_Widget {
     AlertDialog dialog;
    void CircleMenuMethod(final Activity activity) {
        final View mview = activity.getLayoutInflater().inflate(R.layout.sub_menu, null);
        //dialog.show();
        CharSequence[] items = {};
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(mview);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {

                if (item == 0) {

                } else if (item == 1) {

                } else if (item == 2) {

                }
            }
        });
       dialog = builder.create();
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        WindowManager.LayoutParams wmlp = dialog.getWindow().getAttributes();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        wmlp.gravity = Gravity.BOTTOM | Gravity.CENTER;
        wmlp.x = 0;   //x position
        wmlp.y = -150;   //y position
        dialog.setCanceledOnTouchOutside(false);

        dialog.show();
        
        CircleImageView sub_close = mview.findViewById(R.id.sub_close_ids);
        sub_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }

    public void hide_menu() {
        dialog.dismiss();
    }

}

