package com.epam.tat.timeout;

import com.epam.tat.module4.Timeout;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TimeoutTest extends Timeout {

    @Test
    public void timeoutTest() {
        long start = System.currentTimeMillis();
        Timeout.sleep(2);
        long end = System.currentTimeMillis();
        Assert.assertTrue(end - start >= 2000);
    }
}
