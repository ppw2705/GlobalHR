package com.geeconsystems.globalhr.UI;

import android.content.Intent;
import android.graphics.Color;
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

public class Add_salary_details extends AppCompatActivity {
    Toolbar toolbar;
    Spinner spinner,spinner1,spinner2,spinner3,spinner4,spinner5;
    Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_salary_details);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.back);
        getSupportActionBar().setTitle("Add Salary Details");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));



        spinner=(Spinner)findViewById(R.id.empname);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item) {

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
        adapter.add("Daily");
        adapter.add("Two Days");
        adapter.add("Weekly");
        adapter.add("Monthly");
        adapter.add("Three Months");
        adapter.add("Employee Name"); //This is the text that will be displayed as hint.


        spinner.setAdapter(adapter);
        spinner.setSelection(adapter.getCount()); //set the hint the default selection so it appears on launch.
        spinner.setPrompt("Please Select::");


        spinner1=(Spinner)findViewById(R.id.empgrade);
        List<String> l2=new ArrayList<String>();
        l2.add("Employee Grade");
        l2.add("Employee Grade");
        l2.add("Employee Grade");

        ArrayAdapter<String> adp1 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l2);
        adp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adp1);

        spinner2=(Spinner)findViewById(R.id.empgradelevel);
        List<String> l3=new ArrayList<String>();
        l3.add("Employee Grade Level");
        l3.add("Employee Grade Level");
        l3.add("Employee Grade Level");

        ArrayAdapter<String> adp2 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l3);
        adp2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner2.setAdapter(adp2);

        spinner3=(Spinner)findViewById(R.id.currency);
        List<String> l4=new ArrayList<String>();
        l4.add("Currency");
        l4.add("Currency");
        l4.add("Currency");
        ArrayAdapter<String> adp3 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l4);
        adp3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner3.setAdapter(adp3);

        spinner4=(Spinner)findViewById(R.id.payfrequency);
        List<String> l5=new ArrayList<String>();
        l5.add("Pay Frequency");
        l5.add("Pay Frequency");
        l5.add("Pay Frequency");
        ArrayAdapter<String> adp4 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l5);
        adp4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner4.setAdapter(adp4);
        spinner5=(Spinner)findViewById(R.id.salarycomponent);
        List<String> l6=new ArrayList<String>();
        l6.add("Salary Component");
        l6.add("Salary Component");
        l6.add("Salary Component");
        ArrayAdapter<String> adp5 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l6);
        adp5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adp5);

        button=(Button)findViewById(R.id.save);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Add_salary_details.this,Add_Employee_Reporting.class));
            }
        });

        button=(Button)findViewById(R.id.cancel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Add_salary_details.this,Add_Job_Details.class));
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
