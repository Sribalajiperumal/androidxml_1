package com.shelby.kardio.patient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.textfield.TextInputEditText;
import com.shelby.kardio.R;
import com.shelby.kardio.adapters.SearchUserAdapter;
import com.shelby.kardio.models.UserModels;

import java.util.ArrayList;

public class AddPatientActivity extends AppCompatActivity {

    private ImageView imageView8;
    private LinearLayout linearLayout3;
    private RadioGroup radioGroup;
    private RadioButton rbNewpatient;
    private RadioButton rbExisting;
    private LinearLayout newPatientBlock;
    private LinearLayout linearLayout4;
    private AppCompatEditText uhid;
    private AppCompatEditText patientId;
    private AppCompatEditText fullname;
    private AppCompatEditText age;
    private RadioGroup gender;
    private RadioButton male;
    private RadioButton female;
    private RadioButton others;
    private AppCompatEditText mobileNumber;
    private AppCompatEditText address;
    private AppCompatButton appCompatButton3;
    private LinearLayout patientListBlock;
    private RadioGroup radioGroupFilter;
    private RadioButton rbUhid;
    private RadioButton rbPatientUhid;
    private RadioButton rbPatientId;
    private RadioButton rbName;
    private TextInputEditText search;
    private RecyclerView rcUserlist;
    private AppCompatButton btn_next;

    SearchUserAdapter adapter;
    ArrayList<UserModels> itemlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_patient);

        imageView8 = (ImageView) findViewById(R.id.imageView8);
        linearLayout3 = (LinearLayout) findViewById(R.id.linearLayout3);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        rbNewpatient = (RadioButton) findViewById(R.id.rb_newpatient);
        rbExisting = (RadioButton) findViewById(R.id.rb_existing);
        newPatientBlock = (LinearLayout) findViewById(R.id.new_patient_block);
        linearLayout4 = (LinearLayout) findViewById(R.id.linearLayout4);
        uhid = (AppCompatEditText) findViewById(R.id.uhid);
        patientId = (AppCompatEditText) findViewById(R.id.patient_id);
        fullname = (AppCompatEditText) findViewById(R.id.fullname);
        age = (AppCompatEditText) findViewById(R.id.age);
        gender = (RadioGroup) findViewById(R.id.gender);
        male = (RadioButton) findViewById(R.id.male);
        female = (RadioButton) findViewById(R.id.female);
        others = (RadioButton) findViewById(R.id.others);
        mobileNumber = (AppCompatEditText) findViewById(R.id.mobileNumber);
        address = (AppCompatEditText) findViewById(R.id.address);
        appCompatButton3 = (AppCompatButton) findViewById(R.id.appCompatButton3);
        patientListBlock = (LinearLayout) findViewById(R.id.patient_list_block);
        radioGroupFilter = (RadioGroup) findViewById(R.id.radioGroup_filter);
        rbUhid = (RadioButton) findViewById(R.id.rb_uhid);
        rbPatientUhid = (RadioButton) findViewById(R.id.rb_patient_uhid);
        rbPatientId = (RadioButton) findViewById(R.id.rb_patient_id);
        rbName = (RadioButton) findViewById(R.id.rb_name);
        search = (TextInputEditText) findViewById(R.id.search);
        rcUserlist = (RecyclerView) findViewById(R.id.rc_userlist);
        btn_next = (AppCompatButton) findViewById(R.id.btn_next);

        rcUserlist.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        newPatientBlock.setVisibility(View.VISIBLE);
        patientListBlock.setVisibility(View.GONE);

        adapter = new SearchUserAdapter(itemlist, AddPatientActivity.this, getApplicationContext());
        rcUserlist.setAdapter(adapter);
        rcUserlist.setHasFixedSize(true);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rb_newpatient) {
                    newPatientBlock.setVisibility(View.VISIBLE);
                    patientListBlock.setVisibility(View.GONE);
                } else if (checkedId == R.id.rb_existing) {
                    newPatientBlock.setVisibility(View.GONE);
                    patientListBlock.setVisibility(View.VISIBLE);
                } else {
                    newPatientBlock.setVisibility(View.VISIBLE);
                    patientListBlock.setVisibility(View.GONE);
                }
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddPatientActivity.this, PatientProfileUpdateActivity.class);
                startActivity(intent);
            }
        });
    }
}