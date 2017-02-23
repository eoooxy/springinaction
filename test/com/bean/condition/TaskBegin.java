package com.bean.condition;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/23
 * Time  9:17
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TaskConfig.class)
@ActiveProfiles("task")
public class TaskBegin {

    @Autowired
    SeniorBountyHunter seniorBountyHunter;

    @Autowired
    PrimaryBountyHunter primaryBountyHunter;

    @Test
    public void TaskLog() {
        if (primaryBountyHunter != null) {
            primaryBountyHunter.BeginHuntAndKill();
        }
        if (seniorBountyHunter != null) {
            seniorBountyHunter.BeginHuntAndKill();
        }
    }
}
