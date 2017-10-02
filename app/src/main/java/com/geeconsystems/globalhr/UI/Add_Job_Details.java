package com.geeconsystems.globalhr.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Add_Job_Detail extends AppCompatActivity {
    Toolbar toolbar;
    Spinner spinner,spinner1,spinner2,spinner3,spinner4,
            spinner5,spinner6,spinner7,spinner8,spinner9,spinner10,spinner11,spinner12,spinner13,spinner14,spinner15;
    Button btnsave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__job__detail);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Add Job Detail");
        toolbar.setNavigationIcon(R.drawable.nav);
        spinner=(Spinner)findViewById(R.id.employee);
        List<String> l1=new ArrayList<String>();
        l1.add("Employee");
        l1.add("Employee");
        l1.add("Employee");

        ArrayAdapter<String> adp = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l1);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adp);

        spinner1=(Spinner)findViewById(R.id.employeegrosssalary);
        List<String> l2=new ArrayList<String>();
        l2.add("Employee gross salary");
        l2.add("Employee gross salary");
        l2.add("Employee gross salary");

        ArrayAdapter<String> adp1 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l2);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adp1);

        spinner2=(Spinner)findViewById(R.id.employementtype);
        List<String> l3=new ArrayList<String>();
        l3.add("Employement Type");
        l3.add("Employement Type");
        l3.add("Employement Type");
        ArrayAdapter<String> adp2 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l3);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner2.setAdapter(adp2);

        spinner3=(Spinner)findViewById(R.id.employementcategory);
        List<String> l4=new ArrayList<String>();
        l4.add("Employement Category");
        l4.add("Employement Category");
        l4.add("Employement Category");
        ArrayAdapter<String> adp3 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l4);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner3.setAdapter(adp3);

        spinner4=(Spinner)findViewById(R.id.employementstatus);
        List<String> l5=new ArrayList<String>();
        l5.add("Employement Status");
        l5.add("Employement Status");
        l5.add("Employement Status");

        ArrayAdapter<String> adp4 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l5);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner4.setAdapter(adp4);

        spinner5=(Spinner)findViewById(R.id.jobtitle);
        List<String> l6=new ArrayList<String>();
        l6.add("jobtitle");
        l6.add("jobtitle");
        l6.add("jobtitle");

        ArrayAdapter<String> adp5 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l6);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner5.setAdapter(adp5);

        spinner15=(Spinner)findViewById(R.id.jobcategory);
        List<String> l16=new ArrayList<String>();
        l16.add("jobcategory");
        l16.add("jobcategory");
        l16.add("jobcategory");
        ArrayAdapter<String> adp15 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l16);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner15.setAdapter(adp15);


        spinner6=(Spinner)findViewById(R.id.department);
        List<String> l7=new ArrayList<String>();
        l7.add("department");
        l7.add("department");
        l7.add("department");
        ArrayAdapter<String> adp6 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l7);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner6.setAdapter(adp6);

        spinner7=(Spinner)findViewById(R.id.holidaygroup);
        List<String> l8=new ArrayList<String>();
        l8.add("holidaygroup");
        l8.add("holidaygroup");
        l8.add("holidaygroup");
        ArrayAdapter<String> adp7 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l8);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner7.setAdapter(adp7);


        spinner8=(Spinner)findViewById(R.id.dateofjoinning);
        List<String> l9=new ArrayList<String>();
        l9.add("date of joinning");
        l9.add("date of joinning");
        l9.add("date of joinning");
        ArrayAdapter<String> adp8 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l9);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner8.setAdapter(adp8);

        spinner9=(Spinner)findViewById(R.id.terminationreason);
        List<String> l10=new ArrayList<String>();
        l10.add("terminationreason");
        l10.add("terminationreason");
        l10.add("terminationreason");
        l10.add("terminationreason");
        ArrayAdapter<String> adp9 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l10);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner9.setAdapter(adp9);

        spinner10=(Spinner)findViewById(R.id.terminationdate);
        List<String> l11=new ArrayList<String>();
        l11.add("terminationdate");
        l11.add("terminationdate");
        l11.add("terminationdate");
        ArrayAdapter<String> adp10 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l11);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner10.setAdapter(adp10);

        spinner11=(Spinner)findViewById(R.id.confirmationdate);
        List<String> l12=new ArrayList<String>();
        l12.add("confirmationdate");
        l12.add("confirmationdate");
        l12.add("confirmationdate");
        ArrayAdapter<String> adp11 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l12);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner11.setAdapter(adp11);

        spinner12=(Spinner)findViewById(R.id.lastapprasialdate);
        List<String> l13=new ArrayList<String>();
        l13.add("lastapprasialdate");
        l13.add("lastapprasialdate");
        l13.add("lastapprasialdate");
        ArrayAdapter<String> adp12 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l13);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner12.setAdapter(adp12);

        spinner13=(Spinner)findViewById(R.id.resignedon);
        List<String> l14=new ArrayList<String>();
        l14.add("resigned on");
        l14.add("resigned on");
        l14.add("resigned on");

        ArrayAdapter<String> adp13 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l14);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner13.setAdapter(adp13);

        spinner14=(Spinner)findViewById(R.id.resignationacceptedon);
        List<String> l15=new ArrayList<String>();
        l15.add("resignationacceptedon");
        l15.add("resignationacceptedon");
        l15.add("resignationacceptedon");
        ArrayAdapter<String> adp14 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l15);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner14.setAdapter(adp14);


        btnsave=(Button)findViewById(R.id.save);
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),punch_in_out.class));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.add, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
}
