package com.example.arjun27.retrofitapi;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory {
    static String API_BASE_URL = "https://jsonplaceholder.typicode.com";

    static  HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY);


    static OkHttpClient.Builder httpClient = new OkHttpClient.Builder().addInterceptor(interceptor).addInterceptor(new Interceptor() {
           @Override
           public Response intercept(Chain chain) throws IOException {
               Request original = chain.request();

               Request request = original.newBuilder()
                       .header("User-Agent", "Your-App-Name")
                       .header("Accept", "application/vnd.yourapi.v1.full+json")
                       .method(original.method(), original.body())
                       .build();

               return chain.proceed(request);
           }
       });


    static  Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(
                            GsonConverterFactory.create()
                    );



    static Retrofit retrofit = builder.client(httpClient.build()).build();



    public static GETAPI getapi() {
       return retrofit.create(GETAPI.class);
    }


}
