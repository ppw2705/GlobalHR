package com.geeconsystems.globalhr.Adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.geeconsystems.globalhr.CustomCells.leavequotacc;
import com.geeconsystems.globalhr.R;

import java.util.List;

public class leavequota extends RecyclerView.Adapter<leavequota.MyViewHolder> {
    public List<leavequotacc> urvi;;

    @Override
    public leavequota.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.leavequota, parent, false);

        return new leavequota.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(leavequota.MyViewHolder holder, int position) {
        leavequotacc movie = urvi.get(position);
        holder.name.setText(movie.getPerson());
        holder.Leave.setText(movie.getLeave());
        holder.dte.setText(movie.getDatet());
        holder.dte1.setText(movie.getDate());
        holder.adays.setText(movie.getAllocateddays());
        holder.adays1.setText(movie.getDayno());
        holder.tkn.setText(movie.getTaken());
        holder.tkn1.setText(movie.getTakenno());
        holder.bal.setText(movie.getBalance());
        holder.bal1.setText(movie.getBalno());
    }

    @Override
    public int getItemCount() {
        return urvi.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView name,Leave,dte,dte1,adays,adays1,tkn,tkn1,bal,bal1;
        public MyViewHolder(View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.name);
            Leave=(TextView)itemView.findViewById(R.id.leave);
            dte=(TextView)itemView.findViewById(R.id.sdanded);
            dte1=(TextView)itemView.findViewById(R.id.sdanded1);
            adays=(TextView)itemView.findViewById(R.id.allocateddays);
            adays1=(TextView)itemView.findViewById(R.id.allocateddays1);
            tkn=(TextView)itemView.findViewById(R.id.taken);
            tkn1=(TextView)itemView.findViewById(R.id.taken1);
            bal=(TextView)itemView.findViewById(R.id.balance);
            bal1=(TextView)itemView.findViewById(R.id.balance1);


        }
    }
    public leavequota(List<leavequotacc> moviesList) {
        this.urvi = moviesList;
    }


}
