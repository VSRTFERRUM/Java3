class  Person
{
    String f;
    String n;
    String o;
    Person(String n, String f, String o)
    {
        this.n=n;
        this.o=o;
        this.f=f;
    }
    Person(String f)
    {
        this.f=f;
        n="0";
        o="0";
    }
    Person(String f, String n)
    {
        this.f=f;
        this.n=n;
        o="0";
    }
    void SH()
    {
        if (n.equals('0')) System.out.println(f);
        else if (o.equals('0')) System.out.println(f+' '+n.charAt(0)+'.');
        else System.out.println(f+' '+n.charAt(0)+'.'+' '+o.charAt(0)+'.');
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
