package com.example.arjun27.retrofitapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

public interface HeaderAPI {


    // static custom header

    @Headers({
            "User-Agent :APP name",
            "Accept:appilikcation+jspn"
    })
    @GET("/posts")
    Call<List<Category>> getapi();


    // dynamic  header

    public interface UserService {
        @GET("/tasks")
        Call<List<Task>> getTasks(@Header("Content-Range") String contentRange);
    }

}
