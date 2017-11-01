package com.geeconsystems.globalhr.UI;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.geeconsystems.globalhr.Adapters.employeeAdapter;
import com.geeconsystems.globalhr.CustomCells.emp_info;
import com.geeconsystems.globalhr.CustomCells.recycler_list;
import com.geeconsystems.globalhr.CustomCells.recycler_list2;
import com.geeconsystems.globalhr.R;

import java.util.ArrayList;
import java.util.List;

public class Employee_Info extends AppCompatActivity {
    Toolbar toolbar;
    private List<emp_info> recycle_List1 = new ArrayList<>();
    private RecyclerView recyclerView;
    private employeeAdapter employeeA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee__info);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("My Employee Info");
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setNavigationIcon(R.drawable.back);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        employeeA=new employeeAdapter(recycle_List1);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(employeeA);
        prepareMovieData();

    }
    private void prepareMovieData() {
        emp_info movie = new emp_info("Nagengra Mishra");
        recycle_List1.add(movie);

         movie = new emp_info("Neha Pandey");
        recycle_List1.add(movie);

         movie = new emp_info("Sanjeev Mishra");
        recycle_List1.add(movie);
        employeeA.notifyDataSetChanged();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int  id=item.getItemId();
        if(id== android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);


    }


}
