package com.geeconsystems.globalhr.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.geeconsystems.globalhr.model.recycler_list2;
import com.geeconsystems.globalhr.R;

import java.util.List;

/**
 * Created by urvi on 10/28/2017.
 */

public class meiAdapter2 extends RecyclerView.Adapter<meiAdapter2.MyViewHolder> {
    public List<recycler_list2> urvi;;

    @Override
    public meiAdapter2.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row, parent, false);

        return new meiAdapter2.MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(meiAdapter2.MyViewHolder holder, int position) {
        recycler_list2 movie = urvi.get(position);
        holder.name.setText(movie.getLeft());
        holder.myname.setText(movie.getRight());

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
    public meiAdapter2(List<recycler_list2> moviesList) {
        this.urvi = moviesList;
    }


}

