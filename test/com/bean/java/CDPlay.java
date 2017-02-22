package com.bean.java;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/22
 * Time  10:29
 */

public class CDPlay {

    private CompactDisc compactDisc;

    public CDPlay(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play() {
        compactDisc.play();
    }

}
