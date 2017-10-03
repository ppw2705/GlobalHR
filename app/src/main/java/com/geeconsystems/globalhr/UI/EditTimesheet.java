package com.geeconsystems.globalhr.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.geeconsystems.globalhr.R;

import java.util.ArrayList;
import java.util.List;

public class EditTimesheet extends AppCompatActivity {
    Toolbar toolbar;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_timesheet);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Edit Timesheet");
        toolbar.setNavigationIcon(R.drawable.nav);

        spinner=(Spinner)findViewById(R.id.timesheetperiod);
        List<String> l1=new ArrayList<String>();
        l1.add("TimeSheetPeriod");
        l1.add("TimeSheetPeriod");
        l1.add("TimeSheetPeriod");
        ArrayAdapter<String> adp = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l1);

        spinner.setAdapter(adp);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.add, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
