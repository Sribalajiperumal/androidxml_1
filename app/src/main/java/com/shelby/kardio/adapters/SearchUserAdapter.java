package com.shelby.kardio.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shelby.kardio.R;
import com.shelby.kardio.models.UserModels;

import java.util.ArrayList;

public class SearchUserAdapter extends RecyclerView.Adapter<SearchUserAdapter.ViewHolder> {
    ArrayList<UserModels> itemlist;
    Activity activity;
    Context context;

    public SearchUserAdapter(ArrayList<UserModels> itemlist, Activity activity, Context context) {
        this.itemlist = itemlist;
        this.activity = activity;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_patient_list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView uhid;

        public ViewHolder(@NonNull View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            uhid = (TextView) view.findViewById(R.id.uhid);
        }

    }
}
