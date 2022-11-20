public class Main {
   static abstract class transport
    {
        String name;
        double speed;
        double cost;
        double ltokm;
        int pascount;
        transport(String name, double speed, double cost,double ltokm, int pascount)
        {
            this.name=name;
            this.speed=speed;
            this.cost=cost;
            this.ltokm=ltokm;
            this.pascount=pascount;
        }
        double time (int km)
        {
            double time=km/speed;
            return time;
        }
        double cost(int km)
        {
            double cost=km*ltokm/pascount*this.cost;
            return cost;
        }
    }
    static class Car extends transport
    {
        Car(double speed, double cost,double ltokm, int pascount)
        {
            super("Car", speed, cost, ltokm, pascount);

        }
    }
    static class Plane extends transport
    {
        Plane(double speed, double cost,double ltokm, int pascount)
        {
            super("Plane", speed, cost, ltokm, pascount);
        }
        @Override
        double cost(int km)
        {
            double cost = km/(km/speed)*ltokm/pascount*this.cost;
            return cost;
        }
    }
    static class Train extends transport
    {

        Train( double speed, double cost, double ltokm, int pascount) {
            super("Train", speed, cost, ltokm, pascount);
        }
    }
    static class Sheep extends transport
    {

        Sheep( double speed, double cost, double ltokm, int pascount) {
            super("Sheep", speed, cost, ltokm, pascount);
        }
    }
    public static void main(String[] args)
    {
     Train t =new Train(90, 35,200,100000 );
     Car c = new Car(150,45, 10,5);
     Plane p = new Plane(750,100,40,1000);
     Sheep sh = new Sheep(100, 20,40,4000);
     System.out.println(t.time(1000)+" "+t.cost(1000));
     System.out.println(c.time(1000)+" "+c.cost(1000));
     System.out.println(p.time(1000)+" "+p.cost(1000));
     System.out.println(sh.time(1000)+" "+sh.cost(1000));
    }
}