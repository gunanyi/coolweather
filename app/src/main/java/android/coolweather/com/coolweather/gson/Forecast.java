package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;
    @SerializedName("cond")
    public FMore fMore;
    @SerializedName("tmp")
    public Temperature temperature;

}
