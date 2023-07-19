package ReplaceString.java;

public class ReplaceStringRunner {
    public static void main(String[] args) {
        ReplaceString replaceString = new ReplaceString();
        int newlength = replaceString.replace1();
        int lengthSt = replaceString.replace2();
        int length = replaceString.calculateLength("Mississippi");
        String newNameI = replaceString.replaceI();
        System.out.println(newNameI);
        System.out.println(length);
        System.out.println(newlength);
        System.out.println(lengthSt);
    }
}
