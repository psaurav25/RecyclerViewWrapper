package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.recycler.listwrapper.ListWrapper;
import com.recycler.listwrapper.listener.ListItemUICallback;

public class MainActivity extends AppCompatActivity implements ListItemUICallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);


        ListWrapper wrapper = new ListWrapper(recyclerView , R.layout.recycler_view_row_layout , 5 , new LinearLayoutManager(getApplicationContext()) , this);
        wrapper.populateRecyclerView();
    }

    @Override
    public void populateView(View view, int position) {
        //update your item view here
    }

    @Override
    public void onItemClick(View view, int position) {
        //handle view item click here

    }
}
