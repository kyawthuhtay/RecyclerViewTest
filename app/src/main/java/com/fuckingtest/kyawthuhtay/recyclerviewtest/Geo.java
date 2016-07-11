package com.fuckingtest.kyawthuhtay.recyclerviewtest;

/**
 * Created by KyawThuHtay on 7/10/2016.
 */

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Geo implements Serializable{

    @SerializedName("lat")
    private String lat;
    @SerializedName("lng")
    private String lng;

    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }
    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }
}
