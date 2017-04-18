package pl.sly.android.retrofit.example.rest.service.model;

import com.google.gson.annotations.SerializedName;

/**
 * Model of weather.
 */
public class Weather {

    @SerializedName("currently")
    private Currently currently;

    public Currently getCurrentlyResponse() {
        return currently;
    }

    @Override
    public String toString() {
        return currently.toString();
    }
}
