import java.util.Scanner;
import java.util.Vector;
public class Main
{
    public static Scanner sc=new Scanner(System.in);
    public static Vector<Integer> mas = new Vector<Integer>();
    public static int convert(String str)
    {
        int val = Integer.MIN_VALUE;

        try {
            val = Integer.parseInt(str);
        } catch (NumberFormatException var3) {
            System.out.println("Введено не число");
        }

        return val;
    }
    public static void main(String[] args)
    {
        System.out.println("Введите 1 если необходим цикл while, введите 2 если необходим цикл do while");
        int st=0;
        String tr;
        int min =Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        double sum=0;
        while (st==0)
        {
            tr= sc.next();
            st=convert(tr);
            if(st!=1&&st!=2)
            {
                st=0;
                System.out.println("Введите 1 или 2 ");
            }
        }
        if (st==1)
        {
            System.out.println("Введите не число либо MIN_INT чтобы завершить считывание");
            while (st!=Integer.MIN_VALUE)
            {
                tr= sc.next();
                st=convert(tr);
                if (st!=Integer.MIN_VALUE)
                {
                    mas.add(st);
                    sum+=st;
                    if (st<min) min=st;
                    if (st>max) max=st;
                }
            }
        }
        else if (st==2)
        {
            System.out.println("Введите не число либо MIN_INT чтобы завершить считывание");
           do
            {
                tr= sc.next();
                st=convert(tr);
                if (st!=Integer.MIN_VALUE)
                {
                    mas.add(st);
                    sum+=st;
                    if (st<min) min=st;
                    if (st>max) max=st;
                }
            }  while (st!=Integer.MIN_VALUE);

        }
        System.out.println("Сумма элементов " +sum+ " минимальное значение " + min + " максимальное значение " +max);

    }
}