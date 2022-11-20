import java.util.Random;
import java.util.Vector;
import java.util.Scanner;
//переписать под прием индексов shopadd, shopramove вместо экземпляров furniture
//добавить strToint
//ввести систему команд для навигации через/

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int convert(String str)
    {
        int val = 0;
        try {
            val = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {


        }
        return val;
    }
    static int cmdToint(String cmd)
    {
        if (cmd.equals("/shopshow")) return 0;
        else if (cmd.equals("/chshow")) return 1;
        else if (cmd.equals("/addf")) return 2;
        else if (cmd.equals("/remf")) return 3;
        else if (cmd.equals("/buy")) return 4;
        else if (cmd.equals("/exit")) return 5;
        else return Integer.MIN_VALUE;

    }
    public static Random rd=new Random();
    abstract static class Furniture
    {
        double weight,lenghth,width,height, price;
        String name;
        Furniture(String name)
        {
            this.name=name;
            weight=rd.nextInt(0,100);
            lenghth=rd.nextInt(0,100);
            width=rd.nextInt(0,100);
            height=rd.nextInt(0,100);
            price = rd.nextInt(10,10000);
        }
    }
    static class Sofa extends Furniture
    {

        Sofa()
        {
            super("Диван ");
        }
    }
    static class Chair extends Furniture
    {
        Chair()
        {
            super("Стул");
        }
    }
    static class Bed extends Furniture
    {
        Bed()
        {
            super("Кровать");
        }
    }
    static class wardtobe extends Furniture
    {
        wardtobe()
        {
            super("Шкаф");
        }
    }

    static class Futrnitureshop
    {
        Vector<Furniture> shop;
        Vector<Furniture> checkout;
        Vector<Integer> checount;
        double sumpr;
        Futrnitureshop()
        {
            shop = new Vector<Furniture>();
            checkout= new Vector<Furniture>();
            checount = new Vector<Integer>();
            sumpr =0;
        }
        void shopadd(Furniture f)
        {
            shop.addElement(f);
        }
        void shopshow()
        {
            System.out.println("Каталог"+'\n');
            for (int i =0 ; i< shop.size(); i++)
            {
                System.out.println(Integer.toString(i+1)+" "+shop.get(i).name+" цена " +shop.get(i).price);
            }
        }
        void checkoutadd (Furniture f, int count)
        {
            sumpr+=f.price*count;
            for (int i =0;i<checkout.size(); i++)
            {
                if (checkout.get(i)==f)
                {
                    checount.set(i,checount.get(i)+count);
                    System.out.println(count+" штук товара "+f.name+" успешно добавлено ");
                    return;
                }
            }
            checount.addElement(count);
            checkout.addElement(f);
            System.out.println(count+" штук товара "+f.name+" успешно добавлено ");
        }
        void checkoutshow()
        {
            for (int i =0; i<checkout.size(); i++)
            {
                System.out.println(Integer.toString(i+1)+" "+checkout.get(i).name+" "+checount.get(i)+" штук");
            }
            System.out.println("      Sum " + sumpr+" RUB");
        }
        void checkoutBuy()
        {
            checkoutshow();
            System.out.println("      Sum " + sumpr+" RUB"+" Приобретено");
        }
        void chekoutremove(Furniture f, int count)
        {
            for (int i =0;i<checkout.size(); i++)
            {
                if (checkout.get(i)==f)
                {
                 if (count<=checount.get(i))
                 {
                     checount.set(i,checount.get(i)-count);
                     sumpr-=f.price*count;
                     System.out.println(count+" штук товара "+f.name+" успешно удалено ");
                     return;
                 }
                 else
                 {
                     System.out.println("Введено больше товара чем есть в корзине");
                     return;
                 }

                }

            }
           System.out.println("Данного товара нет в корзине");
        }

    }
    public static void main(String[] args)
    {
        Futrnitureshop shop = new Futrnitureshop();
        shop.shopadd(new Bed());
        shop.shopadd(new Sofa());
        shop.shopadd(new Chair());
        shop.shopadd(new wardtobe());
        System.out.println("Введите команды  /shopshow - чтобы посмотреть каталог, /chshow - чтобы помсотреть корзину , /addf - чтобы добавить товар в чиле n единиц, /remf - чтобы убрать тоар в чиле n единиц,  /buy - для покупки, /exit- для выхода");
        int q = 0;
        while (true)
        {
            if (q==0) shop.shopshow();
            else if (q==1) shop.checkoutshow();
           else if (q==2)
            {
                    int type=convert(sc.next());
                    int size=convert(sc.next());
                    if (type>0&&type<=shop.shop.size()&&size>0)
                    {
                        shop.checkoutadd(shop.shop.get(type-1),size);
                    }
                    else
                    {
                        System.out.println("Неверный ввод");
                    }

            }
           else if (q==3)
           {
               shop.checkoutshow();
               int type=convert(sc.next());
               int size=convert(sc.next());
               if (type>0&&type<=shop.shop.size()&&size>0)
               {

                   shop.chekoutremove(shop.checkout.get(type-1),size);
               }
               else
               {
                   System.out.println("Неверный ввод");
               }
           }
           else if(q==4)
           {
            shop.checkoutBuy();
            return;
           }
           else if (q==5)
            {
                return;
            }
           q=cmdToint(sc.next());
        }



    }
}