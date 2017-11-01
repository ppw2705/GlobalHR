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

import com.geeconsystems.globalhr.Adapters.emp_reportingAdapter;
import com.geeconsystems.globalhr.CustomCells.emp_reporting;
import com.geeconsystems.globalhr.R;

import java.util.ArrayList;
import java.util.List;

public class leaveQuota extends AppCompatActivity {
    private List<emp_reporting> recycle_List1 = new ArrayList<>();
    Toolbar toolbar;
    private RecyclerView recyclerView;
    private emp_reportingAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_quota);
        recyclerView = (RecyclerView) findViewById(R.id.rv);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("EMPLOYEE REPORTING");
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));

        mAdapter = new emp_reportingAdapter(recycle_List1);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();


    }

    private void prepareMovieData() {
        emp_reporting movie = new emp_reporting("EMP NAME:LEXUSER CHINO", "MANAGER", "LEXUSER", "MANAGER TYPE", "PROJECT MANAGER", "REPORTING MODE", "DIRECT");
        recycle_List1.add(movie);
        movie = new emp_reporting("EMP NAME:LEXUSER CHINO", "MANAGER", "LEXUSER", "MANAGER TYPE", "PROJECT MANAGER", "REPORTING MODE", "DIRECT");
        recycle_List1.add(movie);
        movie = new emp_reporting("EMP NAME:LEXUSER CHINO", "MANAGER", "LEXUSER", "MANAGER TYPE", "PROJECT MANAGER", "REPORTING MODE", "DIRECT");
        recycle_List1.add(movie);
        movie = new emp_reporting("EMP NAME:LEXUSER CHINO", "MANAGER", "LEXUSER", "MANAGER TYPE", "PROJECT MANAGER", "REPORTING MODE", "DIRECT");
        recycle_List1.add(movie);
        movie = new emp_reporting("EMP NAME:LEXUSER CHINO", "MANAGER", "LEXUSER", "MANAGER TYPE", "PROJECT MANAGER", "REPORTING MODE", "DIRECT");
        recycle_List1.add(movie);
        movie = new emp_reporting("EMP NAME:LEXUSER CHINO", "MANAGER", "LEXUSER", "MANAGER TYPE", "PROJECT MANAGER", "REPORTING MODE", "DIRECT");
        recycle_List1.add(movie);
        movie = new emp_reporting("EMP NAME:LEXUSER CHINO", "MANAGER", "LEXUSER", "MANAGER TYPE", "PROJECT MANAGER", "REPORTING MODE", "DIRECT");
        recycle_List1.add(movie);
        movie = new emp_reporting("EMP NAME:LEXUSER CHINO", "MANAGER", "LEXUSER", "MANAGER TYPE", "PROJECT MANAGER", "REPORTING MODE", "DIRECT");
        recycle_List1.add(movie);


        mAdapter.notifyDataSetChanged();
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