package PerimeterTester.java;

public class PerimeterTester {
    private int hiegth,width;

    public int getHiegth() {
        return hiegth;
    }

    public int getWidth() {
        return width;
    }
    public int getArea(int hiegth,int width)
    {
        int sumLine = hiegth + width;
        int perimeter = 2*sumLine;
        return perimeter;
    }
}
