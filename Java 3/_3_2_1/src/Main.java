import java.util.Arrays;
import java.util.Vector;
import java.util.Scanner;

public class Main {
    static int val=1;
    public static Scanner sc = new Scanner(System.in);
    public static int convert(String str)
    {
        int val= 0;
        try {
            val = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {

            System.out.println("Введено не число");
        }
        return val;
    }
    static class converter
        {
            double RUB ;
            double EUR;
            double USD;
            short val;
            converter()
            {
                this.EUR=0.0;
                this.RUB=0.0;
                this.USD=0.0;
            }
           void add (item t)
            {
                EUR+=t.EPRICE;
                RUB+=t.RPRICE;
                USD+=t.UPRICE;
                System.out.println(t.name+ " Успешно добавлен ");
            }
        }
       public static class item
        {   String name;
            public double RPRICE;
            public double EPRICE;
            public double UPRICE;
            item(String name, double RPRICE, double EPRICE,double UPRICE)
            {
                this.name=name;
                this.EPRICE= EPRICE;
                this.RPRICE=RPRICE;
                this.UPRICE=UPRICE;
            }
        }
         public static  Vector<item> catalog=new Vector<item>();



    public static void main(String[] args)
    {
        int n= Integer.MIN_VALUE;
        converter c=new converter();
        catalog.add(new item("Стол", 1000.0, 21.0, 23.0));
        catalog.add(new item("Стул", 800.0, 13.0, 19.0));
        catalog.add(new item("Табурет", 100.0, 1.0, 2));
        catalog.add(new item("Ваза", 200.0, 2.0, 4));
        for (int i =0;i<catalog.size(); i++)
        {
            if(val ==1)  System.out.println(catalog.get(i).name+ " "+ catalog.get(i).RPRICE+ " Рублей ");
            else if(val ==2)  System.out.println(catalog.get(i).name+ " "+ catalog.get(i).EPRICE+ " Евро ");
            else if(val ==3)  System.out.println(catalog.get(i).name+ " "+ catalog.get(i).UPRICE+ " Долларов ");
            while (n<1||n>2)
            {
                System.out.println("Введите 1 для добавления или 2 для пропуска");
                n=convert(sc.next());
                if (n==1)  c.add(catalog.get(i));
            }
            n=Integer.MIN_VALUE;
        }
        System.out.println("Выберите способ оплаты 1 - RUB 2 - EUR 3 - USD  другое число отвена покупок - отмена покупки");
        while (n<1||n>3)
        {
            n=convert(sc.next());
            if (n==1) System.out.println("Цена тоавра "+ c.RUB+" рублей");
            else if (n==2) System.out.println("Цена тоавра "+ c.EUR+" евро");
            else if (n==3) System.out.println("Цена тоавра "+ c.USD+" доллар");
            else System.out.println("Покупка отменена");

        }
    }
}