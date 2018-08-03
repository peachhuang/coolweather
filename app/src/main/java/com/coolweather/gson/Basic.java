package com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 胡钊 on 2018/8/1.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update updata;
    public Object update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;

    }

}
