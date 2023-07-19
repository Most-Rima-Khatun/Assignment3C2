package HelloPrinter.java;

public class HelloPrinter {
    private String name;
    public void name()
    {
        name = "Hello, World!";
    }

    public HelloPrinter(String name) {
        this.name = name;
    }
    public String turnName()
    {
        String newName = null;
        newName = name.replace("e","p");
        newName = newName.replace("o","e");
        newName = newName.replace("p","o");
        return newName;
    }
}
