package id.ac.unhas.infocovid19.network

import id.ac.unhas.infocovid19.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkConfig {
    private fun getNetwork() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun api(): ApiEndPoint{
        return getNetwork().create(ApiEndPoint::class.java)
    }
}