package com.geeconsystems.globalhr.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.geeconsystems.globalhr.R;

public class punch_in_out extends AppCompatActivity {
    Toolbar toolbar;
    TextView punchin,punched,time,punchedout,date_time;
    Button btn1,btn2;
    View line;
    ImageView imgclock;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punch_in_out);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("PUNCH IN-OUT");
        toolbar.setNavigationIcon(R.drawable.nav);
        punchin=(TextView)findViewById(R.id.punchin);
        punched=(TextView)findViewById(R.id.punched);
        punchedout=(TextView)findViewById(R.id.punchedout);
        time=(TextView)findViewById(R.id.time);
        btn1=(Button) findViewById(R.id.btnpunchout);
        btn2=(Button) findViewById(R.id.btnpunchin);
        line=(View)findViewById(R.id.view);
        btn2.setVisibility(View.INVISIBLE);
        relativeLayout=(RelativeLayout)findViewById(R.id.relative);
        date_time=(TextView) findViewById(R.id.date_time);
        imgclock=(ImageView)findViewById(R.id.imgclock);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.add,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void punchin(View v)
    {
        punchin.setVisibility(View.INVISIBLE);
        punched.setVisibility(View.VISIBLE);
        punchedout.setVisibility(View.INVISIBLE);
        time.setVisibility(View.VISIBLE);
        btn1.setVisibility(View.VISIBLE);
        line.setVisibility(View.VISIBLE);
        relativeLayout.setVisibility(View.VISIBLE);
        date_time.setVisibility(View.VISIBLE);
        imgclock.setVisibility(View.VISIBLE);

    }
    public  void btnpunchout(View v)
    {
        punchedout.setVisibility(View.VISIBLE);
        time.setVisibility(View.VISIBLE);
        line.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        punched.setVisibility(View.INVISIBLE);
        relativeLayout.setVisibility(View.VISIBLE);
        date_time.setVisibility(View.VISIBLE);
        imgclock.setVisibility(View.VISIBLE);



    }
    public  void btnpunchin(View v)
    {
        punchedout.setVisibility(View.INVISIBLE);
        time.setVisibility(View.VISIBLE);
        line.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn1.setVisibility(View.VISIBLE);
        punched.setVisibility(View.VISIBLE);
        relativeLayout.setVisibility(View.VISIBLE);
        date_time.setVisibility(View.VISIBLE);
        imgclock.setVisibility(View.VISIBLE);

    }
}
