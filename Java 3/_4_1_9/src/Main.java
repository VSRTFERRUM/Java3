import java.util.Random;
import java.util.Vector;
//переписать под прием индексов shopadd, shopramove вместо экземпляров furniture
//добавить strToint
//ввести систему команд для навигации через/

public class Main {
    public static int convert(String str)
    {
        int val = 0;
        try {
            val = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {

            System.out.println("Invalid String");
        }
        return val;
    }
    int cmdToint(String cmd)
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
    abstract class Furniture
    {
        double weight,lenghth,width,height, price;
        String name;
        Furniture(String name)
        {
            weight=rd.nextInt(0,100);
            lenghth=rd.nextInt(0,100);
            width=rd.nextInt(0,100);
            height=rd.nextInt(0,100);
            price = rd.nextInt(10,10000);
        }
    }
    class Futrnitureshop
    {
        Vector<Furniture> shop;
        Vector<Furniture> checkout;
        Vector<Integer> checount;
        double sumpr;
        Futrnitureshop()
        {
            Vector<Furniture> shop = new Vector<Furniture>();
            Vector<Furniture> checkout= new Vector<Furniture>();
            sumpr =0;
        }
        void shopadd(Furniture f)
        {
            shop.add(f);
        }
        void shopshow()
        {
            System.out.println("Каталог"+'\n');
            for (int i =0 ; i< shop.size(); i++)
            {
                System.out.println(Integer.toString(i+1)+" "+shop.get(i).name+" цена" +shop.get(i).price);
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
            checount.add(count);
            checkout.add(f);
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
                 }
                 else System.out.println("Введено больше товара чем есть в корзине");
                 return;
                }
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}