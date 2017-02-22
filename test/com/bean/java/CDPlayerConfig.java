package com.bean.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/22
 * Time  10:08
 */

@Configuration
public class CDPlayerConfig {


    /**
     * @Bean 可以不指定名字 默认为方法名——'dangNianQing'
     * @Bean(name="XXX") 也可以指定一个名字
     */

   /*@Bean
    public CompactDisc dangNianQing() {
        return new DangNianQing();
    }*/
    @Bean
    public CompactDisc randomCd() {
        int choice = (int) Math.floor(Math.random() * 4);
        switch (choice) {
            case 0:
                return new RandomCd("dangNianQing");
            case 1:
                return new RandomCd("qianNvYouHun");
            case 2:
                return new RandomCd("wo");
            default:
                return new RandomCd("chenMoShiJing");
        }
    }

    /*@Bean
    public CDPlay cdPlay(){
        return new CDPlay(dangNianQing());
    }*/

    @Bean
    public CDPlay cdPlay(CompactDisc compactDisc){
        return new CDPlay(compactDisc);
    }

   /* @Bean
    public CDPlay cdPlay(CompactDisc compactDisc){
        return  new CDPlay(compactDisc);
    }*/


}
