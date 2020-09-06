package com.shelby.kardio.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shelby.kardio.R;
import com.shelby.kardio.models.UserModels;
import com.shelby.kardio.models.resourceModels;
import com.shelby.kardio.patient.PatientProfileActivity;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.ViewHolder> {
    ArrayList<UserModels> itemlist;
    Activity activity;
    Context context;

    public UserListAdapter(ArrayList<UserModels> itemlist, Activity activity, Context context) {
        this.itemlist = itemlist;
        this.activity = activity;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_select_patient, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.viewReceipt.setPaintFlags(holder.viewReceipt.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        holder.rowlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, PatientProfileActivity.class);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView uhid;
        private TextView viewReceipt;
        private LinearLayout rowlayout;

        public ViewHolder(@NonNull View view) {
            super(view);
            rowlayout = (LinearLayout) view.findViewById(R.id.Rowlayout);
            name = (TextView) view.findViewById(R.id.name);
            uhid = (TextView) view.findViewById(R.id.uhid);
            viewReceipt = (TextView) view.findViewById(R.id.view_receipt);
        }

    }
}
