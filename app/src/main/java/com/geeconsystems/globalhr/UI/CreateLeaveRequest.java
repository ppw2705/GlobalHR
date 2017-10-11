package com.geeconsystems.globalhr.UI;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.geeconsystems.globalhr.R;

import java.util.ArrayList;
import java.util.List;

public class CreateLeaveRequest extends AppCompatActivity {
    Toolbar toolbar;
    Spinner spinner,spinner1,spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_leave_request);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Create Leave Request");
        toolbar.setNavigationIcon(R.drawable.navwhite);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));

        spinner=(Spinner)findViewById(R.id.leaveType);
        List<String> l1=new ArrayList<String>();
        l1.add("Leave Type");
        l1.add("Leave Type");
        l1.add("Leave Type");

        ArrayAdapter<String> adp = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l1);
        adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adp);

        spinner1=(Spinner)findViewById(R.id.startdate);
        List<String> l2=new ArrayList<String>();
        l2.add("Start Date");
        l2.add("Start Date");
        l2.add("Start Date");
        ArrayAdapter<String> adp1 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l2);
        adp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adp1);


        spinner2=(Spinner)findViewById(R.id.enddate);
        List<String> l3=new ArrayList<String>();
        l3.add("End Date");
        l3.add("End Date");
        l3.add("End Date");

        ArrayAdapter<String> adp2 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l3);
        adp2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner2.setAdapter(adp2);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.add, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
