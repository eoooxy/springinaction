package com.bean.xml;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/22
 * Time  14:23
 */

public class CDPlay {

    private CompactDisc compactDisc;


    @Autowired     // set注入
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    //构造器注入
    /*public CDPlay(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }*/

    public void play() {
        compactDisc.play();
    }

}
