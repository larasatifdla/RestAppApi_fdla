package com.example.restappapi_fdla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.restappapi_fdla.data.conf.NetworkConf;
import com.example.restappapi_fdla.data.model.Todo;
import com.example.restappapi_fdla.data.service.ApiService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApiService apiService = NetworkConf.getApiService();
        apiService.requestListTodo("title.description").enqueue(new Callback<ArrayList<Todo>>() {
            @Override
            public void onResponse(Call<ArrayList<Todo>> call, Response<ArrayList<Todo>> response) {
                ArrayList<Todo> todos = response.body();
                Toast.makeText(MainActivity.this, "data dari server " + todos.size(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<ArrayList<Todo>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "terjadi kesalahan ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}