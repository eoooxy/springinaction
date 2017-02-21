package com.bean.auto;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/21
 * Time  21：41
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private  DangNianQing dangNianQing;

    @Autowired
    private  CompactDisc compactDisc;

    @Test
    public void cdShoudNotBeNull(){
        System.out.println(compactDisc);
    }

    @Test
    public  void play(){
        dangNianQing.play();
    }
}
