class phone
{
    int cc;
    int c3;
    int c4;
    phone(String str)
    {
        c4=Integer.parseInt(str.substring(str.length()-5));
        c3=Integer.parseInt(str.substring(str.length()-8,str.length()-5));
        c4=Integer.parseInt(str.substring(1,str.length()-8));
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}