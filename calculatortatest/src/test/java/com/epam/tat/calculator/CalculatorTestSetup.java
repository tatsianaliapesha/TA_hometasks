package com.epam.tat.calculator;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

public class CalculatorTestSetup {

    protected Calculator calc;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        calc = new Calculator();
        System.out.println("Hello, calculator.");
    }
}
