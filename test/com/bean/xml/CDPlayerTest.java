package com.bean.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/22
 * Time  14:08
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "config.xml")
public class CDPlayerTest {


    /*@Autowired
    DangNianQing dangNianQing;*/

    @Autowired
    CDPlay cdPlay;

    @Test
    public void play() {
        cdPlay.play();
    }
}
