package com.epam.tat.calculator.div;

import com.epam.tat.calculator.CalculatorTestSetup;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongDivTest extends CalculatorTestSetup {

    @Test(dataProvider = "dataProviderForDivOperation", groups = {"positive", "double"})
    public void longDivWithDataProviderTest(long a, long b, long result) {
        long res = calc.div(a, b);
        Assert.assertEquals(res, result, "Incorrect result of divide operation.");
    }

    @DataProvider(name = "dataProviderForDivOperation")
    public Object[][] dataProvider() {
        return new Object[][]{
                {2, 2, 1},
                {2, 5, 0},
                {5, 2, 2}
        };
    }
}
