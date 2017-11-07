package com.geeconsystems.globalhr.Adapters;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.geeconsystems.globalhr.CustomCells.timesheet;
import com.geeconsystems.globalhr.R;

import java.util.List;

/**
 * Created by urvi on 11/3/2017.
 */

public class timesheetAdapter extends RecyclerView.Adapter<timesheetAdapter.MyViewHolder> {
    public List<timesheet> urvi;

    @Override
    public timesheetAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.timesheet, parent, false);

        return new timesheetAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(timesheetAdapter.MyViewHolder holder, int position) {
        timesheet movie = urvi.get(position);
        holder.quertyadmin.setText(movie.getQuertyadmin());
        holder.status.setText(movie.getStatus());
        if(movie.getStatus()=="Approved"){
            holder.status.setBackgroundColor(Color.parseColor("#3ab54a"));
        }
        else if(movie.getStatus()=="Requested"){
            holder.status.setBackgroundColor(Color.parseColor("#00b4ff"));

        }
        else if (movie.getStatus()=="Not Submitted"){
            holder.status.setBackgroundColor(Color.parseColor("#ff9909"));

        }
        else {
            holder.status.setBackgroundColor(Color.parseColor("#ffffff"));

        }
        holder.tsperiod.setText(movie.getTsperiod());
        holder.ts.setText(movie.getTimesheet());
        holder.sded.setText(movie.getSded());
        holder.dte.setText(movie.getDte());


    }

    @Override
    public int getItemCount() {
        return urvi.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView quertyadmin,status,tsperiod,ts,sded,dte;
        public MyViewHolder(View itemView) {
            super(itemView);
            quertyadmin=(TextView)itemView.findViewById(R.id.quertyadmin);
            status=(TextView)itemView.findViewById(R.id.status);
            tsperiod=(TextView)itemView.findViewById(R.id.tsperiod);
            ts=(TextView)itemView.findViewById(R.id.ts);
            sded=(TextView)itemView.findViewById(R.id.startenddate);
            dte=(TextView)itemView.findViewById(R.id.dt);

        }
    }
    public timesheetAdapter(List<timesheet> moviesList) {
        this.urvi = moviesList;
    }


}
