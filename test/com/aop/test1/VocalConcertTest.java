package com.aop.test1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/24
 * Time  16:14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("config.xml")
public class VocalConcertTest {


    @Autowired
    Song mm;

    @Test
    public void log() {
        mm.song();
    }

}
