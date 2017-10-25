package com.geeconsystems.globalhr.UI;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.geeconsystems.globalhr.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Add_Job_Details extends AppCompatActivity {
    Toolbar toolbar;
    Spinner spinner,spinner1,spinner2,spinner3,spinner4,
            spinner5,spinner6,spinner7,spinner9,spinner13,spinner14,spinner15;
    Button btnsave;
EditText spinner8,spinner10,spinner11,spinner12;
  public Calendar myCalendar=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__job__details);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Add Job Detail");
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        spinner=(Spinner)findViewById(R.id.employee);
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
        adapter.add("Employee"); //This is the text that will be displayed as hint.


        spinner.setAdapter(adapter);
        spinner.setSelection(adapter.getCount()); //set the hint the default selection so it appears on launch.
        spinner.setPrompt("Please Select::");


        spinner1=(Spinner)findViewById(R.id.employeegrosssalary);
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
        adapter1.add("Employee Gross Salary"); //This is the text that will be displayed as hint.


        spinner1.setAdapter(adapter1);
        spinner1.setSelection(adapter1.getCount()); //set the hint the default selection so it appears on launch.
        spinner1.setPrompt("Please Select::");


        spinner2=(Spinner)findViewById(R.id.employementtype);
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
        adapter2.add("Employement Type"); //This is the text that will be displayed as hint.


        spinner2.setAdapter(adapter2);
        spinner2.setSelection(adapter2.getCount()); //set the hint the default selection so it appears on launch.
        spinner2.setPrompt("Please Select::");



        spinner3=(Spinner)findViewById(R.id.employementcategory);
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
        adapter3.add("Employee Category"); //This is the text that will be displayed as hint.


        spinner3.setAdapter(adapter3);
        spinner3.setSelection(adapter3.getCount()); //set the hint the default selection so it appears on launch.
        spinner3.setPrompt("Please Select::");



        spinner4=(Spinner)findViewById(R.id.employementstatus);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item) {

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

        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter4.add("Daily");
        adapter4.add("Two Days");
        adapter4.add("Weekly");
        adapter4.add("Monthly");
        adapter4.add("Three Months");
        adapter4.add("Employee Gross Salary"); //This is the text that will be displayed as hint.


        spinner4.setAdapter(adapter4);
        spinner4.setSelection(adapter4.getCount()); //set the hint the default selection so it appears on launch.
        spinner4.setPrompt("Please Select::");



        spinner5=(Spinner)findViewById(R.id.jobtitle);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item) {

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

        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter5.add("Daily");
        adapter5.add("Two Days");
        adapter5.add("Weekly");
        adapter5.add("Monthly");
        adapter5.add("Three Months");
        adapter5.add("Job Title"); //This is the text that will be displayed as hint.


        spinner5.setAdapter(adapter5);
        spinner5.setSelection(adapter5.getCount()); //set the hint the default selection so it appears on launch.
        spinner5.setPrompt("Please Select::");



        spinner15=(Spinner)findViewById(R.id.jobcategory);
        ArrayAdapter<String> adapter15 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item) {

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

        adapter15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter15.add("Daily");
        adapter15.add("Two Days");
        adapter15.add("Weekly");
        adapter15.add("Monthly");
        adapter15.add("Three Months");
        adapter15.add("Job Category"); //This is the text that will be displayed as hint.


        spinner15.setAdapter(adapter15);
        spinner15.setSelection(adapter15.getCount()); //set the hint the default selection so it appears on launch.
        spinner15.setPrompt("Please Select::");




        spinner6=(Spinner)findViewById(R.id.department);
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item) {

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

        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter6.add("Daily");
        adapter6.add("Two Days");
        adapter6.add("Weekly");
        adapter6.add("Monthly");
        adapter6.add("Three Months");
        adapter6.add("Department"); //This is the text that will be displayed as hint.


        spinner6.setAdapter(adapter1);
        spinner6.setSelection(adapter1.getCount()); //set the hint the default selection so it appears on launch.
        spinner6.setPrompt("Please Select::");



        spinner7=(Spinner)findViewById(R.id.holidaygroup);
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item) {

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

        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter7.add("Daily");
        adapter7.add("Two Days");
        adapter7.add("Weekly");
        adapter7.add("Monthly");
        adapter7.add("Three Months");
        adapter7.add("Holiday Group"); //This is the text that will be displayed as hint.


        spinner7.setAdapter(adapter7);
        spinner7.setSelection(adapter7.getCount()); //set the hint the default selection so it appears on launch.
        spinner7.setPrompt("Please Select::");


        myCalendar = Calendar.getInstance();

        spinner8=(EditText) findViewById(R.id.dateofjoinning);
       final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

        };
        spinner8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(Add_Job_Details.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();

            }
        });


        spinner9=(Spinner)findViewById(R.id.terminationreason);
        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item) {

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

        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter9.add("Daily");
        adapter9.add("Two Days");
        adapter9.add("Weekly");
        adapter9.add("Monthly");
        adapter9.add("Three Months");
        adapter9.add("Termination Reason"); //This is the text that will be displayed as hint.


        spinner9.setAdapter(adapter9);
        spinner9.setSelection(adapter9.getCount()); //set the hint the default selection so it appears on launch.
        spinner9.setPrompt("Please Select::");



        spinner10=(EditText) findViewById(R.id.terminationdate);
        final DatePickerDialog.OnDateSetListener date1 = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel1();
            }

        };
        spinner10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(Add_Job_Details.this, date1, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();

            }
        });


        spinner11=(EditText) findViewById(R.id.confirmationdate);
        final DatePickerDialog.OnDateSetListener date2 = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel2();
            }

        };
        spinner11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(Add_Job_Details.this, date2, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();

            }
        });

        spinner12=(EditText) findViewById(R.id.lastapriasaldate);
        final DatePickerDialog.OnDateSetListener date3 = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel3();
            }

        };
        spinner12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(Add_Job_Details.this, date3, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();

            }
        });

        spinner13=(Spinner)findViewById(R.id.resignedon);
        ArrayAdapter<String> adapter13 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item) {

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

        adapter13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter13.add("Daily");
        adapter13.add("Two Days");
        adapter13.add("Weekly");
        adapter13.add("Monthly");
        adapter13.add("Three Months");
        adapter13.add("Resigned On"); //This is the text that will be displayed as hint.


        spinner13.setAdapter(adapter13);
        spinner13.setSelection(adapter13.getCount()); //set the hint the default selection so it appears on launch.
        spinner13.setPrompt("Please Select::");



        spinner14=(Spinner)findViewById(R.id.resignationacceptedon);
        ArrayAdapter<String> adapter14 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item) {

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

        adapter14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter14.add("Daily");
        adapter14.add("Two Days");
        adapter14.add("Weekly");
        adapter14.add("Monthly");
        adapter14.add("Three Months");
        adapter14.add("Resignation Accepted On"); //This is the text that will be displayed as hint.


        spinner14.setAdapter(adapter14);
        spinner14.setSelection(adapter14.getCount()); //set the hint the default selection so it appears on launch.
        spinner14.setPrompt("Please Select::");




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
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int  id=item.getItemId();
        if(id== android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);


    }
    private void updateLabel() {
        String myFormat = "MM/dd/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        spinner8.setText(sdf.format(myCalendar.getTime()));
    }
    private void updateLabel1() {
        String myFormat = "MM/dd/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        spinner10.setText(sdf.format(myCalendar.getTime()));
    }
    private void updateLabel2() {
        String myFormat = "MM/dd/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        spinner11.setText(sdf.format(myCalendar.getTime()));
    }
    private void updateLabel3() {
        String myFormat = "MM/dd/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        spinner12.setText(sdf.format(myCalendar.getTime()));
    }


}
