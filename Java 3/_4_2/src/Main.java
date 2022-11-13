public class Main {
    enum sizes
    {
        XXS(32)
                {
                    @Override
                    void getDescription()
                    {
                        System.out.println("Детский размер");
                    }
                }, XS(34), S(36), M(38), L(40);
        int euroSize;
        sizes (int euroSize)
        {
            this.euroSize=euroSize;
        }
        void getDescription()
        {
            System.out.println("Взрослый размер");
        }
    }
    static interface Menclothing
    {
        static void dressMan()
        {

        }
    }
    static public interface Womenclothing
    {
        static void dressWoman()
        {

        }
    }
    static public abstract class Clothes
    {
        sizes size;
        double cost;
        String color;
        int sex;

    }
    static class Tshirt extends Clothes implements Menclothing , Womenclothing
    {
        Tshirt()
        {
            size=sizes.XXS;
            cost=0.0;
            color="black";
            sex=0;
        }

    }
    static class Pants extends Clothes implements Menclothing , Womenclothing
    {
        Pants()
        {
            size=sizes.XXS;
            cost=0.0;
            color="black";
            sex=0;
        }

    }
    static class Skirt extends Clothes implements Womenclothing
    {
        Skirt()
        {
            size=sizes.XXS;
            cost=0.0;
            color="black";
            sex=2;
        }

    }
    static class Tie extends Clothes implements Menclothing
    {
       Tie()
        {
            size=sizes.XXS;
            cost=0.0;
            color="black";
            sex=1;
        }

    }
    static class Atelier
    {
        void dressMan(Clothes[] t)
        {
            for (int i = 0; i<t.length;i++)
            {
             if(t[i].sex!=2) System.out.println(t[i].getClass()+" "+t[i].size+" "+t[i].cost+ " "+t[i].color);
            }

        }
        void dressWoman(Clothes[] t)
        {
            for (int i = 0; i<t.length;i++)
            {
                if(t[i].sex!=1) System.out.println(t[i].getClass()+" "+t[i].size+" "+t[i].cost+ " "+t[i].color);
            }
        }
    }
    public static void main(String[] args)
    {
        Atelier a = new Atelier();
        Clothes[] mas=new Clothes[4];
        mas[0]= new Tshirt();
        mas[1]=new Pants();
        mas[2]=new Skirt();
        mas[3]=new Tie();
        a.dressMan(mas);
        a.dressWoman(mas);
    }
}