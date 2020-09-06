package com.shelby.kardio.patient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.shelby.kardio.R;
import com.shelby.kardio.adapters.RecordsAdapter;
import com.shelby.kardio.models.recordModels;

import java.util.ArrayList;

public class PatientProfileActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton rbProfile;
    private RadioButton rbRecord;
    private LinearLayout profile;
    private TextView patientidTv;
    private TextView fullnameTv;
    private TextView ageTv;
    private TextView genderTv;
    private TextView mobileNumberTv;
    private LinearLayout record;
    private RecyclerView rcRecords;

    RecordsAdapter adapter;
    ArrayList<recordModels> recordModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_profile);

        recordModels = new ArrayList<>();

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        rbProfile = (RadioButton) findViewById(R.id.rb_profile);
        rbRecord = (RadioButton) findViewById(R.id.rb_record);
        profile = (LinearLayout) findViewById(R.id.profile);
        patientidTv = (TextView) findViewById(R.id.patientid_tv);
        fullnameTv = (TextView) findViewById(R.id.fullname_tv);
        ageTv = (TextView) findViewById(R.id.age_tv);
        genderTv = (TextView) findViewById(R.id.gender_tv);
        mobileNumberTv = (TextView) findViewById(R.id.mobileNumber_tv);
        record = (LinearLayout) findViewById(R.id.record);
        rcRecords = (RecyclerView) findViewById(R.id.rc_records);

        profile.setVisibility(View.VISIBLE);
        record.setVisibility(View.GONE);
        rbRecord.setTextColor(getResources().getColor(R.color.colorBlack));
        rbProfile.setTextColor(getResources().getColor(R.color.colorWhite));

        rcRecords.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        adapter = new RecordsAdapter(recordModels, PatientProfileActivity.this, getApplicationContext());
        rcRecords.setAdapter(adapter);
        rcRecords.setHasFixedSize(true);

        rbProfile.setChecked(true);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rb_profile) {
                    profile.setVisibility(View.VISIBLE);
                    record.setVisibility(View.GONE);
                    rbRecord.setTextColor(getResources().getColor(R.color.colorBlack));
                    rbProfile.setTextColor(getResources().getColor(R.color.colorWhite));
                } else if (checkedId == R.id.rb_record) {
                    profile.setVisibility(View.GONE);
                    record.setVisibility(View.VISIBLE);
                    rbRecord.setTextColor(getResources().getColor(R.color.colorWhite));
                    rbProfile.setTextColor(getResources().getColor(R.color.colorBlack));
                } else {
                    profile.setVisibility(View.VISIBLE);
                    record.setVisibility(View.GONE);
                    rbRecord.setTextColor(getResources().getColor(R.color.colorBlack));
                    rbProfile.setTextColor(getResources().getColor(R.color.colorWhite));
                }
            }
        });

    }

}