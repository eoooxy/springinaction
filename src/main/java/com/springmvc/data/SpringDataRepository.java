package com.springmvc.data;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/03/03
 * Time  13:27
 */

public interface SpringDataRepository {

    List<SpringData> findSpringDatas(long max, int conut);
}
