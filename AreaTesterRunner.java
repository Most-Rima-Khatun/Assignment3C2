package AreaTester.java;

import java.awt.*;

public class AreaTesterRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,8);
        AreaTester areaTester = new AreaTester();
        System.out.println(areaTester.getArea((int)rectangle.getHeight(),(int)rectangle.getWidth()));

    }
}
