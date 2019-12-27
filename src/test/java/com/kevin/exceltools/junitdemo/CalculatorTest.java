package com.kevin.exceltools.junitdemo;

import com.kevin.exceltools.junittest.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * @author kevin
 * @ClassName
 * @Date 2019/12/2621:36
 */
public class CalculatorTest {

    @Test
    public void calculate() {
        assertEquals(3, new Calculator().calculate("1 + 2"));
        assertFalse(3==new Calculator().calculate("1 + 2 + 3"));
    }

    @Test(expected = ArithmeticException.class)
    public void testException1() {
        int i = 1 / 0;
    }

    @Test(expected = ArithmeticException.class)
    public void testException2() {
        int i = 1 / 1;
    }
}
