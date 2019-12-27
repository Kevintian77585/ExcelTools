package com.kevin.exceltools.junitdemo;

import com.kevin.exceltools.junittest.Calculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * @author kevin
 * @ClassName
 * @Date 2019/12/2622:03
 */
@RunWith(Parameterized.class)
public class Testa {
    /**
     * JUnit4中参数化测试要点：
     * 1. 测试类必须由Parameterized测试运行器修饰
     * 2. 准备数据。数据的准备需要在一个方法中进行，该方法需要满足一定的要求：
     * 1）该方法必须由Parameters注解修饰
     * 2）该方法必须为public static的
     * 3）该方法必须返回Collection类型
     * 4）该方法的名字不做要求
     * 5）该方法没有参数
     *
     * @return
     */
    @Parameterized.Parameters
    public static Collection<?> data() {
        return Arrays.asList(new Object[][]{{"1+2", 3}, {"1+2+5", 8}, {"123+456", 579}, {" 1 + 5 + 10 ", 16}});
    }

    Calculator calc;

    @Parameterized.Parameter(0)
    public String input;

    @Parameterized.Parameter(1)
    public int expected;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testCalculate() {
        int r = calc.calculate(this.input);
        assertEquals(this.expected, r);
    }
}

