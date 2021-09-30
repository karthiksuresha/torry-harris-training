package com.Day9.testing;

import com.Day9.testing.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(6, calculator.add(2, 4));
    }

    @Test
    public void subTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.sub(6, 4));
    }
    @Test
    public void mulTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(8, calculator.mul(4, 2));
    }
    @Test
    public void divTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(3, calculator.div(9, 3));
    }
}
