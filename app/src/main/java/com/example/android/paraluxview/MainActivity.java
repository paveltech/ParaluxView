package com.example.android.paraluxview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.yayandroid.parallaxrecyclerview.ParallaxRecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public ApiInterface apiInterface;
    String api_key = "";
    public ArrayList<ImageItem> imageItemArrayList = new ArrayList<>();
    public TestRecyclerAdapter adapter;
    ParallaxRecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
         recyclerView = (ParallaxRecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        loadFirst();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void loadFirst(){
        final Call<JsonResponce> songsResponceCall = apiInterface.getNewHindiSongs(1, api_key);
        //Log.d("url" , ""+songsResponceCall.request().url().toString());

        songsResponceCall.enqueue(new Callback<JsonResponce>() {
            @Override
            public void onResponse(Call<JsonResponce> call, Response<JsonResponce> response) {
                imageItemArrayList= response.body().getImageItemArrayList();
                adapter = new TestRecyclerAdapter(getApplicationContext() , imageItemArrayList);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<JsonResponce> call, Throwable t) {
                t.printStackTrace();

            }

        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
