package com.example.codeview.view;

import android.app.Dialog;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import androidx.viewpager.widget.ViewPager;

import com.example.codeview.FragmentDanhBaPageAdapter;
import com.example.codeview.R;


import com.example.codeview.databinding.LayoutBottomSheetReportFragmentBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetReportFragment extends BottomSheetDialogFragment {

private ViewPager viewPager;

    private LayoutBottomSheetReportFragmentBinding layoutBottomSheetReport2FragmentBinding;
    public static BottomSheetReportFragment newInstance() {
        BottomSheetReportFragment myBottonSheetDialogFragment = new BottomSheetReportFragment();

        return myBottonSheetDialogFragment;

    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        bottomSheetDialog = new BottomSheetDialog(getContext(), R.style.BottomSheetDialogTheme);
        return bottomSheetDialog;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        bottomSheetDialog = new BottomSheetDialog(getContext(), R.style.BottomSheetDialogTheme);

        layoutBottomSheetReport2FragmentBinding = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.layout_bottom_sheet_report_fragment, null, false);

        View view = LayoutInflater.from(getContext()).inflate(R.layout.layout_bottom_sheet_report_fragment,null);

        bottomSheetDialog.setContentView(view);
      viewPager = view.findViewById(R.id.viewpager);

        FragmentDanhBaPageAdapter fragmentDanhBaPageAdapter = new FragmentDanhBaPageAdapter(getChildFragmentManager(), FragmentDanhBaPageAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(fragmentDanhBaPageAdapter);
          viewPager.beginFakeDrag();
        bottomSheetDialog.setContentView(layoutBottomSheetReport2FragmentBinding.getRoot());
        return view;
    }
    public void chuyentrang(){
        viewPager.setCurrentItem(1);
    }

//    @NonNull
//    @Override
//    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
//
//    }






}

