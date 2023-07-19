package PerimeterTester.java;

import java.awt.*;

public class PerimeterTesterRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,8);
        PerimeterTester perimeterTester = new PerimeterTester();
        System.out.println(perimeterTester.getArea((int)rectangle.getWidth(),(int)rectangle.getHeight()));
    }
}
