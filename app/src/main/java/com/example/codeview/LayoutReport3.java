package com.example.codeview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.codeview.databinding.LayoutReport3Binding;
import com.example.codeview.view.BottomSheetReportFragment;

public class LayoutReport3 extends Fragment {

    private LayoutReport3Binding layoutReport3Binding;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        layoutReport3Binding = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.layout_report3, null, false);
        layoutReport3Binding.setReport3(this);
        return layoutReport3Binding.getRoot();
    }

    public void backOn() {
        Fragment send = new LayoutReport2();
        getFragmentManager().beginTransaction().replace(R.id.fragment, send).addToBackStack(null).commit();
    }
    public void back(){

        // lấy fragment cha và trỏ vào thuộc tính của nó
        ((BottomSheetReportFragment) getParentFragment()).dismiss();
    }

}
