package com.epam.tat.calculator.div;

import com.epam.tat.calculator.CalculatorTestSetup;
import org.testng.annotations.Test;

public class LongDivNegativeTest extends CalculatorTestSetup {

    @Test(expectedExceptions = {NumberFormatException.class}, groups = {"negative", "long"})
    public void longDivByZeroTest() {
        calc.div(1, 0);
    }
}
