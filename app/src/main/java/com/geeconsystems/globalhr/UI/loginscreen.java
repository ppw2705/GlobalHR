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
import com.geeconsystems.globalhr.R;
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
                  //  Toast.makeText(getApplicationContext(),response, Toast.LENGTH_SHORT).show();

                   /* if(r =="{\"OA_ID\":\"154\",\"OA_BRAND_ID\":\"152\",\"userid\":\"269\",\"punch_status\":2,\"message\":\"LOGIN SUCCESSFUL\"}") {
                        session.createuserloginsession(u, p);
                        Intent intent1 = new Intent(loginscreen.this, Attendance.class);
                        intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent1);
                        finish();
                    }
                    else if (r == "{\"message\":\"LOGIN UNSUCCESSFUL\"}"){
                        Toast.makeText(loginscreen.this,"Login Unsuccessfull",Toast.LENGTH_LONG).show();
                    }
*/
                } else {
                    Toast.makeText(getApplicationContext(), "please fill the login details", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }

    @Override
    public void onBackPressed() {

        loginscreen.this.moveTaskToBack(true);

    }

    public class SendPostRequest extends AsyncTask<String, Void, String> {

       protected void onPreExecute() {
        }

        protected String doInBackground(String... arg0) {
            RequestQueue MyRequestQueue = Volley.newRequestQueue(loginscreen.this);

            String url = "http://www.mydevsystems.com/dev/gap_v2/rest/restexample/RestController.php";
            StringRequest MyStringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Log.e("TAG", "onResponse: " + response);
                    //This code is executed if the server responds, whether or not the response contains data.
                    //The String 'response' contains the server's response.
                    r=response;
                }
            }, new Response.ErrorListener() { //Create an error listener to handle errors appropriately.
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.e("TAG", "onResponse: " + error.toString());
                    //This code is executed if there is an error.
                }
            }) {
                protected Map<String, String> getParams() {
                    Map<String, String> MyData = new HashMap<String, String>();
                    MyData.put("view", "login"); //Add the data you'd like to send to the server.
                    MyData.put("username", u);
                    MyData.put("password", p);
                    return MyData;
                }
            };

            MyRequestQueue.add(MyStringRequest);
            return response;
        }


        @Override
        protected void onPostExecute(String result) {
            Toast.makeText(getApplicationContext(), response,Toast.LENGTH_LONG).show();
          //  startActivity(new Intent(loginscreen.this,Attendance.class));
        }

    }

}