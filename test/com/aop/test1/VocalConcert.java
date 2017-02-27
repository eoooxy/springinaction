package com.aop.test1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/24
 * Time  15:26
 */
@Aspect
public class VocalConcert {

    @Pointcut("execution(* com.aop.test1.Song.song(..))")
    public void doing() {
    }

    @Before("doing()")
    public void checking() {
        System.out.println("检票之后，找位子坐下");
    }

    @AfterReturning("doing()")
    public void beautiful() {
        System.out.println("演唱会进入精彩部分的时候,鼓掌！");
    }

    @AfterReturning("doing()")
    public void leave() {
        System.out.println("结束后，我们离开场地");
    }


/*    @Around("doing()")
    public void watchVocalConcert(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("检票之后，找位子坐下");
            joinPoint.proceed();
            System.out.println("演唱会进入精彩部分的时候,鼓掌！");
            System.out.println("结束后，我们离开场地");
        } catch (Throwable throwable) {
            System.out.println("效果不好，退票");
        }

    }*/
}
