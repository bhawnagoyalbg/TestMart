package com.dw.testmart.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dw.testmart.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TestReportSummary extends Fragment {

    public TestReportSummary() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test_report_summary, container, false);
    }
}
