package FindHiegthWidth.java;

public class FindHiegthWidth {
    private  int area,perimeter;

    public int getArea() {
        return area;
    }

    public int getPerimeter() {
        return perimeter;
    }
    public int hiegth(int area)
    {
        int hiegthA = area / 2;
        return hiegthA;
    }
    public float hiegthP(int perimeter)
    {
        float hiegthP = (float)perimeter / 4;
        return hiegthP;
    }

}
