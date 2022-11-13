import java.util.Scanner;
public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static int convert(String str)
    {
        int val =0;
        try {
            val = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {

            System.out.println("Invalid String");
        }
        return val;
    }

    static class user
    {
        String name;
        String pas;
        int[] mas= new int[5];
        user(String name, String pas)
        {
            this.name=name;
            this.pas=pas;
            for (int i = 0 ; i< 5; i++)
            {
                mas[i]=0;
            }
        }
        void add(catalog t, int count)
        {
            switch (t)
            {
                case Item1 -> mas[0]++;
                case Item2 -> mas[1]++;
                case Item3 -> mas[2]++;
                case Item4 -> mas[3]++;
                case Item5 -> mas[4]++;
            }
        }
        void checkout()
        {
            long s=0;
            int i =0;
            System.out.println("В вашей корзине:");
            for (catalog c:catalog.values())
            {
                s+=c.cost*mas[i];
                System.out.println(mas[i]+" штук "+ c.name()+ " в корзине");
                i++;
            }
            System.out.println("Итоговая цена: " + s);
            System.out.println("Введите y/n для оплаты/отмены");
            String str="d";
            while (!str.equals("y")&&!str.equals("n"))
            {
                str=sc.next();
               if (!str.equals("y")&&!str.equals("n"))  System.out.println("Введено неверное значение");
            }
            if (str.equals("y"))  System.out.println("Оплата прошла успешно");
            if (str.equals("n"))  System.out.println("Оплата отменена");
        }
    }
  static enum catalog
    {
        Item1(10), Item2(20), Item3(30), Item4(40), Item5(50);
        int cost;
        catalog(int cost)
        {
            this.cost=cost;
        }
        void show()
        {
            System.out.println(this.name()+" "+this.cost);
        }
    }
    public static void main(String[] args)
    {
        user u=new user("qwerty","1234");
        System.out.println("Введите логин");

        boolean login = false;
        boolean passin =false;
        while (!login)
        {   String log=sc.next();
            if (log.equals(u.name))
            {
                System.out.println("Введите пароль");
                login=true;
            }
            else System.out.println("Неверный логин");

            }
        while (!passin)
        {
            String pas=sc.next();
            if (pas.equals(u.pas))
            {
                passin=true;
                System.out.println("Вы успешно вошли");
            }
            else System.out.println("Неверный пароль");
        }
        int i = 0;
        for(catalog s : catalog.values())
        {
            s.show();
            System.out.println("Введите кол-во товара, которое хотите купить");
            String str=sc.next();
            int count=convert(str);
            if (count>=0)
            {
                u.mas[i]=count;
            }
            else count = 0;
            System.out.println(count+" штук "+ s.name()+ " добавлено в корзину");
            i++;
        }
        u.checkout();


    }
}