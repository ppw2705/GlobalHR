package com.geeconsystems.globalhr.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.geeconsystems.globalhr.model.emp_reporting;
import com.geeconsystems.globalhr.R;

import java.util.List;

public class emp_reportingAdapter extends RecyclerView.Adapter<emp_reportingAdapter.MyViewHolder> {
public List<emp_reporting> urvi;

@Override
public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.emp_report, parent, false);

        return new MyViewHolder(itemView);
        }

@Override
public void onBindViewHolder(MyViewHolder holder, int position) {
        emp_reporting movie = urvi.get(position);
        holder.a.setText(movie.getH());
        holder.b.setText(movie.getH1());
    holder.c.setText(movie.getH11());
    holder.d.setText(movie.getH2());
    holder.e.setText(movie.getH22());
    holder.f.setText(movie.getH3());
    holder.g.setText(movie.getH33());


}

@Override
public int getItemCount() {
        return urvi.size();
        }

public class MyViewHolder extends RecyclerView.ViewHolder {

    public TextView a,b,c,d,e,f,g;
    public MyViewHolder(View itemView) {
        super(itemView);
        a=(TextView)itemView.findViewById(R.id.h);
        b=(TextView)itemView.findViewById(R.id.h1);
        c=(TextView)itemView.findViewById(R.id.h11);
        d=(TextView)itemView.findViewById(R.id.h2);
        e=(TextView)itemView.findViewById(R.id.h22);
        f=(TextView)itemView.findViewById(R.id.h3);
        g=(TextView)itemView.findViewById(R.id.h33);
    }
}
    public emp_reportingAdapter(List<emp_reporting> moviesList) {
        this.urvi = moviesList;
    }


}