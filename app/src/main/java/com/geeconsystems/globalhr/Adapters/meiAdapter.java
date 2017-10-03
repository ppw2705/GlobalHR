package com.geeconsystems.globalhr.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.geeconsystems.globalhr.CustomCells.recycler_list;
import com.geeconsystems.globalhr.R;

import java.util.List;

/**
 * Created by Asus on 10/2/2017.
 */

public class meiAdapter extends RecyclerView.Adapter<meiAdapter.MyViewHolder> {
    public List<recycler_list> urvi;;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        recycler_list movie = urvi.get(position);
        holder.name.setText(movie.getTitle());
        holder.myname.setText(movie.getname());

    }

    @Override
    public int getItemCount() {
        return urvi.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView name,myname;
        public MyViewHolder(View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.name);
            myname=(TextView)itemView.findViewById(R.id.myname);
        }
    }
    public meiAdapter(List<recycler_list> moviesList) {
        this.urvi = moviesList;
    }


}
