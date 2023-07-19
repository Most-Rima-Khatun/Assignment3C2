package TrimString.java;

public class TrimString {
    private String nameTrim;
    public TrimString()
    {
        nameTrim = "Most Rima Khatun";
    }
    public TrimString(String nameTrim) {

        this.nameTrim = nameTrim;
    }
    public String trimStringT(){
        String newString = null;
        nameTrim = nameTrim.trim();
        newString = nameTrim.replace(" ","");
        return newString;
    }
}
