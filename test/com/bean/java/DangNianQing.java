package com.bean.java;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/22
 * Time  10:14
 */

public class DangNianQing implements CompactDisc {

    private String title = "DangNianQing";
    private String artist = "张国荣";


    public void play() {
        System.out.println("Playing " + title + " By " + artist);
    }
}