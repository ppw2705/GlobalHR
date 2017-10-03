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

public class Etimesheet extends AppCompatActivity {
    Toolbar toolbar;
    Spinner spinner,spinner2,spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etimesheet);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("EDIT TIMESHEET");
        toolbar.setNavigationIcon(R.drawable.nav);


        spinner=(Spinner)findViewById(R.id.timesheet2015);
        List<String> l2=new ArrayList<String>();
        l2.add("timesheet2015");
        l2.add("timesheet2015");
        l2.add("timesheet2015");
        ArrayAdapter<String> adp1 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l2);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adp1);

        spinner2=(Spinner)findViewById(R.id.startdate);
        List<String> l3=new ArrayList<String>();
        l3.add("2015-07-1");
        l3.add("2015-07-1");
        l3.add("2015-07-1");
        ArrayAdapter<String> adp2 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l3);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner2.setAdapter(adp2);

        spinner3=(Spinner)findViewById(R.id.enddate);
        List<String> l4=new ArrayList<String>();
        l4.add("2015-07-15");
        l4.add("2015-07-15");
        l4.add("2015-07-15");
        ArrayAdapter<String> adp3 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l4);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner3.setAdapter(adp3);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.add, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
