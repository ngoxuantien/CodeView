package com.example.codeview.view;

import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.codeview.R;
import com.example.codeview.adapter.CommentAdapter;

import com.example.codeview.databinding.LayoutBottomSheetFragmentBinding;
import com.example.codeview.model.comment.Datum;
import com.example.codeview.viewmodel.CommentViewModel;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.List;

public class MyBottonSheetDialogFragment extends BottomSheetDialogFragment {
    private CommentViewModel commentViewModel;
    LayoutBottomSheetFragmentBinding layoutBottomSheetFragmentBinding;
    private Handler handler;

    public static MyBottonSheetDialogFragment newInstance() {
        MyBottonSheetDialogFragment myBottonSheetDialogFragment = new MyBottonSheetDialogFragment();

        return myBottonSheetDialogFragment;

    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        bottomSheetDialog = new BottomSheetDialog(getContext(), R.style.BottomSheetDialogTheme);

        layoutBottomSheetFragmentBinding = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.layout_bottom_sheet_fragment, null, false);
        commentViewModel = new ViewModelProvider(requireActivity()).get(CommentViewModel.class);
     // cái cũ



        commentViewModel.getCommentsParent("1");
     //   commentViewModel.getComment("1");



        bottomSheetDialog.setContentView(layoutBottomSheetFragmentBinding.getRoot());

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                change();
            }
        }, 350);

        return bottomSheetDialog;

    }



    private void change() {
        commentViewModel.commentsParent.observe(this,comment -> setRecyclerView(comment.getData()));
    }

    private void setRecyclerView(List<Datum> list) {
        layoutBottomSheetFragmentBinding.setAdapter(new CommentAdapter(getContext(), list));
    }

    private void setPostComment() {

    }

}

