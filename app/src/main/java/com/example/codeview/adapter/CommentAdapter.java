package com.example.codeview.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.codeview.R;
import com.example.codeview.model.Comment;

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
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_comment, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CommentAdapter.ViewHolder holder, int position) {

        final int[] i = {1};
        //  Glide.with(context).load(commentList.get(position).getCommentImage()).into(holder.commentImage);
        holder.commentName.setText(commentList.get(position).getCommentName());
        holder.commentTime.setText(commentList.get(position).getCommentTime());
        holder.commentContent.setText(commentList.get(position).getCommentContent());
        holder.commentLike.setText(commentList.get(position).getCommentLike() + "");
        holder.collapse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (i[0] == 1) {
                    holder.recyclerViewResponse.setVisibility(View.GONE);
                    i[0] = 2;
                } else {
                    holder.recyclerViewResponse.setVisibility(View.VISIBLE);
                    i[0] = 1;
                }

            }
        });
        if (commentList.get(position).getReponsList() != null) {

            setListCommentResponseRecyclervew(holder.recyclerViewResponse, commentList.get(position).getReponsList());
            holder.collapse.setText("Ver respuestas (" + commentList.get(position).getReponsList().size() + ")");
        } else {
            holder.collapse.setVisibility(View.GONE);
            holder.itemCollapse.setVisibility(View.GONE);
        }

        // đưa id của comment cha lên sesson
        holder.commentResponse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = view.getContext().getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("commentId",commentList.get(position).getCommentId()+"");
                editor.commit();
            }
        });

    }

    @Override
    public int getItemCount() {
        return commentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerViewResponse;
        ImageView commentImage, itemCollapse;
        TextView commentName, commentContent, commentTime, commentLike, collapse, commentResponse;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerViewResponse = itemView.findViewById(R.id.recyclerviewResponse);
            commentName = itemView.findViewById(R.id.commentName);
            collapse = itemView.findViewById(R.id.collapse);
            commentImage = itemView.findViewById(R.id.commentimage);
            commentContent = itemView.findViewById(R.id.commentContent);
            commentTime = itemView.findViewById(R.id.commentTime);
            commentLike = itemView.findViewById(R.id.commentLike);
            itemCollapse = itemView.findViewById(R.id.iconCollapse);
            commentResponse = itemView.findViewById(R.id.commentResponse);

        }

    }

    public void setListCommentResponseRecyclervew(RecyclerView recyclervew, List<Comment> commentList) {
        recyclervew.setNestedScrollingEnabled(false);
        CommentResponseAdapter commentResponseAdapter = new CommentResponseAdapter(context, commentList);
        recyclervew.setLayoutManager(new LinearLayoutManager(context, RecyclerView.VERTICAL, false));
        recyclervew.setAdapter(commentResponseAdapter);
    }

}
