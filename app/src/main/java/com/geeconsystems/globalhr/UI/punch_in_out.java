package com.geeconsystems.globalhr.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.geeconsystems.globalhr.R;

public class punch_in_out extends AppCompatActivity {
    Toolbar toolbar;
    TextView punchin,punched,time;
    Button punchout;
    View line;

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
        time=(TextView)findViewById(R.id.time);
        punchout=(Button) findViewById(R.id.btnpunchout);
        line=(View)findViewById(R.id.view);


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
        time.setVisibility(View.VISIBLE);
        punchout.setVisibility(View.VISIBLE);
        line.setVisibility(View.VISIBLE);

    }
}
