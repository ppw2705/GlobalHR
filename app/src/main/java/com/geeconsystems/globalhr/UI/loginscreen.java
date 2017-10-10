package com.geeconsystems.globalhr.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.geeconsystems.globalhr.R;

import java.io.DataOutputStream;

public class loginscreen extends AppCompatActivity {
    Button button;
    String response;
    EditText user,pass;
    String u,p;
    DataOutputStream printout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);
        button = (Button) findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                user = (EditText) findViewById(R.id.username);
                u = user.getText().toString().trim();
                pass = (EditText) findViewById(R.id.password);
                p = pass.getText().toString().trim();

                if (u.length()>0&&p.length()>0) {

                  //  startActivity(new Intent(getApplicationContext(),Attendance.class));


                }
                else{
                    Toast.makeText(getApplicationContext(),"please fill the login details", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
