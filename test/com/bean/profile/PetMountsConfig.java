package com.bean.profile;

import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/22
 * Time  16:44
 */


@Configuration
public class PetMountsConfig {




    public PetMounts sky() {

        return new FlyingMounts();
    }

    public PetMounts land() {

        return new FlyingMounts();
    }

    public PetMounts sea() {

        return new FlyingMounts();
    }


}
