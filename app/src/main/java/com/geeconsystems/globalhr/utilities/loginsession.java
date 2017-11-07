package com.geeconsystems.globalhr.utilities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.geeconsystems.globalhr.UI.loginscreen;

import java.util.HashMap;

/**
 * Created by urvi on 11/4/2017.
 */

public class loginsession {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;
    public static final String isuserlogedin = "isuserlogedin";
    public static final String key_name = "username";
     public static final String key_pass = "password";

    //constructor
    public loginsession(Context context) {
        this._context = context;
        pref = context.getSharedPreferences("userinfo", 0);
        editor = pref.edit();

    }

    //create login session
    public void createuserloginsession(String name, String password) {
        editor.putBoolean("isuserlogedin", true);
        editor.putString("username", name);
        editor.putString("password", password);
        editor.commit();
    }



    //get store login info session data
    public HashMap<String, String> getuserdetails() {
        //use hash map to store user credentials
        HashMap<String, String> user = new HashMap<String, String>();
        user.put("username", pref.getString(key_name, null));
        user.put("password", pref.getString(key_pass, null));
        return user;

    }
    // Check for login
        public boolean isUserLoggedIn(){

            return pref.getBoolean(isuserlogedin, false);
    }


    //clear session details
    public void logoutuser() {
        editor.clear();
        editor.commit();
        Intent i = new Intent(_context, loginscreen.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        _context.startActivity(i);

    }
}
