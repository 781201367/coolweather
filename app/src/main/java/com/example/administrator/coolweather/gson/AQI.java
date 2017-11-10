package com.example.administrator.coolweather.gson;

/**
 * Created by Administrator on 2017/11/9 0009.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
