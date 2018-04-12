package com.epam.tat.calculator.misc;

import com.epam.tat.calculator.CalculatorTestSetup;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CtgTest extends CalculatorTestSetup {

    @Test(groups = {"positive", "double"})
    @Parameters({"angle", "result"})
    public void ctgTest(double angle, double result) {
        double res = calc.ctg(angle);
        Assert.assertEquals(res, result, "Incorrect result of ctg operation.");
    }
}
