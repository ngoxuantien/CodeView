package com.example.codeview.view;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.example.codeview.FragmentDanhBaPageAdapter;
import com.example.codeview.R;
import com.example.codeview.adapter.CommentAdapter;

import com.example.codeview.databinding.LayoutBottomSheetFragmentBinding;
import com.example.codeview.databinding.LayoutBottomSheetReport2FragmentBinding;
import com.example.codeview.fragment.ReportFragment;
import com.example.codeview.model.comment.Comment;
import com.example.codeview.viewmodel.CommentViewModel;
import com.example.codeview.viewmodel.VideoUserViewModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetReportFragment extends BottomSheetDialogFragment {



    private LayoutBottomSheetReport2FragmentBinding layoutBottomSheetReport2FragmentBinding;
    public static BottomSheetReportFragment newInstance() {
        BottomSheetReportFragment myBottonSheetDialogFragment = new BottomSheetReportFragment();

        return myBottonSheetDialogFragment;

    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        bottomSheetDialog = new BottomSheetDialog(getContext(), R.style.BottomSheetDialogTheme);

        layoutBottomSheetReport2FragmentBinding = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.layout_bottom_sheet_report_2_fragment, null, false);

        View view = LayoutInflater.from(getContext()).inflate(R.layout.layout_bottom_sheet_report_2_fragment,null);

        bottomSheetDialog.setContentView(view);
        ViewPager viewPager = view.findViewById(R.id.viewpager);

      FragmentDanhBaPageAdapter fragmentDanhBaPageAdapter = new FragmentDanhBaPageAdapter(getChildFragmentManager(), FragmentDanhBaPageAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(fragmentDanhBaPageAdapter);
        bottomSheetDialog.setContentView(layoutBottomSheetReport2FragmentBinding.getRoot());
        return bottomSheetDialog;
    }






}

