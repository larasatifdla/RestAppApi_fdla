package com.example.restappapi_fdla.data.service;

import com.example.restappapi_fdla.data.model.Todo;

import java.util.ArrayList;

import okhttp3.Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiService {

    @Headers({"Cache-Control: max-age=640000",
            "apikey: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoic2VydmljZV9yb2xlIiwiaWF0IjoxNjMzMDU3NzMyLCJleHAiOjE5NDg2MzM3MzJ9.T-LBle1dYWybilSCDbz3sUDGwzzbIDgIYU3AXXQLbH8",
            "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoic2VydmljZV9yb2xlIiwiaWF0IjoxNjMzMDU3NzMyLCJleHAiOjE5NDg2MzM3MzJ9.T-LBle1dYWybilSCDbz3sUDGwzzbIDgIYU3AXXQLbH8"
    })
    @GET("v1/Todo")
    Call<ArrayList<Todo>> requestListTodo(@Query("select") String value);
}
