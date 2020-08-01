package com.shelby.kardio.ui.main_display;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shelby.kardio.R;

public class EcgMainDisplay extends Fragment {

    private EcgMainDisplayViewModel mViewModel;

    public static EcgMainDisplay newInstance() {
        return new EcgMainDisplay();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.ecg_main_display_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(EcgMainDisplayViewModel.class);
        // TODO: Use the ViewModel
    }

}