package com.epam.tat.calculator.misc;

import com.epam.tat.calculator.CalculatorTestSetup;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeTest extends CalculatorTestSetup {

    @Test(dataProvider = "dataProviderForIsNegativeOperation", groups = {"positive", "long"})
    public void isNegativeTest(long number, boolean result) {
        boolean res = calc.isNegative(number);
        Assert.assertEquals(res, result, "Incorrect result of 'isNegative' operation.");
    }

    @DataProvider(name = "dataProviderForIsNegativeOperation")
    public Object[][] dataProvider() {
        return new Object[][]{
                {1, false},
                {0, false},
                {-1, true}
        };
    }
}
