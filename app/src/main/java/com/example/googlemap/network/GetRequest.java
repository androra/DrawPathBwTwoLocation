package com.example.googlemap.network;

import com.example.googlemap.DirectionModel;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetRequest {

    @GET("directions/json")
    Call<JsonObject> getData(@Query(value = "origin",encoded = true) String origin,
                                 @Query(value = "destination",encoded = true) String destination,
                                 @Query("key") String key);

}
