package com.example.abhishek.bookshareapp.api;

import com.example.abhishek.bookshareapp.api.models.GoodreadsResponse;
import com.example.abhishek.bookshareapp.api.models.GoodreadsResponse2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BooksAPI {

    @GET("search.xml")
    Call<GoodreadsResponse> getBooks(
        @Query("q") String keyword,
        @Query("search[field]") String field,
        @Query("key") String key
    );


    @GET("book/show.xml")
    Call<GoodreadsResponse2> getBookDescription(
            @Query("id") Integer id,
            @Query("key") String key
    );


}


