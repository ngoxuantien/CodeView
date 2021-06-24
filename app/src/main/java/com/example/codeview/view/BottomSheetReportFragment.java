package com.example.codeview.view;

import android.app.Dialog;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.codeview.LayoutReport1;
import com.example.codeview.LayoutReport3;
import com.example.codeview.R;


import com.example.codeview.databinding.LayoutBottomSheetReportFragmentBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetReportFragment extends BottomSheetDialogFragment {
private  BottomSheetDialog bottomSheetDialog;

    private LayoutBottomSheetReportFragmentBinding layoutBottomSheetReport2FragmentBinding;
private LayoutReport3 layoutReport3;
    public static BottomSheetReportFragment newInstance() {
        BottomSheetReportFragment myBottonSheetDialogFragment = new BottomSheetReportFragment();

        return myBottonSheetDialogFragment;

    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
      bottomSheetDialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        bottomSheetDialog = new BottomSheetDialog(getContext(), R.style.BottomSheetDialogTheme);

        return bottomSheetDialog;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layoutBottomSheetReport2FragmentBinding = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.layout_bottom_sheet_report_fragment, null, false);
        View view = LayoutInflater.from(getContext()).inflate(R.layout.layout_bottom_sheet_report_fragment, null);
        bottomSheetDialog.setContentView(view);


        ImageView imageView= view.findViewById(R.id.exit);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               bottomSheetDialog.dismiss();
            }
        });


        Fragment selectedFragment = new LayoutReport1();
        getChildFragmentManager().beginTransaction().replace(R.id.fragment, selectedFragment).commit();

        bottomSheetDialog.setContentView(layoutBottomSheetReport2FragmentBinding.getRoot());


        return view;
    }





}

