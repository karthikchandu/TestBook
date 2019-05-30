package com.example.fyp.testbook;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class mcq_adapter extends RecyclerView.Adapter<mcq_adapter.ViewHolder> {
    private List<Itemlistobject> itemList2;
    private Context context;
    private ItemClickListener clickListener;

    public class ViewHolder extends RecyclerView.ViewHolder {
    CheckBox cb1,cb2,cb3,cb4;
    TextView question_txt;
        LinearLayout RL;

        public ViewHolder(View itemView) {
            super(itemView);
            question_txt = (TextView) itemView.findViewById(R.id.question_txt);
            cb1 = itemView.findViewById(R.id.checkBox1);
            cb2 = itemView.findViewById(R.id.checkBox2);
            cb3 = itemView.findViewById(R.id.checkBox3);
            cb4 = itemView.findViewById(R.id.checkBox4);
          //  RL = itemView.findViewById(R.id.linearlayout1);
        }
    }

    public mcq_adapter(Context context, List<Itemlistobject> itemList2) {

        this.itemList2 = itemList2;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mcqs_list, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.question_txt.setText(itemList2.get(position).getQuestion1());
        holder.cb1.setText(itemList2.get(position).getCheckbox1());
        holder.cb2.setText(itemList2.get(position).getCheckbox2());
        holder.cb3.setText(itemList2.get(position).getCheckbox3());
        holder.cb4.setText(itemList2.get(position).getCheckbox4());


/*        holder.imageView.setTag(holder);*/
        holder.cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Checkbox1",Toast.LENGTH_LONG).show();
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
        return this.itemList2.size();
    }

    public interface ItemClickListener {

        public void itemClick(View view, int position);
    }
}
