package com.epam.tat.calculator.div;

import com.epam.tat.calculator.CalculatorTestSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class DoubleDivNegativeTest extends CalculatorTestSetup {

    @Test(groups = {"negative", "double"})
    public void doubleDivByZeroTest() {
        double res = calc.div(1.0, 0.0);
        Assert.assertEquals(res, Infinity, "Incorrect result of divide by zero operation.");
    }
}
