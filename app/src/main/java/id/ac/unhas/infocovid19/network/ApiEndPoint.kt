package id.ac.unhas.infocovid19.network

import id.ac.unhas.infocovid19.model.DataProvinsi
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndPoint {
    @GET("indonesia/provinsi")
    fun getDataProvinsi(): Call<DataProvinsi>
}