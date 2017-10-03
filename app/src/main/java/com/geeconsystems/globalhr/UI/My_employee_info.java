package com.geeconsystems.globalhr.UI;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.geeconsystems.globalhr.R;

import java.util.ArrayList;
import java.util.List;

public class My_employee_info extends AppCompatActivity {
    Toolbar toolbar;
    Spinner spinner,spinner1,spinner2,spinner3,spinner4,
            spinner5,spinner6,spinner7,spinner15;

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_employee_info);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("My employee Info");
        toolbar.setNavigationIcon(R.drawable.navwhite);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        spinner=(Spinner)findViewById(R.id.employeename);
        List<String> l1=new ArrayList<String>();
        l1.add("Nagendra");
        l1.add("Nagendra");
        l1.add("Nagendra");

        ArrayAdapter<String> adp = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l1);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adp);

        spinner1=(Spinner)findViewById(R.id.birthdate);
        List<String> l2=new ArrayList<String>();
        l2.add("8-11-1995");
        l2.add("8-11-1995");
        l2.add("8-11-1995");

        ArrayAdapter<String> adp1 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l2);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adp1);

        spinner2=(Spinner)findViewById(R.id.gender);
        List<String> l3=new ArrayList<String>();
        l3.add("male");
        l3.add("female");
        l3.add("other");
        ArrayAdapter<String> adp2 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l3);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner2.setAdapter(adp2);

        spinner3=(Spinner)findViewById(R.id.relationshipstatus);
        List<String> l4=new ArrayList<String>();
        l4.add("single");
        l4.add(" married");
        l4.add("divorsed");
        ArrayAdapter<String> adp3 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l4);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner3.setAdapter(adp3);

        spinner4=(Spinner)findViewById(R.id.general);
        List<String> l5=new ArrayList<String>();
        l5.add("General");
        l5.add("General");
        l5.add("General");
        ArrayAdapter<String> adp4 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l5);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner4.setAdapter(adp4);

        spinner5=(Spinner)findViewById(R.id.nationality);
        List<String> l6=new ArrayList<String>();
        l6.add("indian");
        l6.add("indian");
        l6.add("indian");
        ArrayAdapter<String> adp5 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l6);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner5.setAdapter(adp5);

        spinner15=(Spinner)findViewById(R.id.bloodgroup);
        List<String> l16=new ArrayList<String>();
        l16.add("bloodgroup");
        l16.add("bloodgroup");
        l16.add("bloodgroup");
        ArrayAdapter<String> adp15 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, l16);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner15.setAdapter(adp15);

        b1=(Button)findViewById(R.id.save);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(My_employee_info.this,Employee_Info.class));
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.add, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
