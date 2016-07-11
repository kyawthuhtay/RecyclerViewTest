package com.fuckingtest.kyawthuhtay.recyclerviewtest;

/**
 * Created by KyawThuHtay on 7/9/2016.
 */

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ItemObject implements Serializable{
    @SerializedName("name")
    private String name;
    @SerializedName("username")
    private String username;
    @SerializedName("email")
    private String email;
    @SerializedName("phone")
    private String phone;
    @SerializedName("website")
    private String website;
    Address address;
    Company company;

    public ItemObject(String name, String username, String email) {
        this.name = name;
        this.username = username;
        this.email = email;
    }
    public Address getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }
    public Company getCompany() {
        return company;
    }
}
