package com.aop.test1;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/24
 * Time  17:06
 */


@Component
public class ManMan implements Song {

    public void song() {
        System.out.println("下面这首歌是张学友的《慢慢》");
    }
}
