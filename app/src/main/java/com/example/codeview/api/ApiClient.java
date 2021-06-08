package com.example.codeview.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
public static Retrofit retrofit;

public static Retrofit getIntance(){
    if (retrofit==null){
        retrofit = new Retrofit.Builder().baseUrl("http://192.168.1.88:9999/api/v1/").addConverterFactory(GsonConverterFactory.create()).build();

    }
    return retrofit;
}
}
