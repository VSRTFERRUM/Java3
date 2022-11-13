public class Main {
    public static double pi=3.1459;
    static class Shape
    {
        int x,y;
        Shape()
        {
            x=0;
            y=0;
        }
        Shape(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
        void getType()
        {
                System.out.println("Точка");
        }
        public String toString()
        {
            return "Точка"+x+";"+y+ "с радиусом ";
        }
        double getPerimeter()
        {
            return 0;
        }
        double getArea()
        {
            return 0;
        }
    }
    static class Circle extends Shape
    {
        int rad;
        Circle(int rad)
        {
            x=0;
            y=0;
            this.rad=rad;
        }
        @Override
        public String toString()
        {
            return "Окружность c центром в "+x+";"+y+ "с радиусом " +rad;
        }
        @Override
        void getType()
        {
            System.out.println("Окружность");
        }
        @Override
        double getPerimeter()
        {
            return pi*2*rad;
        }
        double getArea()
        {
            return pi*rad*rad;
        }
    }
    static class Rectangle extends Shape
    {
        int xlegnth, yleght;
        Rectangle(int xlegnth, int yleght)
        {
            this.xlegnth=xlegnth;
            this.yleght=yleght;
            x=0;
            y=0;
        }
        @Override
        public String toString()
        {
            return "Прямоугольник c центром в "+x+";"+y+ "с длинной сторон " + xlegnth +';'+yleght;
        }
        @Override
        void getType()
        {
            System.out.println("Прямоугольник");
        }
        @Override
        double getPerimeter()

        {
        return 2*(xlegnth+yleght);
        }
        @Override
        double getArea()
        {
            return xlegnth*yleght;
        }
    }
    static class Square extends Shape
    {
        int xyleght;
        Square(int xyleght)
        {
            x=0;
            y=0;
            this.xyleght=xyleght;
        }
        @Override
        public String toString()
        {
            return "Квадрат c центром в "+x+";"+y+ "с длинной стороны " + xyleght;
        }
        @Override
        void getType()
        {
            System.out.println("Square");
        }
        @Override
        double getPerimeter()

        {
            return 4*(xyleght);
        }
        @Override
        double getArea()
        {
            return xyleght*xyleght;
        }

    }
    class Tester
    {
        public static void main(String[] args)
        {
            Shape sh =new Shape();
            sh.getType();
            System.out.println(sh.toString());
            System.out.println(sh.getArea());
            System.out.println(sh.getPerimeter());
            Circle cr =new Circle(10);
            cr.getType();
            System.out.println(cr.toString());
            System.out.println(cr.getArea());
            System.out.println(cr.getPerimeter());
            Rectangle rt =new Rectangle(4,5);
            rt.getType();
            System.out.println(rt.toString());
            System.out.println(rt.getArea());
            System.out.println(rt.getPerimeter());
            Square sq=new Square(4);
            sq.getType();
            System.out.println(sq.toString());
            System.out.println(sq.getArea());
            System.out.println(sq.getPerimeter());

        }
    }

}