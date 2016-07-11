package com.fuckingtest.kyawthuhtay.recyclerviewtest;

/**
 * Created by KyawThuHtay on 7/10/2016.
 */

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Company implements Serializable{

    @SerializedName("name")
    private String name;
    @SerializedName("catchPhrase")
    private String catchPhrase;
    @SerializedName("bs")
    private String bs;

    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }
    public String getName() {
        return name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public String getBs() {
        return bs;
    }
}
