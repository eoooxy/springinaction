package com.bean.java;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/22
 * Time  10:57
 */

public class RandomCd implements CompactDisc {

    private String title ;
    private String artist = "张国荣";

    public RandomCd(String title) {
        this.title = title;
    }

    public void play() {
        System.out.println("Playing " + title + " By " + artist);
    }
}
