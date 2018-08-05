package com.example.arjun27.retrofitapi;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GETAPI {

    @GET("/posts")
    Call<List<Category>> getapi();

    @GET("/posts?id=30")
    Call<List<Category>> getapistatc();


    @GET("/posts")
    Call<List<Category>> getapiquery(@Query("id") String id);


    // multiple query param
    @GET("/posts")
    Call<List<Category>> getapimultiplequery(@Query("id") String id,@Query("userId") String userid);


    @POST("/tasks")
    Call<Task> gettask(@Body Task task);

    @GET("/tasks({id})")
    Call<Task> gettaskpath(@Path("id") long id);


    // raw response from okhttp
    @GET("/posts")
    Call<ResponseBody> getresponse();





}
