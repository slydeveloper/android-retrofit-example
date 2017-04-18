package pl.sly.android.retrofit.example.rest.service.api;

import pl.sly.android.retrofit.example.rest.service.model.Weather;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * API for getting weather from https://darksky.net/
 */
public interface ApiWeather {

    @GET("{latitude},{longitude}")
    Call<Weather> getWeather(@Path("latitude") String latitude,
                             @Path("longitude") String longitude);
}
