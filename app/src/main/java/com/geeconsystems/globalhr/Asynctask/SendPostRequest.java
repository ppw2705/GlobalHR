package com.geeconsystems.globalhr.Asynctask;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.geeconsystems.globalhr.Interfaces.SendInterface;
import com.geeconsystems.globalhr.UI.loginscreen;
import com.geeconsystems.globalhr.model.login;

import java.util.HashMap;
import java.util.Map;

public class SendPostRequest extends AsyncTask<String, Void, String> {
 Context context;
    String r;
    private SendInterface sendInterface;
    login lgn;

    /*public SendPostRequest(SendInterface sendInterface) {
        this.sendInterface = sendInterface;
    }
*/
    protected void onPreExecute() {
    }

    protected String doInBackground(String... arg0) {
        RequestQueue MyRequestQueue = Volley.newRequestQueue(context);

        String url = "http://www.mydevsystems.com/dev/gap_v2/rest/restexample/RestController.php";
        StringRequest MyStringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.e("TAG", "onResponse: " + response);
                sendInterface.SendResponse(response);
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
                MyData.put("username",lgn.getUser());
                MyData.put("password",lgn.getPass());
                return MyData;
            }
        };

        MyRequestQueue.add(MyStringRequest);
        return null;
    }


    @Override
    protected void onPostExecute(String result) {
        Toast.makeText(context, result,Toast.LENGTH_LONG).show();
        //  startActivity(new Intent(loginscreen.this,Attendance.class));
      //  sendInterface.SendResponse(result);
    }

}
