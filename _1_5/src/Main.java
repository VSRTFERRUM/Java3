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


    public static void main(String[] args)
    {
        int st=Integer.MIN_VALUE;
        String tr;
        System.out.println("Введите длинну цикла");
        while (st==Integer.MIN_VALUE)
        {
            tr=sc.next();
            st=convert(tr);
            if (st<0)
            {
                st=Integer.MIN_VALUE;
                System.out.println("Длинна цикла неотрицательное число");
            }
        }
        for (int i = 0; i<st;i++) System.out.println(i);


    }
}