public class Main {
    static enum season
    {
        Summer(22.3)
        {
            @Override
            void getDescription()
            {
                System.out.println("Warm season");
            }
        }, Fall(3.4), Winter(-17), Spring(8);
        double temp;
        season(double temp)
        {
            this.temp=temp;
        }

        void Ilove(season t)
        {
            switch (t)
            {
                case Summer -> System.out.println("I love "+ "Summer");
                case Fall -> System.out.println("I love "+ "Fall");
                case Winter -> System.out.println("I love "+"Winter");
                case Spring -> System.out.println("I love" + "Spring");
            }
        }
       void getDescription()
        {
            System.out.println("Cold season");
        }
    }
    public static void main(String[] args)
    {
        for (season s: season.values())
        {
            System.out.println(s +" "+ s.temp);
            s.getDescription();
        }
    }
}