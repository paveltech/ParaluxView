package com.example.android.paraluxview;



import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by android on 9/29/2017.
 */

public interface ApiInterface {

    @GET("recent?")
    Call<JsonResponce> getNewHindiSongs(@Query("page") int page, @Query("api_token") String api);


}
