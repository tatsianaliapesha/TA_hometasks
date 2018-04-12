package com.epam.tat.calculator.sub;

import com.epam.tat.calculator.CalculatorTestSetup;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongSubTest extends CalculatorTestSetup {

    @Test(dataProvider = "dataProviderForLongSubOperation", groups = {"positive", "long"})
    public void longTypeSubTest(long firstNum, long secondNum, long result) {

        long res = calc.sub(firstNum, secondNum);
        Assert.assertEquals(res, result, "Incorrect sub of long type values.");
    }

    @DataProvider(name = "dataProviderForLongSubOperation")
    public Object[][] dataProvider() {
        return new Object[][]{
                {100500L, 2L, 100498L},
                {-100500L, -2L, -100498L}
        };
    }
}
