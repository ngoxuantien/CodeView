package com.example.codeview.view;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.InverseBindingAdapter;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.codeview.R;
import com.example.codeview.adapter.CommentAdapter;

import com.example.codeview.databinding.LayoutBottomSheetFragmentBinding;
import com.example.codeview.model.comment.Comment;
import com.example.codeview.viewmodel.CommentViewModel;
import com.example.codeview.viewmodel.VideoUserViewModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.sql.Time;

public class MyBottonSheetDialogFragment extends BottomSheetDialogFragment {
    private CommentViewModel commentViewModel;
    private VideoUserViewModel videoUserViewModel;
    LayoutBottomSheetFragmentBinding layoutBottomSheetFragmentBinding;
    private CommentAdapter commentAdapter;
    private View view;
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
       view = LayoutInflater.from(getContext()).inflate(R.layout.layout_bottom_sheet_fragment,null);
        bottomSheetDialog.setContentView(view);

        layoutBottomSheetFragmentBinding = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.layout_bottom_sheet_fragment, null, false);
        commentViewModel = new ViewModelProvider(requireActivity()).get(CommentViewModel.class);
        videoUserViewModel = new ViewModelProvider(requireActivity()).get(VideoUserViewModel.class);
        // cái cũ

        commentViewModel.getCommentsParent("1","3");
        commentViewModel.setIcCommentResponse("0");
        layoutBottomSheetFragmentBinding.setComment(MyBottonSheetDialogFragment.this);

        bottomSheetDialog.setContentView(layoutBottomSheetFragmentBinding.getRoot());

        change();

        return bottomSheetDialog;

    }


    private void change() {
        commentViewModel.commentsParent.observe(this, new Observer<Comment>() {
            @Override
            public void onChanged(Comment comment) {
                commentAdapter = new CommentAdapter(getContext(), comment.getData(),getActivity());
                layoutBottomSheetFragmentBinding.setAdapter(commentAdapter);
            }
        });
    }
public  void clickreport(){
    BottomSheetReportFragment bottomSheetReportFragment = BottomSheetReportFragment.newInstance();
    bottomSheetReportFragment.show((getActivity()).getSupportFragmentManager(), bottomSheetReportFragment.getTag());
}

    public void onclick() {

        commentViewModel.addComment( videoUserViewModel.getIdvideo(),3,commentViewModel.getinput());
        commentViewModel.getCommentsParent("1","3");
        change();


    }

}

