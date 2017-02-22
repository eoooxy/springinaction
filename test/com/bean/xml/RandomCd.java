package com.bean.xml;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/22
 * Time  14:33
 */

public class RandomCd implements CompactDisc {

    private String title;
    private String artist;


    public RandomCd(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void play() {
        System.out.println("Playing " + title + " By " + artist);
    }


}

