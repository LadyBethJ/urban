package com.urban.androidhomework.data.repository;

import com.urban.androidhomework.domain.model.Character;

import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;

public interface NetworkApi {

    @GET("character/")
    Single<Response<Character>> getAllCharacters();

}
