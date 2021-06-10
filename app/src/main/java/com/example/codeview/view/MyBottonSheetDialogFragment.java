package com.example.codeview.view;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.codeview.R;
import com.example.codeview.adapter.CommentAdapter;

import com.example.codeview.databinding.LayoutBottomSheetFragmentBinding;
import com.example.codeview.model.comment.Comment;
import com.example.codeview.model.comment.Datum;
import com.example.codeview.viewmodel.CommentViewModel;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.List;

public class MyBottonSheetDialogFragment extends BottomSheetDialogFragment {
    private CommentViewModel commentViewModel;
    LayoutBottomSheetFragmentBinding layoutBottomSheetFragmentBinding;
    private CommentAdapter commentAdapter;
    private  Comment commentcha;

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
layoutBottomSheetFragmentBinding.setComment(MyBottonSheetDialogFragment.this);

        bottomSheetDialog.setContentView(layoutBottomSheetFragmentBinding.getRoot());


        change();

        return bottomSheetDialog;

    }


    private void change() {
        commentViewModel.commentsParent.observe(this, new Observer<Comment>() {
            @Override
            public void onChanged(Comment comment) {
                commentAdapter= new CommentAdapter(getContext(),comment.getData());
                layoutBottomSheetFragmentBinding.setAdapter(commentAdapter);
                commentcha= comment;
            }
        });


    }
    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    public void onclick(){

        commentViewModel.addComment(commentcha);

    }



}

