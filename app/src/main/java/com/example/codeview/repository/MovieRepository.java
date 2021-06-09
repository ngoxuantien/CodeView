package com.example.codeview.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.codeview.api.ApiClient;
import com.example.codeview.api.ApiInterface;
import com.example.codeview.model.Video.VideoAcount;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MovieRepository {

    private ApiInterface apiInterface;

//    public VideoAcount getMoview(View view) {
//        ApiInterface apiInterface = ApiClient.getIntance().create(ApiInterface.class);
//        final VideoAcount[] videoAcount34 = {new VideoAcount()};
//        apiInterface.getPost().enqueue(new Callback<VideoAcount>() {
//            @Override
//            public void onResponse(Call<VideoAcount> call, Response<VideoAcount> response) {
//                if (response.isSuccessful()) {
//                    videoAcount34[0] = response.body();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<VideoAcount> call, Throwable t) {
//
//            }
//        });
//        return videoAcount34[0];
//    }

    public MovieRepository() {
        apiInterface = ApiClient.getIntance().create(ApiInterface.class);
    }

    public MutableLiveData<VideoAcount> getVideo() {
        MutableLiveData<VideoAcount> videoAcountMutableLiveData = new MutableLiveData<>();
        apiInterface.getPost().enqueue(new Callback<VideoAcount>() {
            @Override
            public void onResponse(Call<VideoAcount> call, Response<VideoAcount> response) {
                if (response.isSuccessful()) {
                    videoAcountMutableLiveData.setValue(response.body());
                    Log.d("erro",response.body().getData().getLinkVideo());
                }
            }
            @Override
            public void onFailure(Call<VideoAcount> call, Throwable t) {

            }
        });
        return videoAcountMutableLiveData;
    }


}
