package com.geeconsystems.globalhr.UI;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.geeconsystems.globalhr.R;

public class Attendance extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    ImageView b1,b2,b3,b4;
    NavigationView navigationView;
    DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("ATTENDANCE");
        // toolbar.setNavigationIcon(R.drawable.navwhite);

        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));

        drawer=(DrawerLayout)findViewById(R.id.drawer);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView=(NavigationView)findViewById(R.id.nav_view);
        toolbar.setNavigationIcon(R.drawable.navwhite);

        navigationView.setNavigationItemSelectedListener(this);


        b1=(ImageView)findViewById(R.id.pioimg);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Attendance.this,My_employee_info.class));
            }
        });

        b2=(ImageView)findViewById(R.id.arimg);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Attendance.this,Add_salary_details.class));
            }
        });

        b3=(ImageView)findViewById(R.id.aregimg);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Attendance.this,EditTimesheet.class));
            }
        });

        b4=(ImageView)findViewById(R.id.aeimg);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Attendance.this,CreateLeaveRequest.class));
            }
        });
    }
    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id==R.id.notification){

        }
        else if(id==R.id.mainmenu){

        }
        else if(id==R.id.settings){

        }

        drawer.closeDrawer(GravityCompat.START);
        return true;


    }
}
