package com.example.codeview.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.codeview.model.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentViewModel extends AndroidViewModel {
    private List<Comment> commentList;
    private List<Comment> responselist;
    private List<Comment> test;
    public MutableLiveData<Comment> commentListMu = new MutableLiveData<>();


    public CommentViewModel(@NonNull Application application) {
        super(application);
    }

    public List<Comment> getComment() {
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

return commentList;
    }

    public void getListComment() {
for(Comment comment:getComment()){
    commentListMu.setValue(comment);
}

    }

}
