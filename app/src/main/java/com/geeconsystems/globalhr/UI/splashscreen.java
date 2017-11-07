package com.geeconsystems.globalhr.UI;

import android.content.Intent;
import android.graphics.Matrix;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.geeconsystems.globalhr.R;
import com.geeconsystems.globalhr.utilities.loginsession;

import static android.R.attr.angle;
import static android.R.attr.pivotX;
import static android.R.attr.pivotY;

public class splashscreen extends AppCompatActivity {
    private final static int splashtimmeout = 3000;
    loginsession session;
    ImageView i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        i = (ImageView) findViewById(R.id.logo);

        session = new loginsession(this);
        if (session.isUserLoggedIn() == true) {

            startActivity(new Intent(splashscreen.this, Attendance.class));
            finish();

        } else
            {
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
            i.startAnimation(animation);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(splashscreen.this, loginscreen.class));
                    finish();
                }
            }, splashtimmeout);
        }
    }
}