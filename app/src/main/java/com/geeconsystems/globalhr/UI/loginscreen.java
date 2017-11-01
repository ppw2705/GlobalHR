package com.geeconsystems.globalhr.UI;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.geeconsystems.globalhr.R;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class loginscreen extends AppCompatActivity {
    Button button;
    String response;
    EditText user,pass;
    String u,p;
    String url="http://www.mydevsystems.com/dev/gap_service/rest/restexample/RestController.php?view=login";
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
                        new SendPostRequest().execute();
                        Toast.makeText(loginscreen.this,"",Toast.LENGTH_LONG).show();
                  // startActivity(new Intent(getApplicationContext(),Attendance.class));


                }
                else{
                    Toast.makeText(getApplicationContext(),"please fill the login details", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
    public  class SendPostRequest extends AsyncTask<Object, Object, Void> {

        protected void onPreExecute(){}

        protected Void doInBackground(Object... arg0) {
           try {
               HttpClient httpclient;
               HttpPost httppost;
               ArrayList<NameValuePair> postParameters;
               httpclient = new DefaultHttpClient();
               httppost = new HttpPost("http://www.mydevsystems.com/dev/gap/rest/restexample/RestController.php");


               postParameters = new ArrayList<NameValuePair>();
               postParameters.add(new BasicNameValuePair("view", "login"));
               postParameters.add(new BasicNameValuePair("username", u));
               postParameters.add(new BasicNameValuePair("password", p));

               httppost.setEntity(new UrlEncodedFormEntity(postParameters, "UTF-8"));

               HttpResponse response = httpclient.execute(httppost);
               Toast.makeText(loginscreen.this,response.toString(),Toast.LENGTH_SHORT).show();

           } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
          //  Toast.makeText(loginscreen.this,responseServer,Toast.LENGTH_SHORT).show();
        }
    }

    public static class InputStreamToStringExample {

        public static void main(String[] args) throws IOException {

            // intilize an InputStream
            InputStream is =
                    new ByteArrayInputStream("file content..blah blah".getBytes());

            String result = getStringFromInputStream(is);

            System.out.println(result);
         //   Toast.makeText(,result,Toast.LENGTH_SHORT).show();
           // System.out.println("Done");

        }

        // convert InputStream to String
        private static String getStringFromInputStream(InputStream is) {

            BufferedReader br = null;
            StringBuilder sb = new StringBuilder();

            String line;
            try {

                br = new BufferedReader(new InputStreamReader(is));
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return sb.toString();
        }

    }
}

