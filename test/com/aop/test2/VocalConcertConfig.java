package com.aop.test2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/24
 * Time  16:22
 */

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class VocalConcertConfig {

    @Bean
    public VocalConcert vocalConcert() {
        return new VocalConcert();
    }

}
