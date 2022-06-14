package com.geektech.thirdlesson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList <String> numbers;

    @Override
    protected void onCrete(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadDate();
        recyclerView = findViewById(R.id.recycler_view);
        NumberAdapter adapter = new NumberAdapter(numbers);
        recyclerView.setAdapter(adapter);
    }


    private void loadDate(){
        numbers=new ArrayList<>();
        numbers.add("45215486349565");
        numbers.add("45215486349565");
        numbers.add("45215486349565");
        numbers.add("45215486349565");
        numbers.add("45215486349565");
        numbers.add("45215486349565");
        numbers.add("45215486349565");
        numbers.add("45215486349565");
        numbers.add("45215486349565");
        numbers.add("45215486349565");
        numbers.add("45215486349565");
        numbers.add("45215486349565");
        numbers.add("45215486349565");
        numbers.add("45215486349565");
        numbers.add("45215486349565");
    }
}