package com.example.custombasicadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Adapter;

import com.example.custombasicadapter.adapter.BasicAdapter;
import com.example.custombasicadapter.modul.User;

import java.lang.reflect.Member;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        context = this;
        recyclerView = findViewById(R.id.view_recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
        refreshAdapter(getMembers());
    }

    private void refreshAdapter(ArrayList<User> members) {
        BasicAdapter basicAdapter = new BasicAdapter(context,members);
        recyclerView.setAdapter(basicAdapter);
    }

    private ArrayList<User> getMembers() {
        ArrayList<User> userArrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            userArrayList.add(new User(R.drawable.ic_launcher_background,"Bekhruzbek007","developer"));
        }

        return userArrayList;
    }
}