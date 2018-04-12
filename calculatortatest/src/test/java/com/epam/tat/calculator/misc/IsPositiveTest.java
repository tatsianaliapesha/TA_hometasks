package com.epam.tat.calculator.misc;

import com.epam.tat.calculator.CalculatorTestSetup;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IsPositiveTest extends CalculatorTestSetup {

    @Test(groups = {"positive", "long"})
    @Parameters({"number", "result"})
    public void isPositiveTest(long number, boolean result) {
        boolean res = calc.isPositive(number);
        Assert.assertEquals(res, result, "Incorrect result of 'isPositive' operation.");
    }
}
