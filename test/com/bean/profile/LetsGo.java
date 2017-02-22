package com.bean.profile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/22
 * Time  20：42
 */
@RunWith(SpringJUnit4ClassRunner.class)
/*@ContextConfiguration(classes = PetMountsConfig.class)*/
@ContextConfiguration(value = "config.xml")
@ActiveProfiles("sea")
public class LetsGo {

    @Autowired
PetMounts petMounts;

    @Test
    public void LetsGoLog(){
        petMounts.letsGo();
    }
}
