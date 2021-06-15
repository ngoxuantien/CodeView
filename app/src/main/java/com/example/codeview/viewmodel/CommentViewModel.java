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

    // id comment cha và comment thêm
    public MutableLiveData<Datum>commentAdd= new MutableLiveData<>();
    public MutableLiveData<String>idCommentRespons= new MutableLiveData<>();

    private MovieRepository movieRepository = new MovieRepository();



    public CommentViewModel(@NonNull Application application) {
        super(application);
    }


    public void getCommentsParent(String id) {
        commentsParent = movieRepository.getCommentsParent(id);

    }
    public void setIcCommentResponse(String id){
        idCommentRespons.setValue(id);

    }
    public String getIdCommentResponse(){
     return  idCommentRespons.getValue();
    }
    public Datum getCommentAdd(){
        return commentAdd.getValue();
    }

    public void getComment(String id) {
        comment = movieRepository.getComment(id);
    }

    public void setIdCommentParent(String id){
        idCommentParent.setValue(id);
    }



    public void addComment() {
        String id= "";
        id= idCommentRespons.getValue();
        Datum datum = new Datum(5, "haohaoahoahaoaoha", 2, "", "", "",null,null);


        if(id.equals("0")!=true){
            commentAdd.setValue(datum);
            Comment commentRespons= comment.getValue();
            List<Datum> list = commentRespons.getData();
            list.add(datum);
            commentRespons.setData(list);
          comment.setValue(commentRespons);
        }else {
            Comment comment= commentsParent.getValue();
            List<Datum> list = comment.getData();
            list.add(0,datum);
            comment.setData(list);
            commentsParent.setValue(comment);

        }



    }


}
