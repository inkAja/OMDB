package com.example.prjapiomdb

import com.example.prjapiomdb.modeldata.SearchData
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("?s=spider&apikey=937bb5ee")
    fun getMOvies(): Call<SearchData>
}