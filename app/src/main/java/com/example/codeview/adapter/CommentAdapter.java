package com.example.codeview.adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;

import com.example.codeview.R;
import com.example.codeview.databinding.ItemCommentBinding;
import com.example.codeview.model.comment.Comment;
import com.example.codeview.model.comment.Datum;
import com.example.codeview.view.MyBottonSheetDialogFragment;
import com.example.codeview.viewmodel.CommentViewModel;
import com.example.codeview.viewmodel.VideoUserViewModel;

import java.util.List;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder> {
    private Context context;
    private List<Datum> commentList;
    private CommentViewModel commentViewModel;
    private List<Datum> commentResponse;
    private Handler handler;

    public CommentAdapter(Context context, List<Datum> commentList) {
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
        final Datum comment = commentList.get(position);
        final boolean[] h = {true};
        holder.itemCommentBinding.setComment(comment);
        holder.bind(comment);
        // set list comment con luôn đóng
        holder.itemCommentBinding.setRoll(true);
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
        commentViewModel = new ViewModelProvider((ViewModelStoreOwner) context).get(CommentViewModel.class);
        commentViewModel.getComment(commentList.get(position).getIdComment() + "");



        //////////////////////////////////////////////////////////////////////////////////////////////
        commentViewModel.setIdCommentParent(commentList.get(position).getIdComment()+"");
        holder.itemCommentBinding.setClickResponse(()->{
            // set id coment cha vào livedata
            commentViewModel.setIcCommentResponse(commentList.get(position).getIdComment() + "");
            Toast toast=Toast.makeText(context, "thử nhiệm test",   Toast.LENGTH_SHORT);
            toast.show();
        //
        });
        //////////////////////////////////////////////////////////////////////////////////////////////////////////



        commentViewModel.comment.observe((LifecycleOwner) context, new Observer<Comment>() {
            @Override
            public void onChanged(Comment comment) {
                commentResponse =comment.getData();
                if(commentViewModel.getIdCommentResponse().equals(commentList.get(position).getIdComment() + "")){

                   commentResponse.add(commentViewModel.getCommentAdd());
                }
                if (commentResponse.size() != 0) {
                    holder.itemCommentBinding.setView(true);
                    // xét recyclerview
                    holder.itemCommentBinding.setAdapter(new CommentResponseAdapter(context, commentResponse));
                    // set test số bình luận của list
                    holder.itemCommentBinding.setNumberOfComment("Ver respuestas (" + commentResponse.size() + ")");
                } else {
                    holder.itemCommentBinding.setView(false);

                }
            }
        });




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
        public void hideKeyboard(Activity activity) {
            InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
            //Find the currently focused view, so we can grab the correct window token from it.
            View view = activity.getCurrentFocus();
            //If no view currently has focus, create a new one, just so we can grab a window token from it
            if (view == null) {
                view = new View(activity);
            }
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }

    }


}
