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
        int a = 12;
        int b = 21;
        char x='+';
        int expectedResult = 33;
        long result = calc.applyOp(x,a, b);
        Assert.assertEquals(expectedResult, result);;
    }
}
