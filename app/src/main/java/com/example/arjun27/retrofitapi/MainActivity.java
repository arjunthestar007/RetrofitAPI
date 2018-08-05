package com.example.arjun27.retrofitapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        RetrofitFactory.getapi().getapi().enqueue(new Callback<List<Category>>() {
//            @Override
//            public void onResponse(Call<List<Category>> call, Response<List<Category>> response) {
//
//                Toast.makeText(MainActivity.this, ""+response.body(), Toast.LENGTH_SHORT).show();
//
//            }
//
//            @Override
//            public void onFailure(Call<List<Category>> call, Throwable t) {
//
//            }
//        });
//
//       RetrofitFactory.getapi().getapiquery("30").enqueue(new Callback<List<Category>>() {
//           @Override
//           public void onResponse(Call<List<Category>> call, Response<List<Category>> response) {
//
//           }
//
//           @Override
//           public void onFailure(Call<List<Category>> call, Throwable t) {
//
//           }
//       });

       RetrofitFactory.getapi().getresponse().enqueue(new Callback<ResponseBody>() {
           @Override
           public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

           }

           @Override
           public void onFailure(Call<ResponseBody> call, Throwable t) {

           }
       });


    }
}
