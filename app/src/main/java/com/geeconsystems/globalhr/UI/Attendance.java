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
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.geeconsystems.globalhr.R;
import com.geeconsystems.globalhr.utilities.loginsession;

import java.util.HashMap;

public class Attendance extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    ImageView b1,b2,b3,b4;
    NavigationView navigationView;
    DrawerLayout drawer;
    loginsession session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("ATTENDANCE");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        session=new loginsession(getApplicationContext());
        HashMap<String,String> user=session.getuserdetails();
        String name=user.get(loginsession.key_name);
       // String pass=user.get(usersessionmanager.key_pass);
        Toast.makeText(this,"you are logged in as::"+name,Toast.LENGTH_LONG).show();

        drawer=(DrawerLayout)findViewById(R.id.drawer);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView=(NavigationView)findViewById(R.id.nav_view);
        toolbar.setNavigationIcon(R.drawable.navwhite);

        navigationView.setNavigationItemSelectedListener(this);


        b1=(ImageView)findViewById(R.id.imageView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Attendance.this,My_employee_info.class));
            }
        });

        b2=(ImageView)findViewById(R.id.imageView2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Attendance.this,Add_salary_details.class));
            }
        });

        b3=(ImageView)findViewById(R.id.imageView3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Attendance.this,EditTimesheet.class));
            }
        });

        b4=(ImageView)findViewById(R.id.imageView4);
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
        Attendance.this.moveTaskToBack(true);

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
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.logout, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_logout:
                session.logoutuser();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
