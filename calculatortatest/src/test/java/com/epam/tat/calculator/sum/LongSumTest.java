package com.epam.tat.calculator.sum;

import com.epam.tat.calculator.CalculatorTestSetup;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LongSumTest extends CalculatorTestSetup {

    @Test(dataProvider = "dataProviderForLongSumOperation", groups = {"positive", "long"})
    public void longTypeSumTest(long firstNum, long secondNum, long result) {
            long res = calc.sum(firstNum, secondNum);
            Assert.assertEquals(res, result, "Incorrect sum of long type values.");
    }

    @DataProvider(name = "dataProviderForLongSumOperation")
    public Object[][] dataProvider() {
        return new Object[][]{
                {100500, 2, 100502},
                {-100500, 2, -100498}
        };
    }

}
