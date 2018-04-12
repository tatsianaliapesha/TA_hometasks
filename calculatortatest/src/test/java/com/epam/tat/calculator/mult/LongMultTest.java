package com.epam.tat.calculator.mult;

import com.epam.tat.calculator.CalculatorTestSetup;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LongMultTest extends CalculatorTestSetup {

    @Test(groups = {"positive", "long"})
    @Parameters({"firstNumber", "secondNumber", "result"})
    public void longMultTest(long a, long b, long result) {

        long res = calc.mult(a, b);
        Assert.assertEquals(res, result, "Incorrect result of mult operation.");
    }

}
