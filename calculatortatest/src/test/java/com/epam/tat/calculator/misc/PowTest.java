package com.epam.tat.calculator.misc;

import com.epam.tat.calculator.CalculatorTestSetup;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PowTest extends CalculatorTestSetup {

    @Test(groups = {"positive", "double"})
    @Parameters({"firstNumber", "secondNumber", "result"})
    public void powTest(double a, double b, double result) {

        double res = calc.pow(a, b);
        Assert.assertEquals(res, result, "Incorrect result of pow operation.");
    }
}
