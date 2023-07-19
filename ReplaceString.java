package ReplaceString.java;

public class ReplaceString {
    private String stateName;
   // String newStateName;
    public ReplaceString(){
        stateName = "Mississippi";
    }
    public String ReplaceString(String stateName)
    {
        this.stateName = stateName;
        return stateName;
    }
    public int replace1(){
        String newStateName =null;
        int newlength;
        newStateName = stateName.replace("i","ii");
        newlength = newStateName.length();
        return newlength;
    }
    public  String replaceI()
    {
        String newNameI = null;
        newNameI = stateName.replace("i","ii");
        return  newNameI;
    }
    public int replace2()
    {
        int lengthSt;
        String newNameS = null;
        newNameS = stateName.replace("ss","s");
        lengthSt = newNameS.length();
        return lengthSt;

    }
    public int calculateLength(String name)
    {
        return name.length();
    }

}
