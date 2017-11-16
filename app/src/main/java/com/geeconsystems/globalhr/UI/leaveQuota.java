package com.geeconsystems.globalhr.UI;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.geeconsystems.globalhr.Adapters.leavequota;
import com.geeconsystems.globalhr.model.leavequotacc;
import com.geeconsystems.globalhr.R;

import java.util.ArrayList;
import java.util.List;

public class leaveQuota extends AppCompatActivity {
    private List<leavequotacc> recycle_List = new ArrayList<>();
    Toolbar toolbar;
    private RecyclerView recyclerview;
    private leavequota myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_quota);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerView);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("LEAVE QUOTA");
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));

        myAdapter = new leavequota(recycle_List);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerview.setLayoutManager(mLayoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());
        recyclerview.setAdapter(myAdapter);

        prepareMovieData1();


    }

    private void prepareMovieData1() {
        leavequotacc leavelist = new leavequotacc("JOHN DAVE","CASUAL LEAVE","START DATE/END DATE","8-11-1995-8-11-1996","ALLOCATED DAYS","3.00","TAKEN","3.00","BALANCE","3.00");
        recycle_List.add(leavelist);
        leavelist = new leavequotacc("JOHN DAVE","CASUAL LEAVE","START DATE/END DATE","8-11-1995-8-11-1996","ALLOCATED DAYS","3.00","TAKEN","3.00","BALANCE","3.00");
        recycle_List.add(leavelist);
        leavelist = new leavequotacc("JOHN DAVE","CASUAL LEAVE","START DATE/END DATE","8-11-1995-8-11-1996","ALLOCATED DAYS","3.00","TAKEN","3.00","BALANCE","3.00");
        recycle_List.add(leavelist);
        leavelist = new leavequotacc("JOHN DAVE","CASUAL LEAVE","START DATE/END DATE","8-11-1995-8-11-1996","ALLOCATED DAYS","3.00","TAKEN","3.00","BALANCE","3.00");
        recycle_List.add(leavelist);
        leavelist = new leavequotacc("JOHN DAVE","CASUAL LEAVE","START DATE/END DATE","8-11-1995-8-11-1996","ALLOCATED DAYS","3.00","TAKEN","3.00","BALANCE","3.00");
        recycle_List.add(leavelist);


        myAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.add, menu);
        return super.onCreateOptionsMenu(menu);
    }

}