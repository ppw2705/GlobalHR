package com.geeconsystems.globalhr.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.geeconsystems.globalhr.CustomCells.emp_info;
import com.geeconsystems.globalhr.CustomCells.recycler_list;
import com.geeconsystems.globalhr.R;

import java.util.List;


public class employeeAdapter extends RecyclerView.Adapter<employeeAdapter.MyViewHolder> {
private List<emp_info> urvi;;

@Override
public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.emp_info, parent, false);

        return new MyViewHolder(itemView);
        }

@Override
public void onBindViewHolder(MyViewHolder holder, int position) {
        emp_info movie = urvi.get(position);
        holder.name.setText(movie.getEname());

        }

@Override
public int getItemCount() {
        return urvi.size();
        }

public class MyViewHolder extends RecyclerView.ViewHolder {

    public Button name;
    public MyViewHolder(View itemView) {
        super(itemView);
        name=(Button) itemView.findViewById(R.id.Employee);
    }
}
    public employeeAdapter(List<emp_info> moviesList) {
        this.urvi = moviesList;
    }


}
