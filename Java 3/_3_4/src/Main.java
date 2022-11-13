import java.util.Scanner;
import  java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Random rd = new Random();
    public static int convert(String str)
    {
        int val = Integer.MIN_VALUE;
        try {
            val = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {

            System.out.println("Введено не целое число");
        }
        return val;
    }
    public static void main(String[] args)
    {
        System.out.println("Введите размер массива");
        int n =Integer.MIN_VALUE;
       while (n<=0)
       {
           n=convert(sc.next());
           if (n<=0) System.out.println("Размер массива строго положительный");
       }
        int[] mas =new int[n];
        Vector <Integer> chet = new Vector<Integer>();
        for (int i = 0 ; i<n; i++)
        {
         mas[i]=rd.nextInt();
         System.out.print(mas[i]+ " ");
         if (mas[i]%2==0) chet.add(mas[i]);
        }
        System.out.print('\n');
        for (int i = 0; i< chet.size(); i++)
        {
            System.out.print(chet.get(i) + " ");
        }


    }
}