package com.example.fyp.testbook;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Fragment_BlogAll extends Fragment {

    View v;
    RecyclerView recyclerView;
    List<Blogs> listCont;


    public Fragment_BlogAll() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_blogsall,container,false);
        recyclerView = (RecyclerView) v.findViewById(R.id.blogs_recycleView);
        RecycleViewAdapter viewAdapter = new RecycleViewAdapter(getContext(), listCont);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(viewAdapter);
        return v;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listCont = new ArrayList<>();
        listCont.add(new Blogs("Software Testing\n" + "Help Blog","5",R.drawable.ic_launcher_background));
        listCont.add(new Blogs("Software Testing\n" + "Help Blog","5",R.drawable.ic_launcher_background));
        listCont.add(new Blogs("Software Testing\n" + "Help Blog","5",R.drawable.ic_launcher_background));
        listCont.add(new Blogs("Software Testing\n" + "Help Blog","5",R.drawable.ic_launcher_background));

    }
}



