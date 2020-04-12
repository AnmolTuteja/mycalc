package com;

import org.junit.Before;

import org.junit.*;

public class CalculatorTest {

    private Calculator calc;
    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testAdd() {
        int a = 120;
        int b = 210;
        int expectedResult = 330;
        long result = calc.add(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
}
