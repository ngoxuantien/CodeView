package com.example.codeview.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.codeview.R;
import com.example.codeview.databinding.LayoutReport2Binding;

public class LayoutReport2 extends Fragment {
    private LayoutReport2Binding layoutReport2Binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layoutReport2Binding = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.layout_report2, null, false);
        layoutReport2Binding.setReport2(this);
        return layoutReport2Binding.getRoot();

    }

    public void movedOn() {

        Fragment send = new LayoutReport3();
        getFragmentManager().beginTransaction().replace(R.id.fragment, send).addToBackStack(null).commit();
    }
    public void backOn() {
        Fragment send = new LayoutReport1();
        getFragmentManager().beginTransaction().replace(R.id.fragment, send).addToBackStack(null).commit();
    }

}
