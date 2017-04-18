package pl.sly.android.retrofit.example.rest.service.model;

import com.google.gson.annotations.SerializedName;

import org.joda.time.DateTime;

/**
 * Model of Currently. Part of {@link Weather}
 */
public class Currently {

    @SerializedName("time")
    private long time;

    @SerializedName("summary")
    private String summary;

    @SerializedName("precipType")
    private String precipType;

    @SerializedName("temperature")
    private double temperature;

    @SerializedName("dewPoint")
    private double dewPoint;

    @SerializedName("humidity")
    private double humidity;

    @SerializedName("windSpeed")
    private double windSpeed;

    @SerializedName("pressure")
    private double pressure;

    public long getTime() {
        return time;
    }

    public String getSummary() {
        return summary;
    }

    public String getPrecipType() {
        return precipType;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getPressure() {
        return pressure;
    }

    @Override
    public String toString() {
        return "time:\t" + new DateTime(time * 1000) +
                "\nsummary:\t" + summary +
                "\nprecipType:\t" + precipType +
                "\ntemperature:\t" + temperature +
                "\ndewPoint:\t" + dewPoint +
                "\nhumidity:\t" + humidity +
                "\nwindSpeed:\t" + windSpeed +
                "\npressure:\t" + pressure;
    }
}