package com.example.codeview.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.codeview.R;
import com.example.codeview.databinding.ItemCommentBinding;
import com.example.codeview.model.Comment;
import com.example.codeview.util.CustomClickListener;

import java.util.List;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder> {
    private Context context;
    private List<Comment> commentList;


    public CommentAdapter(Context context, List<Comment> commentList) {
        this.context = context;
        this.commentList = commentList;
    }

    @NonNull
    @Override
    public CommentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemCommentBinding itemCommentBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_comment, parent, false);

        return new ViewHolder(itemCommentBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CommentAdapter.ViewHolder holder, int position) {
        final Comment comment = commentList.get(position);
        final boolean[] h = {true};
        holder.itemCommentBinding.setComment(comment);
        holder.bind(comment);

        // set cuộn ra cuộn vào
        holder.itemCommentBinding.setClickCollape(() -> {
            if (h[0]) {
                holder.itemCommentBinding.setRoll(true);
                h[0] = false;
            } else {
                holder.itemCommentBinding.setRoll(false);
                h[0] = true;
            }
        });


        if (commentList.get(position).getReponsList() != null) {
            holder.itemCommentBinding.setView(true);
            // xét recyclerview
            holder.itemCommentBinding.setAdapter( new CommentResponseAdapter(context,commentList.get(position).getReponsList()));
            // set test số bình luận của list
            holder.itemCommentBinding.setNumberOfComment("Ver respuestas (" + commentList.get(position).getReponsList().size() + ")");
        } else {
            holder.itemCommentBinding.setView(false);

        }




    }

    @Override
    public int getItemCount() {
        return commentList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemCommentBinding itemCommentBinding;
     //   RecyclerView recyclerViewResponse;

        public ViewHolder(@NonNull ItemCommentBinding binding) {
            super(binding.getRoot());
            this.itemCommentBinding = binding;

        }

        //// cần tìm hiểu thêm///
        public void bind(Object obj) {
            itemCommentBinding.executePendingBindings();
        }

    }



}
