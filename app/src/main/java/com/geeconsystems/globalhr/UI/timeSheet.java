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
import android.widget.TextView;

import com.geeconsystems.globalhr.Adapters.timesheetAdapter;
import com.geeconsystems.globalhr.model.timesheet;
import com.geeconsystems.globalhr.R;

import java.util.ArrayList;
import java.util.List;

public class timeSheet extends AppCompatActivity {
    private List<timesheet> recycle_List = new ArrayList<>();
    Toolbar toolbar;
    private RecyclerView Recyclerview;
    private timesheetAdapter adapter;
TextView colord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_sheet);
        Recyclerview = (RecyclerView) findViewById(R.id.RV);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("LEAVE QUOTA");
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        adapter = new timesheetAdapter(recycle_List);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        Recyclerview.setLayoutManager(mLayoutManager);
        Recyclerview.setItemAnimator(new DefaultItemAnimator());
        Recyclerview.setAdapter(adapter);

        prepareMovieData2();


    }

    private void prepareMovieData2()
    {
        timesheet timesheetlist = new timesheet("QUERTYADMIN","Approved","TIMESHEET PERIOD","TIMESHEET 2015-Q5","START DATE/END DATE","2015-06-11/2015-05-3");
        recycle_List.add(timesheetlist);
//        colord.setTextColor(Color.parseColor("#00b4ff"));
         timesheetlist = new timesheet("QUERTYADMIN","Requested","TIMESHEET PERIOD","TIMESHEET 2015-Q5","START DATE/END DATE","2015-06-11/2015-05-3");
        recycle_List.add(timesheetlist);
   //     colord.setTextColor(Color.parseColor("#ff9909"));
        timesheetlist = new timesheet("QUERTYADMIN","Not Submitted","TIMESHEET PERIOD","TIMESHEET 2015-Q5","START DATE/END DATE","2015-06-11/2015-05-3");
        recycle_List.add(timesheetlist);
        timesheetlist = new timesheet("QUERTYADMIN","Approved","TIMESHEET PERIOD","TIMESHEET 2015-Q5","START DATE/END DATE","2015-06-11/2015-05-3");
        recycle_List.add(timesheetlist);
//        colord.setTextColor(Color.parseColor("#00b4ff"));
        timesheetlist = new timesheet("QUERTYADMIN","Requested","TIMESHEET PERIOD","TIMESHEET 2015-Q5","START DATE/END DATE","2015-06-11/2015-05-3");
        recycle_List.add(timesheetlist);
        //     colord.setTextColor(Color.parseColor("#ff9909"));
        timesheetlist = new timesheet("QUERTYADMIN","Not Submitted","TIMESHEET PERIOD","TIMESHEET 2015-Q5","START DATE/END DATE","2015-06-11/2015-05-3");
        recycle_List.add(timesheetlist);
        timesheetlist = new timesheet("QUERTYADMIN","Approved","TIMESHEET PERIOD","TIMESHEET 2015-Q5","START DATE/END DATE","2015-06-11/2015-05-3");
        recycle_List.add(timesheetlist);
//        colord.setTextColor(Color.parseColor("#00b4ff"));
        timesheetlist = new timesheet("QUERTYADMIN","Requested","TIMESHEET PERIOD","TIMESHEET 2015-Q5","START DATE/END DATE","2015-06-11/2015-05-3");
        recycle_List.add(timesheetlist);
        //     colord.setTextColor(Color.parseColor("#ff9909"));
        timesheetlist = new timesheet("QUERTYADMIN","Not Submitted","TIMESHEET PERIOD","TIMESHEET 2015-Q5","START DATE/END DATE","2015-06-11/2015-05-3");
        recycle_List.add(timesheetlist);

        adapter.notifyDataSetChanged();
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
