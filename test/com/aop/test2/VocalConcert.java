package com.aop.test2;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/24
 * Time  15:26
 */
public class VocalConcert {


    public void checking() {
        System.out.println("检票之后，找位子坐下");
    }

    public void beautiful() {
        System.out.println("演唱会进入精彩部分的时候,鼓掌！");
    }

    public void leave() {
        System.out.println("结束后，我们离开场地");
    }


    public void watchVocalConcert(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("检票之后，找位子坐下");
            joinPoint.proceed();
            System.out.println("演唱会进入精彩部分的时候,鼓掌！");
            System.out.println("结束后，我们离开场地");
        } catch (Throwable throwable) {
            System.out.println("效果不好，退票");
        }

    }
}
