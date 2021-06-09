package com.example.codeview.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.codeview.model.comment.Comment;
import com.example.codeview.repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;

public class CommentViewModel extends AndroidViewModel {

    public MutableLiveData<Comment>commentsParent= new MutableLiveData<>();
    public MutableLiveData<Comment>comment= new MutableLiveData<>();
    private MovieRepository movieRepository = new MovieRepository();


    public CommentViewModel(@NonNull Application application) {
        super(application);
    }



    public void getCommentsParent(String id){
        commentsParent= movieRepository.getCommentsParent(id);
    }
    public void getComment(String id){
        comment= movieRepository.getComment(id);
    }


}
