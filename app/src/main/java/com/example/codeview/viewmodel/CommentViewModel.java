package com.example.codeview.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.codeview.model.comment.Comment;
import com.example.codeview.model.comment.Datum;
import com.example.codeview.repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;

public class CommentViewModel extends AndroidViewModel {


    public MutableLiveData<Comment> commentsParent = new MutableLiveData<>();
    public MutableLiveData<Comment> comment = new MutableLiveData<>();
    public MutableLiveData<String> idCommentParent= new MutableLiveData<>();
    private MovieRepository movieRepository = new MovieRepository();

    private Comment commentadd;


    public CommentViewModel(@NonNull Application application) {
        super(application);
    }


    public void getCommentsParent(String id) {
        commentsParent = movieRepository.getCommentsParent(id);

    }

    public void getComment(String id) {
        comment = movieRepository.getComment(id);
    }

    public void setIdCommentParent(String id){
        idCommentParent.setValue(id);
    }


    public void addComment(Comment comment) {
        Datum datum = new Datum(5, "haohaoahoahaoaoha", 2, "", "", "",null,null);
        List<Datum> list = comment.getData();
        list.add(datum);
        comment.setData(list);
        commentsParent.setValue(comment);
    }

}
