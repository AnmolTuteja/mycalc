package com;

import com.Calc;
import org.junit.Before;

import org.junit.*;

public class CalcTest {

    private Calc calc;
    @Before
    public void setUp() {
        calc = new Calc();
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
