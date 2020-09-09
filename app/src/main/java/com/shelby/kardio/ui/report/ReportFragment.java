package com.shelby.kardio.ui.report;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.shelby.kardio.R;

public class ReportFragment extends Fragment {

    private ReportViewModel mViewModel;

    public static ReportFragment newInstance() {
        return new ReportFragment();
    }

    private LinearLayout linearLayout3;
    private RadioGroup radioGroup;
    private RadioButton rbReport;
    private RadioButton rbLog;
    private NestedScrollView nestedContent;
    private LinearLayout reportBlock;
    private AppCompatEditText address;
    private AppCompatEditText description;
    private AppCompatButton appCompatButton3;
    private LinearLayout logBlock;
    private AppCompatEditText issueSummary;
    private AppCompatButton btnSubmit;


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.report_fragment, container, false);
        linearLayout3 = (LinearLayout) view.findViewById(R.id.linearLayout3);
        radioGroup = (RadioGroup) view.findViewById(R.id.radioGroup);
        rbReport = (RadioButton) view.findViewById(R.id.rb_report);
        rbLog = (RadioButton) view.findViewById(R.id.rb_log);
        nestedContent = (NestedScrollView) view.findViewById(R.id.nested_content);
        reportBlock = (LinearLayout) view.findViewById(R.id.report_block);
        address = (AppCompatEditText) view.findViewById(R.id.address);
        description = (AppCompatEditText) view.findViewById(R.id.description);
        appCompatButton3 = (AppCompatButton) view.findViewById(R.id.appCompatButton3);
        logBlock = (LinearLayout) view.findViewById(R.id.log_block);
        issueSummary = (AppCompatEditText) view.findViewById(R.id.issue_summary);
        btnSubmit = (AppCompatButton) view.findViewById(R.id.btnSubmit);

        rbReport.setChecked(true);

        reportBlock.setVisibility(View.VISIBLE);
        logBlock.setVisibility(View.GONE);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rb_report) {
                    reportBlock.setVisibility(View.VISIBLE);
                    logBlock.setVisibility(View.GONE);
                } else if (checkedId == R.id.rb_log) {
                    reportBlock.setVisibility(View.GONE);
                    logBlock.setVisibility(View.VISIBLE);
                } else {
                    reportBlock.setVisibility(View.VISIBLE);
                    logBlock.setVisibility(View.GONE);
                }
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(ReportViewModel.class);
        // TODO: Use the ViewModel
    }

}