package com.example.codeview.viewmodel;

import android.app.Application;
import android.content.Intent;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.InverseBindingAdapter;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.codeview.model.comment.Comment;
import com.example.codeview.model.comment.CommentPost;
import com.example.codeview.model.comment.Datum;
import com.example.codeview.repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;

public class CommentViewModel extends AndroidViewModel {

    public static String inputComnet;
    public MutableLiveData<Comment> commentsParent = new MutableLiveData<>();
    public MutableLiveData<Comment> comment = new MutableLiveData<>();


    // id comment cha
    private MutableLiveData<String> idCommentRespons = new MutableLiveData<>();

    private MovieRepository movieRepository = new MovieRepository();


    public CommentViewModel(@NonNull Application application) {
        super(application);
    }


    public void getCommentsParent(String id) {
        commentsParent = movieRepository.getCommentsParent(id);

    }

    public void setIcCommentResponse(String id) {
        idCommentRespons.setValue(id);

    }

    public String getIdCommentResponse() {
        return idCommentRespons.getValue();
    }


    public void getComment(String id) {
        comment = movieRepository.getComment(id);
    }

    public String getinput() {
        return inputComnet;
    }

    public void addComment(int idVideo, int idUser, String content) {

        String id = "";
        id = idCommentRespons.getValue();


        if (id.equals("0") != true) {
            movieRepository.postComment(new CommentPost(content, "2", "0", idUser, idVideo, Integer.parseInt(id)));
            setIcCommentResponse("0");

        } else {
            movieRepository.postComment(new CommentPost(content, "1", "0", idUser, idVideo, 1));


        }


    }


}
