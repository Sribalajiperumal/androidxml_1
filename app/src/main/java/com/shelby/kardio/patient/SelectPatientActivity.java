package com.shelby.kardio.patient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;
import com.shelby.kardio.R;
import com.shelby.kardio.adapters.UserListAdapter;
import com.shelby.kardio.models.UserModels;

import java.util.ArrayList;

public class SelectPatientActivity extends AppCompatActivity {

    private TextView title;
    private ImageView imageView6;
    private TextView textView2;
    private TextView textView3;
    private NestedScrollView nestedContent;
    private LinearLayout linearLayout2;
    private TextInputLayout email;
    private RecyclerView rcPatient;

    ArrayList<UserModels> userModels;

    UserListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_patient);
        userModels = new ArrayList<>();
        title = (TextView) findViewById(R.id.title);
        imageView6 = (ImageView) findViewById(R.id.imageView6);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        nestedContent = (NestedScrollView) findViewById(R.id.nested_content);
        linearLayout2 = (LinearLayout) findViewById(R.id.linearLayout2);
        email = (TextInputLayout) findViewById(R.id.email);
        rcPatient = (RecyclerView) findViewById(R.id.rc_patient);


        rcPatient.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        adapter = new UserListAdapter(userModels, SelectPatientActivity.this, getApplicationContext());
        rcPatient.setAdapter(adapter);
        rcPatient.setHasFixedSize(true);

        adapter.notifyDataSetChanged();

    }

}