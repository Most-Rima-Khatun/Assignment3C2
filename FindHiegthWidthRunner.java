package FindHiegthWidth.java;

public class FindHiegthWidthRunner {
    public static void main(String[] args) {
        FindHiegthWidth findHiegthWidth =new FindHiegthWidth();
       float hiegthP = findHiegthWidth.hiegthP(42);
       float widthP = findHiegthWidth.hiegthP(42);
        int hiegthA = findHiegthWidth.hiegth(42);
        int widthA = findHiegthWidth.hiegth(42);
        System.out.println(hiegthA+" "+widthA+"\n"+(float)hiegthP+" "+(float)widthP);
    }


}
