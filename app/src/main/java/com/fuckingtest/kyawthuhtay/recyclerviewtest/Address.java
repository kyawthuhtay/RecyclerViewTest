package com.fuckingtest.kyawthuhtay.recyclerviewtest;

/**
 * Created by KyawThuHtay on 7/9/2016.
 */

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Address implements Serializable{

    @SerializedName("street")
    private String street;
    @SerializedName("suite")
    private String suite;
    @SerializedName("city")
    private String city;
    @SerializedName("zipcode")
    private String zipcode;

    Geo geo;

    public Address(String street, String suite, String city, String zipcode) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
    }
    public String getStreet() {
        return street;
    }

    public String getSuite() {
        return suite;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }
    public Geo getGeo() {
        return geo;
    }
}
