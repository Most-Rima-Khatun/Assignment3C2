package ReplaceTester.java;


public class ReplaceTesterRunner {

    public static void main(String[] args) {
        ReplaceTester replaceTester =new ReplaceTester("Mississippi");
        String newNamei = replaceTester.changeName();
        String newName$ = replaceTester.changeName$();
        System.out.println(newNamei);
        System.out.println(newName$);
    }
}
