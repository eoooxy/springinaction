package com.bean.profile;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/22
 * Time  16:54
 */

@Component
public class SeaMounts implements PetMounts {
    public void letsGo() {

        System.out.println("我是海洋坐骑 皮皮虾，我们走……！");
    }
}
