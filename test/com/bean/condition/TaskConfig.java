package com.bean.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/23
 * Time  9:02
 */

@Configuration
public class TaskConfig {

    @Bean
    @Conditional(PrimaryBounty.class)
    public BountyHunter ThePrimaryBountyHunter() {
        return new PrimaryBountyHunter();
    }

    @Bean
    @Conditional(SeniorBounty.class)
    public BountyHunter TheSeniorBountyHunter() {
        return new SeniorBountyHunter();
    }
}
