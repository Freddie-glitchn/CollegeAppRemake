package com.example.recap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<MyPostsData> arrayList;
    RecyclerView recyclerView;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initi();
        generateData();
        setData();


        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


//                new MyPostsData("Leon", "Call me punk one more time!", R.drawable.wolf),
//                new MyPostsData("Welly", "sleep ni**a", R.drawable.wolf),
//                new MyPostsData("Mark", "Say what now?", R.drawable.wolf),
//                new MyPostsData("Kirk", "Asshole!", R.drawable.wolf),
//                new MyPostsData("Liam", "What up punks!", R.drawable.wolf),



    }

    private void setData() {

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyPostsAdapter(arrayList, this));
    }

    private void generateData() {

        arrayList.add(new MyPostsData("Mark", "What up punks!", R.drawable.wolf));
        arrayList.add(new MyPostsData("Mary", "You the punk!", R.drawable.wolf));
        arrayList.add(new MyPostsData("Martin", "Who are punks!", R.drawable.wolf));
    }

    private void initi() {

        arrayList = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);
    }
}