package com.kevin.exceltools.enumdemotest;

import com.kevin.exceltools.enumdemo.Signal;

/**
 * @author kevin
 * @ClassName
 * @Date 2019/12/2221:17
 */
public class TrafficLight {


    Signal color = Signal.RED;

    public void change() {
        switch (color) {
            case RED:
                color = Signal.GREEN;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
            case YELLOW:
                color = Signal.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "The Traffic light is："+color;
    }

    public static void main(String[] args) {

        TrafficLight t = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            System.out.println(t);
            t.change();
        }
    }
}
