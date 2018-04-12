package com.epam.tat.calculator.mult;

import com.epam.tat.calculator.CalculatorTestSetup;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DoubleMultTest extends CalculatorTestSetup {

    @Test(groups = {"positive", "double"})
    @Parameters({"firstNumber", "secondNumber", "result"})
    public void longMultTest(double a, double b, double result) {

        double res = calc.mult(a, b);
        Assert.assertEquals(res, result, "Incorrect result of mult operation.");
    }
}
