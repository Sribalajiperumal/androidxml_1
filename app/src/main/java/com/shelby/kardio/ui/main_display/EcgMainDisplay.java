package com.shelby.kardio.ui.main_display;

import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shelby.kardio.R;
import com.shelby.kardio.patient.AddPatientActivity;

public class EcgMainDisplay extends Fragment {

    private EcgMainDisplayViewModel mViewModel;

    public static EcgMainDisplay newInstance() {
        return new EcgMainDisplay();
    }

    AppCompatButton select_patient;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.ecg_main_display_fragment, container, false);

        select_patient = root.findViewById(R.id.select_patient);

        select_patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddPatientActivity.class);
                startActivity(intent);
            }
        });
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(EcgMainDisplayViewModel.class);
        // TODO: Use the ViewModel
    }

}