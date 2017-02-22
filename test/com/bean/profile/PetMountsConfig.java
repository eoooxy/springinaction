package com.bean.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/22
 * Time  16:44
 */


@Configuration
public class PetMountsConfig {


    @Bean
    @Profile("sky")
    public PetMounts sky() {
        return new FlyingMounts();
    }

    @Bean
    @Profile("land")
    public PetMounts land() {
        return new LandMounts();
    }

    @Bean
    @Profile("sea")
    public PetMounts sea() {
        return new SeaMounts();
    }


}
