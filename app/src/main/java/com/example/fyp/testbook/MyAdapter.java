package com.example.fyp.testbook;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Itemlistobject> itemList;
    private Context context;
    private ItemClickListener clickListener;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView testname_txt, testattempt_txt;
        ImageView imageView;
        RelativeLayout RL;

        public ViewHolder(View itemView) {
            super(itemView);
            testname_txt = (TextView) itemView.findViewById(R.id.test_Title);
            testattempt_txt = (TextView) itemView.findViewById(R.id.Title_attemptNo);
            imageView = (ImageView) itemView.findViewById(R.id.list_avatar);
            RL = itemView.findViewById(R.id.layout);
        }
    }

    public MyAdapter(Context context, List<Itemlistobject> itemList) {

        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.testlist, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, final int position) {
        holder.testname_txt.setText(itemList.get(position).getName());
        holder.testattempt_txt.setText(itemList.get(position).getDesc());
        holder.imageView.setImageResource(itemList.get(position).getPhoto());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickListener != null)
                    clickListener.itemClick(v, position);

            }
        });
        holder.imageView.setTag(holder);
        holder.RL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"youClicked"+itemList.get(position).getName(),Toast.LENGTH_LONG).show();
                Context context=v.getContext();
                Intent intent;
                switch (position){
                    case 0:
                        intent =  new Intent(context, MainActivity.class);
                        context.startActivity(intent);
                        break;
                    case 1:
                        intent =  new Intent(context, MainActivity.class);
                        context.startActivity(intent);
                        break;

                }

               // Intent intent = new Intent (v.getContext(), TestBook.class);
               // context.startActivity(intent);

            }
        });

    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;

    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

    public interface ItemClickListener {

        public void itemClick(View view, int position);
    }
}
