package com.example.codeview.repository;

import android.view.View;

import com.example.codeview.api.ApiClient;
import com.example.codeview.api.ApiInterface;
import com.example.codeview.model.VideoAcount;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MovieRepository {

public VideoAcount getMoview(View view){
    ApiInterface apiInterface = ApiClient.getIntance().create(ApiInterface.class);
    final VideoAcount[] videoAcount34 = {new VideoAcount()};
    apiInterface.getPost().enqueue(new Callback<VideoAcount>() {
        @Override
        public void onResponse(Call<VideoAcount> call, Response<VideoAcount> response) {
        videoAcount34[0] = (VideoAcount)response.body();
        }
        @Override
        public void onFailure(Call<VideoAcount> call, Throwable t) {

        }
    });
    return videoAcount34[0];
}
}
