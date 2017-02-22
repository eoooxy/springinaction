package com.bean.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/22
 * Time  10:35
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    CDPlay cdPlay;

   /* @Autowired
    RandomCd randomCd;*/

    /*@Autowired
    DangNianQing dangNianQing;*/

    @Test
    public void test() {
        cdPlay.play();
        //dangNianQing.play();
        //randomCd.play();
    }


}
