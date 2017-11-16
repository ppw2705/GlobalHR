package com.geeconsystems.globalhr.UI;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.geeconsystems.globalhr.Adapters.meiAdapter;
import com.geeconsystems.globalhr.Adapters.meiAdapter2;
import com.geeconsystems.globalhr.model.recycler_list;
import com.geeconsystems.globalhr.model.recycler_list2;
import com.geeconsystems.globalhr.R;

import java.util.ArrayList;
import java.util.List;

public class mei extends AppCompatActivity {
    private List<recycler_list> recycle_List = new ArrayList<>();
    private List<recycler_list2> recycle_List1 = new ArrayList<>();
    Toolbar toolbar;
    private RecyclerView recyclerView,recyclerView2;
    private meiAdapter mAdapter;
    private meiAdapter2 meiAdapter2;
   // public recycler_list movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mei);
        recyclerView = (RecyclerView) findViewById(R.id.r1);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("MY EMPLOYEE INFO");
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));

        mAdapter = new meiAdapter(recycle_List);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        recyclerView2 = (RecyclerView) findViewById(R.id.r2);

        meiAdapter2 = new meiAdapter2(recycle_List1);
        RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(getApplicationContext());
        recyclerView2.setLayoutManager(mLayoutManager1);
        recyclerView2.setItemAnimator(new DefaultItemAnimator());
        recyclerView2.setAdapter(meiAdapter2);

        prepareMovieData1();
        prepareMovieData();

    }

    private void prepareMovieData1() {
        recycler_list2 movie = new recycler_list2("NAME","Nagengra Mishra");
        recycle_List1.add(movie);
        movie = new recycler_list2("PHONE NUMBER","9986524912");
        recycle_List1.add(movie);
        movie = new recycler_list2("PAN NUMBER","ACB88965");
        recycle_List1.add(movie);
        movie = new recycler_list2("PHONE NUMBER","9986524912");
        recycle_List1.add(movie);
        movie = new recycler_list2("DRIVING LICENSE NUMBER","MH0000000297");
        recycle_List1.add(movie);
        movie = new recycler_list2("LICENSE EXPIRY DATE","18-11-1995");
        recycle_List1.add(movie);


        meiAdapter2.notifyDataSetChanged();

    }

    private void prepareMovieData() {
        recycler_list movie = new recycler_list("NAME","Nagengra Mishra");
        recycle_List.add(movie);
         movie = new recycler_list("PHONE NUMBER","9986524912");
        recycle_List.add(movie);
        movie = new recycler_list("PAN NUMBER","ACB88965");
        recycle_List.add(movie);
        movie = new recycler_list("PHONE NUMBER","9986524912");
        recycle_List.add(movie);
        movie = new recycler_list("DRIVING LICENSE NUMBER","MH0000000297");
        recycle_List.add(movie);
        movie = new recycler_list("LICENSE EXPIRY DATE","18-11-1995");
        recycle_List.add(movie);


        mAdapter.notifyDataSetChanged();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int  id=item.getItemId();
        if(id== android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);


    }

}
