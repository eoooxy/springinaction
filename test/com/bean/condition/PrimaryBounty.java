package com.bean.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/23
 * Time  8:48
 */

public class PrimaryBounty implements Condition {

    public boolean matches(ConditionContext conditionContext,
                           AnnotatedTypeMetadata annotatedTypeMetadata) {
        /**
         * 各种自己想要的验证,然后根据结果来返回 一个boole值
         */

        if (conditionContext.getEnvironment().acceptsProfiles("task")) {
            return true;
        } else {
            return false;
        }
    }
}
