package com.epam.tat.calculator.misc;

import com.epam.tat.calculator.CalculatorTestSetup;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SinTest extends CalculatorTestSetup {

    @Test(groups = {"positive", "double"})
    @Parameters({"angle", "result"})
    public void sinTest(double angle, double result) {
        double a = Math.toRadians(angle);
        double res = calc.sin(a);
        res = Double.valueOf((Math.round(res * 10))) / 10;
        Assert.assertEquals(res, result, "Incorrect result of sin operation.");
    }
}
