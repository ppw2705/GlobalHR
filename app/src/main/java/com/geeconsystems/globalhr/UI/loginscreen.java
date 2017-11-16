package com.geeconsystems.globalhr.UI;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.geeconsystems.globalhr.Asynctask.SendPostRequest;
import com.geeconsystems.globalhr.Interfaces.SendInterface;
import com.geeconsystems.globalhr.R;
import com.geeconsystems.globalhr.model.login;
import com.geeconsystems.globalhr.utilities.loginsession;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

public class loginscreen extends AppCompatActivity {
    Button button;
    String response,r;
    EditText user, pass;
    String u, p;
    loginsession session;
    login lgn;
    SendInterface sendInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);
        button = (Button) findViewById(R.id.login);

        session=new loginsession(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                user = (EditText) findViewById(R.id.username);
                u = user.getText().toString().trim();
                pass = (EditText) findViewById(R.id.password);
                p = pass.getText().toString().trim();

                if (u.length() > 0 && p.length() > 0) {
                    new SendPostRequest().execute();
                    lgn=new login(u,p,"login");

                    //  Toast.makeText(getApplicationContext(),response, Toast.LENGTH_SHORT).show();


                     //   session.createuserloginsession(u, p);
                       // Intent intent1 = new Intent(loginscreen.this, Attendance.class);
                        //intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        //intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                       // startActivity(intent1);
                       // finish();
                        //Toast.makeText(loginscreen.this,"Login successfull",Toast.LENGTH_LONG).show();
                    }
                }
    });
}



    @Override
    public void onBackPressed() {

        loginscreen.this.moveTaskToBack(true);

    }


}