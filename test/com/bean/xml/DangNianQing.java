package com.bean.xml;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/22
 * Time  14:07
 */


public class DangNianQing implements CompactDisc {

    private String title = "DangNianQing";
    private String artist = "张国荣";


    public void play() {
        System.out.println("Playing " + title + " By " + artist);
    }
}
