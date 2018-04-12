package com.epam.tat.calculator.sub;

import com.epam.tat.calculator.CalculatorTestSetup;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleSubTest extends CalculatorTestSetup {
    @Test(dataProvider = "dataProviderForDoubleSubOperation", groups = {"positive", "double"})
    public void doubleTypeSubTest(double firstNum, double secondNum, double result) {
        double res = calc.sub(firstNum, secondNum);
        Assert.assertEquals(res, result, "Incorrect sub of double type values.");
    }

    @DataProvider(name = "dataProviderForDoubleSubOperation")
    public Object[][] dataProvider() {
        return new Object[][]{
                {2.354, 1.23, 1.124},
                {-1.0004, -3.002, 2.0016}
        };
    }
}
