package com.shelby.kardio.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shelby.kardio.R;
import com.shelby.kardio.models.recordModels;
import com.shelby.kardio.models.resourceModels;

import java.util.ArrayList;

public class RecordsAdapter extends RecyclerView.Adapter<RecordsAdapter.ViewHolder> {
    ArrayList<recordModels> itemlist;
    Activity activity;
    Context context;

    public RecordsAdapter(ArrayList<recordModels> itemlist, Activity activity, Context context) {
        this.itemlist = itemlist;
        this.activity = activity;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_records_block, parent, false);
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
        private LinearLayout rowlayout;
        private TextView recordNumber;
        private TextView dateTime;
        private TextView recordType;
        private TextView doctorName;
        private TextView viewReport;
        private ImageButton close;

        public ViewHolder(@NonNull View view) {
            super(view);
            rowlayout = (LinearLayout) view.findViewById(R.id.rowlayout);
            recordNumber = (TextView) view.findViewById(R.id.record_number);
            dateTime = (TextView) view.findViewById(R.id.date_time);
            recordType = (TextView) view.findViewById(R.id.record_type);
            doctorName = (TextView) view.findViewById(R.id.doctor_name);
            viewReport = (TextView) view.findViewById(R.id.view_report);
            close = (ImageButton) view.findViewById(R.id.close);
        }
    }
}
