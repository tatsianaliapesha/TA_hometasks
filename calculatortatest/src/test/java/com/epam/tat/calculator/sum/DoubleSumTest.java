package com.epam.tat.calculator.sum;

import com.epam.tat.calculator.CalculatorTestSetup;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleSumTest extends CalculatorTestSetup {
    @Test(dataProvider = "dataProviderForSumOperation", groups = {"positive", "double"})
    public void doubleTypeSumTest(double firstNum, double secondNum, double result) {
        double res = calc.sum(firstNum, secondNum);
        Assert.assertEquals(res, result, "Incorrect sum of double type values.");
    }

    @DataProvider(name = "dataProviderForSumOperation")
    public Object[][] dataProvider() {
        return new Object[][]{
                {1.23, 2.354, 3.584},
                {-1.0004, -3.002, -4.0024}
        };
    }

}
