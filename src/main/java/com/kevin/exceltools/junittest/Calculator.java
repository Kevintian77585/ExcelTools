package com.kevin.exceltools.junittest;

import java.util.Arrays;

/**
 * @author kevin
 * @ClassName
 * @Date 2019/12/2621:35
 */
public class Calculator {
    public int calculate(String expression) {
        String[] ss = expression.split("\\+");
        System.out.println(expression + " => " + Arrays.toString(ss));
        int sum = 0;
        for (String s : ss) {
            sum += Integer.parseInt(s.trim());
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int calculate = calculator.calculate("1+2+3");
        System.out.println(calculate);


    }
}
