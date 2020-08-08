package com.example.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ViewAllListActivity extends AppCompatActivity {

    DataBaseHelper dataBaseHelper;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_list);
        dataBaseHelper = new DataBaseHelper(this);
        recyclerView = findViewById(R.id.rv);
        ArrayList<UserInfo> list = dataBaseHelper.getAllContactDetails();
        ItemAdapter itemAdapter = new ItemAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(itemAdapter);

    }
}
