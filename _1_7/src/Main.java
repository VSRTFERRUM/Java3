import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int convert(String str)
    {
        int val = Integer.MIN_VALUE;
        try {
            val = Integer.parseInt(str);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Введено не число");
        }
        return val;
    }

    static class facktorial
    {
        int ans;
        facktorial()
        {
            ans=1;
        }
        long f(int s)
        {
            if (s==0) return 0;
            long a=ans;
            for(int i =1;i<=s;i++)
            {
                a*=i;
            }
            return  a;
        }

    }
    public static void main(String[] args)
    {
        int ch = Integer.MIN_VALUE;
        while (ch==Integer.MIN_VALUE)
        {
            String v = sc.next();
            ch=convert(v);
            if (ch<0)
            {
                ch=Integer.MIN_VALUE;
                System.out.println("Число должно быть больше 0 ");
            }
        }
        facktorial fa = new facktorial();
        System.out.println("Ответ: "+fa.f(ch));


    }
}