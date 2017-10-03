package com.geeconsystems.globalhr.UI;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.geeconsystems.globalhr.R;

import java.io.IOException;

public class profilephoto extends AppCompatActivity {
        Toolbar t;
        ImageView i,i2,cam,rem,gal;
        LinearLayout l;
        RelativeLayout r;
        private int GALLERY_REQUEST=1;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_profilephoto);
            l = (LinearLayout) findViewById(R.id.linear);
            r = (RelativeLayout) findViewById(R.id.relative);
            t = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(t);
            getSupportActionBar().setTitle("PROFILE PHOTO");
            t.setNavigationIcon(R.drawable.nav);
            i = (ImageView) findViewById(R.id.profile);
            l.setVisibility(View.INVISIBLE);
            i2=(ImageView)findViewById(R.id.blur1);
            i2.setVisibility(View.INVISIBLE);
            i.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    i2.setVisibility(View.VISIBLE);
                    i2.setAlpha(0.3f);
                    Animation animation= AnimationUtils.loadAnimation(profilephoto.this,R.anim.slideup);
                    l.startAnimation(animation);
                    l.setBackgroundColor(Color.parseColor("#ffffff"));
                    l.setVisibility(View.VISIBLE);

                }
            });
            cam=(ImageView)findViewById(R.id.Camera);
            cam.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent camintent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(camintent,7777);
                }
            });

            rem=(ImageView)findViewById(R.id.Remove);
            rem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    i.setImageDrawable(getResources().getDrawable(R.drawable.ppdimg));
                }
            });

            gal=(ImageView)findViewById(R.id.Gallery);
            gal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        Intent i = new Intent(Intent.ACTION_PICK,
                                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                        i.setType("image/*");
                        startActivityForResult(i,1);
                    }catch(Exception exp){
                        Log.i("Error",exp.toString());
                    }

                }
            });



        }
        @Override
        protected void onActivityResult(int requestCode,int resultCode,Intent data){
            if(requestCode==7777&&resultCode==RESULT_OK){
                Bitmap photo=(Bitmap)data.getExtras().get("data");
                i.setImageBitmap(photo);
                i.setScaleType(ImageView.ScaleType.FIT_CENTER);
                i.setPadding(10,50,10,50);
                i.setBackground(getResources().getDrawable(R.drawable.ppbg));
            }

            if(resultCode == Activity.RESULT_OK)
                switch (requestCode){
                    case 1:
                        Uri selectedImage = data.getData();
                        try {
                            Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), selectedImage);
                            i.setImageBitmap(bitmap);
                            i.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            i.setPadding(100,100,100,100);
                            i.setBackground(getResources().getDrawable(R.drawable.ppbg));

                        } catch (IOException e) {
                            Log.i("TAG", "Some exception " + e);
                        }
                        break;
                }

        }
    }