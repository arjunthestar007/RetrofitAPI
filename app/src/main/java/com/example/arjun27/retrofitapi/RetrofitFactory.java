package com.example.arjun27.retrofitapi;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory {
    static  String API_BASE_URL = "https://jsonplaceholder.typicode.com";

    static HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY);


    static   OkHttpClient.Builder httpClient = new OkHttpClient.Builder().addInterceptor(interceptor);


    static  Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(
                            GsonConverterFactory.create()
                    );

    static Retrofit retrofit = builder.client(httpClient.build()).build();



    public static GETAPI getapi() {
        GETAPI client = retrofit.create(GETAPI.class);
        return client;
    }


}
