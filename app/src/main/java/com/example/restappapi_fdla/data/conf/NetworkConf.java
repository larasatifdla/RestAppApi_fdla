package com.example.restappapi_fdla.data.conf;

import com.example.restappapi_fdla.data.service.ApiService;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkConf {
    public static ApiService getApiService() {return createRetrofit().create(ApiService.class); }

    public static Retrofit createRetrofit(){
        return new Retrofit.Builder()
                .baseUrl("https://hzvsuhsnesumwjeozzao.supabase.co/rest/").addConverterFactory(GsonConverterFactory.create())
                .client(createOkHttpClient())
                .build();
    }

    public static OkHttpClient createOkHttpClient(){
        return new OkHttpClient.Builder().readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS).build();
    }
}
