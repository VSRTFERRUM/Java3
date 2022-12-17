class Adress
{
    String c;
    String r;
    String ct;
    String s;
    String  h;
    String cr;
    String f;
    Adress(String str, char r)
    {
        String split[]=str.split("r");
        c=split[0].replaceAll("\\s+","");
        this.r=split[1].replaceAll("\\s+","");
        ct=split[2].replaceAll("\\s+","");
        s = split[3].replaceAll("\\s+","");
        h=split[4].replaceAll("\\s+","");
        cr=split[5].replaceAll("\\s+","");
        f=split[6].replaceAll("\\s+","");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}