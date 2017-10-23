package com.geeconsystems.globalhr.UI;

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
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.geeconsystems.globalhr.R;

import java.util.ArrayList;
import java.util.List;

public class Add_Employee_Reporting extends AppCompatActivity {
    Toolbar toolbar;
    Spinner spinner,spinner1,spinner2,spinner3;
    Button save;
EditText en;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__employee__reporting);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Add Employee Reporting");
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
         spinner = (Spinner) findViewById(R.id.en);
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
      //  spinner.setPopupBackgroundResource(R.drawable.sarvesh);


        spinner1=(Spinner)findViewById(R.id.manager);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item) {

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

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter1.add("Daily");
        adapter1.add("Two Days");
        adapter1.add("Weekly");
        adapter1.add("Monthly");
        adapter1.add("Three Months");
        adapter1.add("Manager"); //This is the text that will be displayed as hint.


        spinner1.setAdapter(adapter1);
        spinner1.setSelection(adapter1.getCount()); //set the hint the default selection so it appears on launch.
        spinner1.setPrompt("Please Select::");

        spinner2=(Spinner)findViewById(R.id.managertype);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item) {

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

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.add("Daily");
        adapter2.add("Two Days");
        adapter2.add("Weekly");
        adapter2.add("Monthly");
        adapter2.add("Three Months");
        adapter2.add("Manager Type"); //This is the text that will be displayed as hint.


        spinner2.setAdapter(adapter2);
        spinner2.setSelection(adapter2.getCount()); //set the hint the default selection so it appears on launch.
        spinner2.setPrompt("Please Select::");

        spinner3=(Spinner)findViewById(R.id.reportingmode);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item) {

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

        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter3.add("Daily");
        adapter3.add("Two Days");
        adapter3.add("Weekly");
        adapter3.add("Monthly");
        adapter3.add("Three Months");
        adapter3.add("Employee"); //This is the text that will be displayed as hint.


        spinner3.setAdapter(adapter3);
        spinner3.setSelection(adapter3.getCount()); //set the hint the default selection so it appears on launch.
        spinner3.setPrompt("Please Select::");


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
