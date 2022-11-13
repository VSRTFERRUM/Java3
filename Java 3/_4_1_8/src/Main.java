import java.util.Random;
public class Main
{
    public double pi =3.1459;
    Random rd = new Random();
     abstract class Shape {
         protected String color;
        protected boolean filled;

        Shape() {
            color = "Black";
            filled = false;
        }

        Shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }
        String getColor()
        {
             return color;
        }
        void setColor(String color)
        {
            this.color=color;
        }
        boolean ifFilled()
        {
            return filled;
        }
        void setFilled(boolean filled)
        {
            this.filled=filled;
        }
       abstract double getArea();

        abstract double getPerimeter();

         @Override
        public String toString()
        {
            return "Dot "+ " закрашена "+ filled+" цвет "+ color;
        }
    }
    class Circle extends Shape
    {
        double raduis;
        Circle()
        {
            super();
            raduis=rd.nextInt(0,1000);
        }
        Circle(String color, boolean filled, double radius)
        {
            this.color=color;
            this.filled=filled;
            this.raduis=radius;
        }
        double getRaduis()
        {
            return raduis;
        }
        void setRaduis(double radius)
        {
            this.raduis=radius;
        }

        @Override
        double getArea()
        {
          return pi*raduis*raduis;
        }

        @Override
        double getPerimeter() {
            return 2*pi*raduis;
        }
        @Override
        public String toString()
        {
            return "Circle"+" закрашена "+ filled+" цвет "+ color+" радиус "+raduis;
        }
    }
    class Rectangle extends Shape
    {
        double width, leghth;
        Rectangle()
        {
            super();
            leghth=rd.nextInt(0,1000);
            width=rd.nextInt(0,1000);
        }
        Rectangle(String color, boolean filled,double width, double leghth)
        {
        super(color, filled);
        this.width=width;
        this.leghth=leghth;
        }

        double getWidth()
        {
            return width;
        }
        double getLeghth()
        {
            return leghth;
        }
        void setWidth(double width) {
            this.width = width;
        }
        void setLeghth(double leghth) {
            this.leghth = leghth;
        }

        @Override
        double getArea() {
            return width*leghth;
        }
        @Override
        double getPerimeter()
        {
            return 2*(width+leghth);
        }
        @Override
        public String toString()
        {
            return "Rectangle"+" закрашена "+ filled+" цвет "+ color+" длинна "+ leghth +" ширина " +width;
        }
    }
    class Square extends Rectangle
    {
        Square()
        {
            super();
            width=rd.nextInt(0,1000);
            leghth=rd.nextInt(0,1000);
        }
        Square(double side)
        {
            super();
            leghth=side;
            width=side;
        }
        Square(String color, boolean filled,double side)
        {
            super(color, filled,side, side);
        }
        public String toString()
        {
            return "Rectangle"+" закрашена "+ filled+" цвет "+ color+" сторона "+ leghth ;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}