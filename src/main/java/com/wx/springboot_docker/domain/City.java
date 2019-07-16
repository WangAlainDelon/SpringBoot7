package com.wx.springboot_docker.domain;

import java.sql.Timestamp;
import java.util.Date;

public class City {
    private short city_id;
    private String city;
    private short country_id;
    private Timestamp last_update;
    private String country;

    public short getCity_id() {
        return city_id;
    }

    public void setCity_id(short city_id) {
        this.city_id = city_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public short getCountry_id() {
        return country_id;
    }

    public void setCountry_id(short country_id) {
        this.country_id = country_id;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
