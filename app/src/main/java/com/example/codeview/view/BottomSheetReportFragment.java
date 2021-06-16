package com.example.codeview.view;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.codeview.R;
import com.example.codeview.adapter.CommentAdapter;
import com.example.codeview.databinding.LayoutBottomSheetFragmentBinding;
import com.example.codeview.model.comment.Comment;
import com.example.codeview.viewmodel.CommentViewModel;
import com.example.codeview.viewmodel.VideoUserViewModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetReportFragment extends BottomSheetDialogFragment {


    private CommentAdapter commentAdapter;
    private View view;


    public static BottomSheetReportFragment newInstance() {
        BottomSheetReportFragment myBottonSheetDialogFragment = new BottomSheetReportFragment();

        return myBottonSheetDialogFragment;

    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        bottomSheetDialog = new BottomSheetDialog(getContext(), R.style.BottomSheetDialogTheme);
       view = LayoutInflater.from(getContext()).inflate(R.layout.layout_bottom_sheet_report_2_fragment,null);
        bottomSheetDialog.setContentView(view);







        return bottomSheetDialog;

    }









}

