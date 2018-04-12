package com.epam.tat.calculator.div;

import com.epam.tat.calculator.CalculatorTestSetup;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleDivTest extends CalculatorTestSetup {

    @Test(dataProvider = "dataProviderForDivOperation", groups = {"positive", "double"})
    public void doubleDivWithDataProviderTest(String a, String b, String result) {
        double res = calc.div(Double.valueOf(a), Double.valueOf(b));
        Assert.assertEquals(res, Double.valueOf(result), "Incorrect result of divide operation.");
    }

    @DataProvider(name = "dataProviderForDivOperation")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"2.0", "2.0", "1.0"},
                {"2.0", "0.1", "20.0"},
                {"5.2", "-2.0", "-2.6"}
        };
    }
}
