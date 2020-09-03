package com.shelby.kardio.ui.help;

import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.shelby.kardio.R;
import com.shelby.kardio.adapters.ResourceAdapter;
import com.shelby.kardio.models.resourceModels;
import com.shelby.kardio.patient.SelectPatientActivity;

import java.util.ArrayList;

public class HelpFragment extends Fragment {

    private HelpViewModel mViewModel;

    public static HelpFragment newInstance() {
        return new HelpFragment();
    }


    private NestedScrollView nestedContent;
    private ImageView imageView6;
    private TextView textView2;
    private TextView textView3;
    private RecyclerView rcResources;

    ResourceAdapter adapter;
    ArrayList<resourceModels> resourceModels;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.help_fragment, container, false);
        nestedContent = (NestedScrollView) view.findViewById(R.id.nested_content);
        imageView6 = (ImageView) view.findViewById(R.id.imageView6);
        textView2 = (TextView) view.findViewById(R.id.textView2);
        textView3 = (TextView) view.findViewById(R.id.textView3);
        rcResources = (RecyclerView) view.findViewById(R.id.rc_resources);

        resourceModels = new ArrayList<>();
        rcResources.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new ResourceAdapter(resourceModels, getActivity(), getContext());
        rcResources.setAdapter(adapter);
        rcResources.setHasFixedSize(true);
        adapter.notifyDataSetChanged();

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SelectPatientActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(HelpViewModel.class);
        // TODO: Use the ViewModel
    }

}