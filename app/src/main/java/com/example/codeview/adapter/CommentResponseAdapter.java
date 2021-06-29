package com.example.codeview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;

import com.example.codeview.R;
import com.example.codeview.databinding.ItemResponseCommentBinding;
import com.example.codeview.model.comment.Comment;
import com.example.codeview.model.comment.Datum;
import com.example.codeview.view.BottomSheetReportFragment;
import com.example.codeview.view.MyBottonSheetDialogFragment;
import com.example.codeview.viewmodel.CommentViewModel;

import java.util.List;

public class CommentResponseAdapter extends RecyclerView.Adapter<CommentResponseAdapter.ViewHolder> {
    private Context context;
    private List<Datum> commentListResponse;
    private CommentViewModel commentViewModel;

    public CommentResponseAdapter(Context context, List<Datum> commentListResponse) {
        this.context = context;
        this.commentListResponse = commentListResponse;
    }

    @NonNull
    @Override
    public CommentResponseAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemResponseCommentBinding itemResponseCommentBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_response_comment, parent, false);
        return new ViewHolder(itemResponseCommentBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CommentResponseAdapter.ViewHolder holder, int position) {

        //   Glide.with(context).load(commentListResponse.get(position).getCommentImage()).into(holder.commentImage);
        holder.itemResponseCommentBinding.setComment(commentListResponse.get(position));
        commentViewModel = new ViewModelProvider((ViewModelStoreOwner) context).get(CommentViewModel.class);
        if (commentListResponse.get(position).getIsLike() == 1) {
            holder.itemResponseCommentBinding.setIsLike(1);
        }else {
            holder.itemResponseCommentBinding.setIsLike(0);
        }
        holder.itemResponseCommentBinding.setClickReport(() -> {
            // thêm dữ liệu để biết trường idComment
            commentViewModel.setIdCommentReport(commentListResponse.get(position).getIdComment());
            BottomSheetReportFragment bottomSheetReportFragment = BottomSheetReportFragment.newInstance();
            bottomSheetReportFragment.show(((AppCompatActivity) context).getSupportFragmentManager(), bottomSheetReportFragment.getTag());
        });
    }

    @Override
    public int getItemCount() {
        return commentListResponse.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemResponseCommentBinding itemResponseCommentBinding;

        public ViewHolder(@NonNull ItemResponseCommentBinding binding) {
            super(binding.getRoot());
            this.itemResponseCommentBinding = binding;


        }

        public void bind(Object obj) {
            itemResponseCommentBinding.executePendingBindings();
        }
    }
}
