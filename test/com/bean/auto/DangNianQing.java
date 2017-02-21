package com.bean.auto;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/21
 * Time  20：56
 */

/**
 * Bean配置方法：
 *    |- @Component 注解表示这个类我要把它创建成bean
 *    |- @Component("XXX") XXX表示bean的标识名字
 *    |- @Named("XXX") XXX表示bean的标识名字
 */

@Component
public class DangNianQing implements CompactDisc {

    private String title = "DangNianQing";
    private String artist = "张国荣";

    public void play() {
        System.out.println("Playing " + title + " By " + artist);
    }
}
