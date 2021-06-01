package com.example.codeview.view;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.codeview.R;
import com.example.codeview.adapter.CommentAdapter;
import com.example.codeview.model.Comment;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.List;

public class MyBottonSheetDialogFragment extends BottomSheetDialogFragment {
    private RecyclerView recyclerView;
    private List<Comment> commentList;
    private List<Comment> responselist;
    private List<Comment> test;
    CommentAdapter commentAdapter;
    ImageView commentSend ;
    String name;
    TextView commentText ;

    public static MyBottonSheetDialogFragment newInstance() {
        MyBottonSheetDialogFragment myBottonSheetDialogFragment = new MyBottonSheetDialogFragment();

        return myBottonSheetDialogFragment;

    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        bottomSheetDialog = new BottomSheetDialog(getContext(),
                R.style.BottomSheetDialogTheme);
        View viewDialog = LayoutInflater.from(getContext()).inflate(R.layout.layout_bottom_sheet_fragment, null);

       commentSend = viewDialog.findViewById(R.id.sendText);

      commentText = viewDialog.findViewById(R.id.commentText);


        responselist = new ArrayList<>();
        responselist.add(new Comment(3, 4, 5, 3, "h", "hohohl", "23"));
        responselist.add(new Comment(3, 4, 5, 3, "h", "hohohl", "23"));
        responselist.add(new Comment(3, 4, 5, 3, "h", "hohohl", "23"));
        responselist.add(new Comment(3, 4, 5, 3, "h", "hohohl", "23"));
        responselist.add(new Comment(3, 4, 5, 3, "h", "hohohl", "23"));
        responselist.add(new Comment(3, 4, 5, 3, "h", "hohohl", "23"));
        responselist.add(new Comment(3, 4, 5, 3, "h", "hohohl", "23"));
        responselist.add(new Comment(3, 4, 5, 3, "h", "hohohl", "23"));
        test = null;
        commentList = new ArrayList<>();
        commentList.add(new Comment(3, 4, 5, 3, "hoahoah", "hohohl", "23", responselist));
        commentList.add(new Comment(4, 4, 5, 3, "h", "hohohl", "23", responselist));
        commentList.add(new Comment(5, 4, 5, 3, "h", "hohohl", "23", test));

        recyclerView = viewDialog.findViewById(R.id.comments_list);

        setRecyclerviewComment(recyclerView, commentList);


        bottomSheetDialog.setContentView(viewDialog);
        commentSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                commentList.get(1).getReponsList().add(new Comment(3, 4, 5, 3, "h", commentText.getText().toString(), "23"));
                commentAdapter.notifyDataSetChanged();
//                for(int i=0;i<commentList.size();i++){
//                    if(name.equals(commentList.get(i).getCommentId()+"")){
//
//                    }
//                }
            }
        });
        return bottomSheetDialog;

    }
    private void setPostComment(){

    }

    private void setRecyclerviewComment(RecyclerView recyclerView, List<Comment> commentList) {
       commentAdapter = new CommentAdapter(getContext(), commentList);


        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(commentAdapter);

    }
}

