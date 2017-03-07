package com.springmvc.data;

import sun.security.util.Cache;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/03/03
 * Time  13:28
 */

public class SpringData {

    private Long id;
    private String message;
    private Date time;
    private Double latitude;
    private Double longtitude;

    public SpringData(String message, Date time) {

        this(message, time, null, null);
    }

    public SpringData(String message, Date time, Double latitude, Double longtitude) {
        this.id = null;
        this.message = message;
        this.time = time;
        this.latitude = latitude;
        this.longtitude = longtitude;
    }


    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongtitude() {
        return longtitude;
    }
}
