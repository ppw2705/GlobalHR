package com.geeconsystems.globalhr.UI;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.geeconsystems.globalhr.R;

import java.util.ArrayList;
import java.util.List;

public class Add_Employee_Reporting extends AppCompatActivity {
    Toolbar toolbar;
    Spinner spinner,spinner1,spinner2,spinner3;
    Button save;
    ArrayAdapter<String> adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__employee__reporting);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Add Employee Reporting");
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        spinner=(Spinner)findViewById(R.id.empname);
        List<String> l1=new ArrayList<String>();
        l1.add("Employee Name");
        l1.add("Employee Name");
        l1.add("Employee Name");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,l1) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                View v = super.getView(position, convertView, parent);
                if (position == getCount()) {
                    ((TextView)v.findViewById(android.R.id.text1)).setText("");
                    ((TextView)v.findViewById(android.R.id.text1)).setHint(getItem(getCount())); //"Hint to be displayed"
                }

                return v;
            }

            @Override
            public int getCount() {
                return super.getCount()-1; // you dont display last item. It is used as hint.
            }

        };
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //adapter.add("Employee Name");

        spinner.setAdapter(adapter);
        spinner.setSelection(adapter.getCount()); //display hint

        spinner1=(Spinner)findViewById(R.id.manager);
        List<String> l2=new ArrayList<String>();
        l2.add("Manager");
        l2.add("Manager");
        l2.add("Manager");

        ArrayAdapter<String> adp1 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l2);
        adp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adp1);

        spinner2=(Spinner)findViewById(R.id.managertype);
        List<String> l3=new ArrayList<String>();
        l3.add("Manager Type");
        l3.add("Manager Type");
        l3.add("Manager Type");
        ArrayAdapter<String> adp2 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l3);
        adp2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner2.setAdapter(adp2);

        spinner3=(Spinner)findViewById(R.id.reportingmode);
        List<String> l4=new ArrayList<String>();
        l4.add("Reporting Mode");
        l4.add("Reporting Mode");
        l4.add("Reporting Mode");
        ArrayAdapter<String> adp3 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l4);
        adp3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner3.setAdapter(adp3);


        save=(Button)findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  startActivity(new Intent(Add_Employee_Reporting.this,Etimesheet.class));
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.add, menu);
        return super.onCreateOptionsMenu(menu);
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
