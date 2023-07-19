package HelloPrinter.java;

public class HelloPrinterRunner {
    public static void main(String[] args) {
        HelloPrinter helloPrinter =new HelloPrinter("Hello, World!");
        String newName = helloPrinter.turnName();
        System.out.println(newName);
    }
}
