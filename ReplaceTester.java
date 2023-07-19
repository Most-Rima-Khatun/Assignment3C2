package ReplaceTester.java;

public class ReplaceTester {
    private String name;
    public void name()
    {
        name = "Mississippi";
    }
   public ReplaceTester(String name)
   {
       this.name = name;
   }
    public String changeName()
    {
        String newString = null;
        newString = name.replace("i","!");
        return  newString;
    }
    public String changeName$()
    {
        String newString$ = null;
        newString$ = name.replace("s","$");
        return newString$;
    }
}
