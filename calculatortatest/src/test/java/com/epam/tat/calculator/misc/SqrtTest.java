package com.epam.tat.calculator.misc;

import com.epam.tat.calculator.CalculatorTestSetup;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SqrtTest extends CalculatorTestSetup {

    @Test(groups = {"positive", "double"})
    @Parameters({"number", "result"})
    public void sqrtTest(double number, double result) {
        double res = calc.sqrt(number);
        Assert.assertEquals(res, result, "Incorrect result of sqrt operation.");
    }
}
