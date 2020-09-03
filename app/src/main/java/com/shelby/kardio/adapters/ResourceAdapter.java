package com.shelby.kardio.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shelby.kardio.R;
import com.shelby.kardio.models.resourceModels;

import java.util.ArrayList;

public class ResourceAdapter extends RecyclerView.Adapter<ResourceAdapter.ViewHolder> {
    ArrayList<resourceModels> itemlist;
    Activity activity;
    Context context;

    public ResourceAdapter(ArrayList<resourceModels> itemlist, Activity activity, Context context) {
        this.itemlist = itemlist;
        this.activity = activity;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_resources_block, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Rowlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return 23;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView typeIcon;
        private TextView titleTv;
        private ImageButton download;
        private LinearLayout Rowlayout;

        public ViewHolder(@NonNull View view) {
            super(view);
            Rowlayout = (LinearLayout) view.findViewById(R.id.Rowlayout);
            typeIcon = (ImageView) view.findViewById(R.id.type_icon);
            titleTv = (TextView) view.findViewById(R.id.title_tv);
            download = (ImageButton) view.findViewById(R.id.download);
        }
    }
}
