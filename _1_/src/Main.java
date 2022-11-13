import  java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
//    public int enter ()
//    {
//        String ans = sc.
//    }
public static int convert(String str)
{
    int val = Integer.MIN_VALUE;
    try {
        val = Integer.parseInt(str);
    }
    catch (NumberFormatException e)
    {
        System.out.println("Размер массива - число");
    }
    return val;
}
    public static void main(String[] args)
    {
        int size = 0;
        boolean flag=true;
        System.out.println("Введите размер массива");
        while (flag)
        {
            String ss=sc.next();
            size = convert(ss);
            if (size>0) flag=false;
        }
        int sum=0;
        int[] mas = new int[size];
        System.out.println("Введите числа массива");
        for (int i = 0; i<size;i++)
        {
            String ss=sc.next();
            int tr = convert(ss);
            if (tr==Integer.MIN_VALUE) i--;
            else
            {
                mas[i]=tr;
                sum+=tr;
            }
        }
        System.out.println("Сумма чисел массива "+ sum +" среднее арифметическое "+ sum/size);

    }
}